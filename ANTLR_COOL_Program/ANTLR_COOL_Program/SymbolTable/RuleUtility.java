package ANTLR_COOL_Program.SymbolTable;

import ANTLR_COOL_Program.COOLParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

import java.util.HashMap;
import java.util.LinkedList;
import static ANTLR_COOL_Program.COOLParser.*;

public class RuleUtility {
    public static int ParamtersCount(Table methodTable){
        return ((MethodContext)methodTable.ctx).formal().size();
    }

    public static Table GetParameter(Table methodTable, int index){
        if(index >= 0 && index < ((MethodContext)methodTable.ctx).formal().size()){
            return methodTable.decs.get(index);
        }

        return null;
    }

    public static String GetExpressionType(ExpressionContext ctx, Table currNode, IntRef errorLine){
        errorLine.value = ctx.getStart().getLine();
        if(ctx instanceof TrueContext || ctx instanceof FalseContext || ctx instanceof EqualContext
                || ctx instanceof LessThanContext || ctx instanceof LessEqualContext || ctx instanceof BoolNotContext
                || ctx instanceof  IsvoidContext){
            return "Bool";
        }
        else if(ctx instanceof IntContext || ctx instanceof MinusContext || ctx instanceof AddContext || ctx instanceof MultiplyContext
                || ctx instanceof DivisionContext || ctx instanceof NegativeContext){
            return "Int";
        }
        else if(ctx instanceof StringContext){
            return "String";
        }
        else if(ctx instanceof IdContext){
            Token idSymbol = ((IdContext)ctx).OBJECTID().getSymbol();
            errorLine.value = idSymbol.getLine();
            Table idTable = SymbolTableTraverser.FindSymbol(idSymbol.getText(), currNode);
            if(idTable != null && (idTable.type.equals("Variable") || idTable.type.equals("Property"))){
                return idTable.properties[0]; //type of variable or property
            }
        }
        else if(ctx instanceof ParenthesesContext){
            return GetExpressionType(((ParenthesesContext)ctx).expression(),currNode, errorLine);
        }
        else if(ctx instanceof NewContext){
            errorLine.value = ((NewContext)ctx).TYPEID().getSymbol().getLine();
            return ((NewContext)ctx).TYPEID().getSymbol().getText();
        }
        else if(ctx instanceof AssignmentContext){
            return "Void";
        }
        else if(ctx instanceof CaseContext){
            return FindCaseType((CaseContext)ctx, currNode, errorLine);
        }
        else if(ctx instanceof LetInContext){
            LetInContext letInCxt = (LetInContext)ctx;
            return GetExpressionType(letInCxt.expression(letInCxt.expression().size() - 1), currNode, errorLine);
        }
        else if(ctx instanceof BlockContext){
            BlockContext blockCtx = (BlockContext)ctx;
            int expressionCount = blockCtx.expression().size();
            for(int i = 0; i < expressionCount; i++){
                String expressionType = GetExpressionType(blockCtx.expression(i), currNode, errorLine);
                if(expressionType != null && !expressionType.equals("Void")){
                    return expressionType;
                }
            }
        }
        else if(ctx instanceof WhileContext){
            return GetExpressionType(((WhileContext)ctx).expression(1), currNode, errorLine);
        }
        else if(ctx instanceof IfContext){
            IfContext ifCtx = ((IfContext)ctx);
            String ifType = GetExpressionType(ifCtx.expression(1), currNode, errorLine);
            errorLine.value = ifCtx.expression(1).getStart().getLine();
            return ifType;
//            String elseType = GetExpressionType(ifCtx.expression(2), currNode, errorLine);
//            if(!ifType.equals(returnType)){ //IF statement: if not the same with method return type, return it to show the error
//                errorLine.value = ifCtx.expression(1).getStart().getLine();
//                return ifType;
//            }
//            else{   //return the expression type of "ELSE"
//                errorLine.value = ifCtx.expression(2).getStart().getLine();
//                return GetExpressionType(ifCtx.expression(2), currNode, errorLine);
//            }
        }
        else if(ctx instanceof MethodCallContext){
            String callerExprType = GetExpressionType(((MethodCallContext)ctx).expression(0), currNode, errorLine);
            Table callerClass = SymbolTableTraverser.FindType(callerExprType);
            if(callerClass != null){
                Table methodSymbol = SymbolTableTraverser.FindSymbol(((MethodCallContext)ctx).OBJECTID().getSymbol().getText()
                        , callerClass);
                if(methodSymbol != null && methodSymbol.type.equals("Method")){
                    errorLine.value = ((MethodCallContext)ctx).OBJECTID().getSymbol().getLine();
                    return methodSymbol.properties[0];
                }
            }
        }
        else if(ctx instanceof OwnMethodCallContext){
            Table methodSymbol = SymbolTableTraverser.FindSymbol(((OwnMethodCallContext)ctx).OBJECTID().getSymbol().getText()
                    , currNode);
            if(methodSymbol != null && methodSymbol.type.equals("Method")){
                errorLine.value = ((OwnMethodCallContext)ctx).OBJECTID().getSymbol().getLine();
                return methodSymbol.properties[0];
            }
        }

        return null;
    }

    static String FindCaseType(CaseContext caseCtx, Table currNode, RuleUtility.IntRef errorLine){
        String caseType = GetExpressionType(caseCtx.expression(0), currNode, errorLine);

        if(caseType != null && !caseType.equals("Void")){
            if(caseType.equals("Bool") || caseType.equals("Int") || caseType.equals("String")){
                int typeChecksSize = caseCtx.TYPEID().size();
                for(int i = 0; i < typeChecksSize; i++){
                    if(caseCtx.TYPEID(i).getSymbol().getText().equals("Object")){
                        errorLine.value = caseCtx.TYPEID(i).getSymbol().getLine();
                        return "Object";
                    }
                }
            }
            else{   //custom type: find least class which is greater than or equal to caseType
                Table typeTable = SymbolTableTraverser.FindType(caseType);
                while(typeTable != null){
                    if(IsInCaseTypeChecks(typeTable.id, caseCtx, errorLine)){
                        return typeTable.id;
                    }

                    //set it to it's parent
                    typeTable = SymbolTableTraverser.FindType(typeTable.properties[1]);
                }
            }
        }

        return null;
    }

    static Boolean IsInCaseTypeChecks(String typeText, CaseContext caseCtx, RuleUtility.IntRef errorLine){
        int typeChecksSize = caseCtx.TYPEID().size();
        for(int i =0; i< typeChecksSize; i++){
            if(typeText.equals(caseCtx.TYPEID(i).getSymbol().getText())){
                errorLine.value = caseCtx.TYPEID(i).getSymbol().getLine();
                return true;
            }
        }

        return false;
    }

    public static class IntRef{
        public int value;
        public IntRef(int value){this.value = value;}
    }
}
