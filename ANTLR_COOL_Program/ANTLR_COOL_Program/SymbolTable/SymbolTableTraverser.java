package ANTLR_COOL_Program.SymbolTable;

import ANTLR_COOL_Program.COOLBaseListener;
import ANTLR_COOL_Program.COOLParser;
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

    public static Table FindType(String typeText){
        for(int i=0; i< programTable.decs.size(); i++){
            if(typeText.equals(programTable.decs.get(i).id)){
                return programTable.decs.get(i);
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

        //find in parent
        if(currentTable.parent != null){
            return  FindSymbol(symbolText, currentTable.parent);
        }

        return null;
    }
}