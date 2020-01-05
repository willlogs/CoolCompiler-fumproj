package ANTLR_COOL_Program.SymbolTable;

import org.antlr.v4.runtime.Token;

import static ANTLR_COOL_Program.COOLParser.*;

public class MethodReturnTypeChecker {
    int errorLine;
    String returnType;

    public void CheckMethodReturnType(MethodContext ctx, Table currNode) {
        returnType = ctx.TYPEID().getSymbol().getText();
        String invokedReturnType = GetExpressionType(ctx.expression(), currNode);
        //if invokedReturnType is null it means another syntax error is happening and return type has no meaning
        if(invokedReturnType != null && !returnType.equals(invokedReturnType)){
            System.out.println(String.format("Error 210: in line [%1$s], method [%3$s], return type [%2$s] must be of type [%4$s]", errorLine
                    , invokedReturnType, ctx.OBJECTID().getSymbol().getText(), returnType));
        }
    }

    String GetExpressionType(ExpressionContext ctx, Table currNode){
        errorLine = ctx.getStart().getLine();
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
            errorLine = idSymbol.getLine();
            Table idTable = SymbolTableTraverser.FindSymbol(idSymbol.getText(), currNode);
            if(idTable != null && (idTable.type.equals("Variable") || idTable.type.equals("Property"))){
                return idTable.properties[0]; //type of variable or property
            }
        }
        else if(ctx instanceof ParenthesesContext){
            return GetExpressionType(((ParenthesesContext)ctx).expression(),currNode);
        }
        else if(ctx instanceof NewContext){
            errorLine = ((NewContext)ctx).TYPEID().getSymbol().getLine();
            return ((NewContext)ctx).TYPEID().getSymbol().getText();
        }
        else if(ctx instanceof AssignmentContext){
            return "Void";
        }
        else if(ctx instanceof CaseContext){
            return FindCaseType((CaseContext)ctx, currNode);
        }
        else if(ctx instanceof LetInContext){
            LetInContext letInCxt = (LetInContext)ctx;
            return GetExpressionType(letInCxt.expression(letInCxt.expression().size() - 1), currNode);
        }
        else if(ctx instanceof BlockContext){
            BlockContext blockCtx = (BlockContext)ctx;
            int expressionCount = blockCtx.expression().size();
            for(int i = 0; i < expressionCount; i++){
                String expressionType = GetExpressionType(blockCtx.expression(i), currNode);
                if(expressionType != null && !expressionType.equals("Void")){
                    return expressionType;
                }
            }
        }
        else if(ctx instanceof WhileContext){
            return GetExpressionType(((WhileContext)ctx).expression(1), currNode);
        }
        else if(ctx instanceof IfContext){
            IfContext ifCtx = ((IfContext)ctx);
            String ifType = GetExpressionType(ifCtx.expression(1), currNode);
            if(!ifType.equals(returnType)){ //IF statement: if not the same with method return type, return it to show the error
                errorLine = ifCtx.expression(1).getStart().getLine();
                return ifType;
            }
            else{   //return the expression type of "ELSE"
                errorLine = ifCtx.expression(2).getStart().getLine();
                return GetExpressionType(ifCtx.expression(2), currNode);
            }
        }
        else if(ctx instanceof MethodCallContext){
            Table methodSymbol = SymbolTableTraverser.FindSymbol(((MethodCallContext)ctx).OBJECTID().getSymbol().getText()
                    , currNode);
            if(methodSymbol != null && methodSymbol.type.equals("Method")){
                errorLine = ((MethodCallContext)ctx).OBJECTID().getSymbol().getLine();
                return methodSymbol.properties[0];
            }
        }
        else if(ctx instanceof OwnMethodCallContext){
            Table methodSymbol = SymbolTableTraverser.FindSymbol(((OwnMethodCallContext)ctx).OBJECTID().getSymbol().getText()
                    , currNode);
            if(methodSymbol != null && methodSymbol.type.equals("Method")){
                errorLine = ((OwnMethodCallContext)ctx).OBJECTID().getSymbol().getLine();
                return methodSymbol.properties[0];
            }
        }

        return null;
    }

    String FindCaseType(CaseContext caseCtx, Table currNode){
        String caseType = GetExpressionType(caseCtx.expression(0), currNode);

        if(caseType != null && !caseType.equals("Void")){
            if(caseType.equals("Bool") || caseType.equals("Int") || caseType.equals("String")){
                int typeChecksSize = caseCtx.TYPEID().size();
                for(int i = 0; i < typeChecksSize; i++){
                    if(caseCtx.TYPEID(i).getSymbol().getText().equals("Object")){
                        errorLine = caseCtx.TYPEID(i).getSymbol().getLine();
                        return "Object";
                    }
                }
            }
            else{   //custom type: find least class which is greater than or equal to caseType
                Table typeTable = SymbolTableTraverser.FindType(caseType);
                while(typeTable != null){
                    if(IsInCaseTypeChecks(typeTable.id, caseCtx)){
                        return typeTable.id;
                    }

                    //set it to it's parent
                    typeTable = SymbolTableTraverser.FindType(typeTable.properties[1]);
                }
            }
        }

        return null;
    }

    Boolean IsInCaseTypeChecks(String typeText, CaseContext caseCtx){
        int typeChecksSize = caseCtx.TYPEID().size();
        for(int i =0; i< typeChecksSize; i++){
            if(typeText.equals(caseCtx.TYPEID(i).getSymbol().getText())){
                errorLine = caseCtx.TYPEID(i).getSymbol().getLine();
                return true;
            }
        }

        return false;
    }
}
