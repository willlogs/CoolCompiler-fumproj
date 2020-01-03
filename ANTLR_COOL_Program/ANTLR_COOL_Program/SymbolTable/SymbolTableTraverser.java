package ANTLR_COOL_Program.SymbolTable;

import ANTLR_COOL_Program.COOLBaseListener;
import ANTLR_COOL_Program.COOLParser;

import java.util.Stack;

public class SymbolTableTraverser extends COOLBaseListener {
    Table programTable;
    Table currNode;
    Stack<Integer> traversedNodes = new Stack<Integer>();
    InheritanceCycleDetector inherCycleDetector = new InheritanceCycleDetector();

    public SymbolTableTraverser(Table programTable){
        this.programTable = programTable;
    }

    @Override
    public void enterProgram(COOLParser.ProgramContext ctx) {
        currNode = programTable;
        traversedNodes.push(0);
    }

    @Override
    public void enterClassDefine(COOLParser.ClassDefineContext ctx) {
        EnterTable();
        inherCycleDetector.CheckCycle(currNode);
    }

    @Override
    public void exitClassDefine(COOLParser.ClassDefineContext ctx) {
        ExitTable();
    }

    @Override
    public void enterMethod(COOLParser.MethodContext ctx) {
        EnterTable();
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
    public void exitProgram(COOLParser.ProgramContext ctx) {
        ExitTable();
        programTable.print(0);
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

}