package ANTLR_COOL_Program.SymbolTable;

import ANTLR_COOL_Program.COOLBaseListener;
import ANTLR_COOL_Program.COOLParser;

import java.util.Iterator;
import java.util.Stack;

public class SymbolTableTraverser extends COOLBaseListener {
    static Table programTable;
    Table currNode;
    Stack<Integer> traversedNodes = new Stack<Integer>();
    InheritanceCycleDetector classUtility = new InheritanceCycleDetector();
    MethodReturnTypeChecker methodReturnChecker = new MethodReturnTypeChecker();

    public SymbolTableTraverser(Table programTable){
        SymbolTableTraverser.programTable = programTable;
    }

    @Override
    public void enterProgram(COOLParser.ProgramContext ctx) {
        currNode = programTable;
        traversedNodes.push(0);
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
        methodReturnChecker.CheckMethodReturnType(ctx, currNode);
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
        //programTable.print(0);
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

    public static Table FindType(String typeText){
        Iterator<Table> iterator = programTable.decs.descendingIterator();

        while(iterator.hasNext()){
            Table currentClass = iterator.next();
            if(currentClass.id.equals(typeText)){
                return currentClass;
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