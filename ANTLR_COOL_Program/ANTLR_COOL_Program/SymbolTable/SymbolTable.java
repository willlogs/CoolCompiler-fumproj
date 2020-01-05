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
    }

    @Override
    public void enterClassDefine(COOLParser.ClassDefineContext ctx) {
        String[] tmp = new String[2];
        int i = 0;
        for(TerminalNode node : ctx.TYPEID()){
            tmp[i++] = node.getText();
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

    private void Addtable(ParserRuleContext ctx, String type, String id, String[] properties) {
        Table newtable = new Table(ctx, currNode, type, id, properties, ctx.getStart().getLine());
        currNode.decs.add(newtable);
        currNode = newtable;
    }

    private void ExitTable() {
        if (currNode.parent != null)
            currNode = currNode.parent;
    }
}
