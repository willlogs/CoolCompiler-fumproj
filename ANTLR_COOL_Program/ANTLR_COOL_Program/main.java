package ANTLR_COOL_Program;

import ANTLR_COOL_Program.SymbolTable.SymbolTable;
import ANTLR_COOL_Program.SymbolTable.SymbolTableTraverser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;

@SuppressWarnings("ALL")
public class main {
    public static void main(String[] args){
        translate();
    }

    public static void translate() {
        ANTLRInputStream input = null;
        try {
            input = new ANTLRInputStream(System.in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        COOLLexer lexer = new COOLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        COOLParser parser = new COOLParser(tokens);
        ParseTree tree = parser.program();

        ParseTreeWalker walker = new ParseTreeWalker();
        SymbolTable symbolTable = new SymbolTable();
        System.out.println("Creating Symbol Tables:======================================");
        walker.walk(symbolTable, tree);
        System.out.println("Analysing Symbol Tables:======================================");
        walker.walk(new SymbolTableTraverser(symbolTable.ProgramTable), tree);
        System.out.println();
    }
}
