package ANTLR_COOL_Program.SymbolTable;

import ANTLR_COOL_Program.COOLBaseListener;
import ANTLR_COOL_Program.COOLParser;
import org.antlr.v4.tool.Rule;

import static ANTLR_COOL_Program.COOLParser.*;

import java.util.Stack;

public class SymbolTableTraverser extends COOLBaseListener {
    static Table programTable;
    Table currNode;
    Stack<Integer> traversedNodes = new Stack<Integer>();
    InheritanceCycleDetector classUtility = new InheritanceCycleDetector();

    public SymbolTableTraverser(Table programTable){
        SymbolTableTraverser.programTable = programTable;
    }

    @Override
    public void enterProgram(COOLParser.ProgramContext ctx) {
        currNode = programTable;
        traversedNodes.push(0);
    }

    @Override
    public void exitProgram(COOLParser.ProgramContext ctx) {
        ExitTable();
        //programTable.print(0);
    }

    @Override
    public void enterClassDefine(COOLParser.ClassDefineContext ctx) {
        EnterTable();
        CheckBaseClassType(ctx);
        classUtility.CheckCycle(currNode);
    }

    @Override
    public void exitClassDefine(COOLParser.ClassDefineContext ctx) {
        ExitTable();
    }

    @Override
    public void enterMethod(COOLParser.MethodContext ctx) {
        EnterTable();
        CheckMethodReturnType(ctx, currNode);
    }

    @Override
    public void exitMethod(COOLParser.MethodContext ctx) {
        ExitTable();
    }

    @Override
    public void enterProperty(COOLParser.PropertyContext ctx) {
        EnterTable();
    }

    @Override
    public void exitProperty(COOLParser.PropertyContext ctx) {
        ExitTable();
    }

    @Override
    public void enterMethodCall(COOLParser.MethodCallContext ctx){
        CheckMethodParamMatching(ctx,currNode);
    }

    @Override
    public void enterAssignment(COOLParser.AssignmentContext ctx){
        CheckAssignmentTypes(ctx, currNode);
    }

    @Override
    public void enterAdd(AddContext ctx){
        CheckBinaryOperandTypes(ctx.expression(0), ctx.expression(1));
    }

    @Override
    public void enterMinus(MinusContext ctx){
        CheckBinaryOperandTypes(ctx.expression(0), ctx.expression(1));
    }

    @Override
    public void enterMultiply(MultiplyContext ctx){
        CheckBinaryOperandTypes(ctx.expression(0), ctx.expression(1));
    }

    @Override
    public void enterDivision(DivisionContext ctx){
        CheckBinaryOperandTypes(ctx.expression(0), ctx.expression(1));
    }

    @Override
    public void enterNegative(NegativeContext ctx){
        CheckUnaryOperationType(ctx.expression(),"Int", "Negative");
    }

    @Override
    public void enterBoolNot(BoolNotContext ctx){
        CheckUnaryOperationType(ctx.expression(), "Bool", "Bool Not");
    }

    private void EnterTable(){
            //enter next current node's childs
            currNode = currNode.decs.get(traversedNodes.peek());

            //traversedNodes.peek()++
            int updatedTraversedNodes = traversedNodes.pop() + 1;
            traversedNodes.push(updatedTraversedNodes);

            //enter new table node
            traversedNodes.push(0);
    }

    private void ExitTable() {
        if (currNode.parent != null){
            currNode = currNode.parent;
        }
        traversedNodes.pop();
    }

    void CheckAssignmentTypes(COOLParser.AssignmentContext ctx, Table currNode){
        RuleUtility.IntRef errorLine = new RuleUtility.IntRef(ctx.getStart().getLine());
        String leftVar = ctx.OBJECTID().getSymbol().getText();
        String rightExpr = RuleUtility.GetExpressionType(ctx.expression(), currNode, errorLine);
        Table leftTable = FindSymbol(leftVar, currNode);
        String leftType;
        if(leftTable.type.equals("Class")){
            leftType = leftTable.id;
        }
        else{
            leftType = leftTable.properties[0];
        }
        if(!leftType.equals(rightExpr)){
            System.out.println(String.format("Error 230: in line [%1$s] incompatible types, [%2$s] can not be converted to [%3$s]"
                    ,errorLine.value, rightExpr, leftType));
        }
    }

    void CheckMethodParamMatching(MethodCallContext ctx, Table currNode){
        Table methodDef = FindSymbol(ctx.OBJECTID().getSymbol().getText(), currNode);
        if(methodDef != null){
            int methodArgCount = ctx.expression().size() - 1/*method object owner ref*/;
            MethodContext methodDefCtx = (MethodContext)methodDef.ctx;
            if(methodArgCount == methodDefCtx.formal().size()){
                for(int i =0; i < methodArgCount; i++){
                    RuleUtility.IntRef errorLine = new RuleUtility.IntRef(ctx.getStart().getLine());
                    String exprType = RuleUtility.GetExpressionType(ctx.expression(i + 1), currNode, errorLine);
                    String paramType = RuleUtility.GetParameter(methodDef, i).properties[0];
                    if(!paramType.equals(exprType)){
                        System.out.println(String.format("Error 220: in line [%1$s] mismatch agruments"
                                ,errorLine.value));
                        break;
                    }
                }
            }
            else{
                System.out.println(String.format("Error 220: in line [%1$s] mismatch agruments"
                        ,ctx.getStart().getLine()));
            }

        }
    }

    void CheckMethodReturnType(MethodContext ctx, Table currNode) {
        String returnType = ctx.TYPEID().getSymbol().getText();
        RuleUtility.IntRef errorLine = new RuleUtility.IntRef(0);
        String invokedReturnType = RuleUtility.GetExpressionType(ctx.expression(), currNode, errorLine);
        //if invokedReturnType is null it means another syntax error is happening and return type has no meaning
        if(invokedReturnType != null && !returnType.equals(invokedReturnType)){
            System.out.println(String.format("Error 210: in line [%1$s], method [%3$s], return type [%2$s] must be of type [%4$s]"
                    , errorLine.value, invokedReturnType, ctx.OBJECTID().getSymbol().getText(), returnType));
        }
    }

    private void CheckBinaryOperandTypes(ExpressionContext leftOperand, ExpressionContext rightOperand){
        RuleUtility.IntRef errorLine = new RuleUtility.IntRef(0);
        String leftType = RuleUtility.GetExpressionType(leftOperand, currNode, errorLine);
        String rightType = RuleUtility.GetExpressionType(rightOperand, currNode, errorLine);
        String operationType = RuleUtility.GetBinaryOperationType(leftType, rightType, currNode, errorLine);

        if(operationType == null){
            System.out.println(String.format("Error 240: in line [%1$s], operation not defined on type [%2$s] and [%3$s]"
                ,errorLine.value, leftType, rightType));
        }
    }

    private void CheckUnaryOperationType(ExpressionContext operand, String desiredType, String operatorName){
        RuleUtility.IntRef errorLine = new RuleUtility.IntRef(0);
        String opType = RuleUtility.GetExpressionType(operand, currNode, errorLine);

        if(opType != null && !opType.equals(desiredType)){
            System.out.println(String.format("Error 250: in line [%1$s], operation [%2$s] not defined on type [%3$s]"
                    ,errorLine.value, operatorName, opType));
        }
    }

    private void CheckBaseClassType(ClassDefineContext ctx){
        if(ctx.TYPEID(1) != null){
            String baseClassName = ctx.TYPEID(1).getSymbol().getText();
            if(baseClassName.equals("Int") || baseClassName.equals("String") || baseClassName.equals("Bool")){
                System.out.println(String.format("Error 260: in line [%1$s], class [%2$s] can not inherit from class [%3$s]"
                        ,ctx.TYPEID(0).getSymbol().getLine(), ctx.TYPEID(0).getSymbol().getText(), baseClassName));
            }
        }
    }

    public static Table FindType(String typeText){
        if(typeText != null){
            for(int i=0; i< programTable.decs.size(); i++){
                if(typeText.equals(programTable.decs.get(i).id)){
                    return programTable.decs.get(i);
                }
            }
        }

        return null;
    }

    public static Table FindSymbol(String symbolText, Table currentTable){
        for(Table table : currentTable.decs){
            if(table.id.equals(symbolText)){
                return table;
            }
        }

        //find in base classes members
        if(currentTable.type.equals("Class")){
            Table baseClass = FindType(currentTable.properties[0]);
            if(baseClass != null){
                return FindSymbol(symbolText, baseClass);
            }
        }

        //find in parent
        if(currentTable.parent != null){
            return FindSymbol(symbolText, currentTable.parent);
        }

        return null;
    }
}