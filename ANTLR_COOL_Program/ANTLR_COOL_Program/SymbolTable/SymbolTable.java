package ANTLR_COOL_Program.SymbolTable;

import ANTLR_COOL_Program.COOLBaseListener;
import ANTLR_COOL_Program.COOLParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.LinkedList;

public class SymbolTable extends COOLBaseListener {
    public Table ProgramTable;
    public Table currNode;

    private String[] emptyStringArr = {""};

    private void createTable(ParserRuleContext ctx){

    }

    @Override
    public void enterProgram(COOLParser.ProgramContext ctx) {
        ProgramTable = new Table(ctx, null, "Program", "Program", emptyStringArr, ctx.getStart().getLine());
        currNode = ProgramTable;
        AddDefaultTypes();
    }

    @Override
    public void enterClassDefine(COOLParser.ClassDefineContext ctx) {
        String[] tmp = new String[1];
        if(ctx.TYPEID().size() > 1){
            tmp[0] = ctx.TYPEID(1).getSymbol().getText();
        }
        Addtable(ctx, "Class", ctx.TYPEID().get(0).getText(), tmp);
    }

    @Override
    public void exitClassDefine(COOLParser.ClassDefineContext ctx) {
        ExitTable();
    }

    @Override
    public void enterMethod(COOLParser.MethodContext ctx) {
        String[] tmp = new String[1];
        tmp[0] = ctx.TYPEID().getText();
        Addtable(ctx, "Method", ctx.OBJECTID().getText(), tmp);
    }

    @Override
    public void exitMethod(COOLParser.MethodContext ctx) {
        ExitTable();
    }

    @Override
    public void enterProperty(COOLParser.PropertyContext ctx) {
        String[] tmp = new String[1];
        tmp[0] = ctx.TYPEID().getText();
        Addtable(ctx, "Property", ctx.OBJECTID().getText(), tmp);
    }

    @Override
    public void exitProperty(COOLParser.PropertyContext ctx) {
        ExitTable();
    }

    @Override
    public void exitProgram(COOLParser.ProgramContext ctx) {
        //ProgramTable.print(0);
        ProgramTable.CheckDecs();
    }

    //method parameter definition
    @Override
    public void enterFormal(COOLParser.FormalContext ctx){
        String parName = ctx.OBJECTID().getSymbol().getText();
        String[] temp = new String[2];
        temp[0] =  ctx.TYPEID().getSymbol().getText();  //paramter type
        temp[1] =  "Paramter";
        Table methodParamter = new Table(ctx, currNode, "Variable", parName, temp, ctx.getStart().getLine());
        currNode.decs.add(methodParamter);  //add to method table
    }

    //method local variable definition
    @Override
    public void enterLetIn(COOLParser.LetInContext ctx){
        int defCount = ctx.OBJECTID().size();

        for(int i =0; i < defCount; i++){
            String[] properties = new String[1];
            properties[0] = ctx.TYPEID(i).getSymbol().getText();    //local var type
            Table localVar = new Table(null /*no rule it's a termianl*/, currNode, "Variable", ctx.OBJECTID(i).getSymbol().getText()
                , properties, ctx.OBJECTID(i).getSymbol().getLine());
            currNode.decs.add(localVar);
        }
    }

    private void Addtable(ParserRuleContext ctx, String type, String id, String[] properties) {
        Table newtable = new Table(ctx, currNode, type, id, properties, ctx.getStart().getLine());
        currNode.decs.add(newtable);
        currNode = newtable;
    }

    private void ExitTable() {
        if (currNode.parent != null)
            currNode = currNode.parent;
    }

    private void AddDefaultTypes() {
//        String[] properties = new String[1];    //no base class
//        //add Int
//        Table intClass = new Table(null, ProgramTable, "Class", "Int", properties, 0);
//        //add String
//        Table stringClass = new Table(null, ProgramTable, "Class", "String", properties, 0);
//        //add Object
//        Table objectClass = new Table(null, ProgramTable, "Class", "Object", properties, 0);
//        ProgramTable.decs.add(intClass);
//        ProgramTable.decs.add(stringClass);
//        ProgramTable.decs.add(objectClass);
    }
}
