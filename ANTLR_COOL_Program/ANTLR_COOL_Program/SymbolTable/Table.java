package ANTLR_COOL_Program.SymbolTable;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.LinkedList;
import java.util.List;

public class Table {
    public ParserRuleContext ctx;
    public LinkedList<Table> decs;
    public Table parent;
    public String type;
    public String id;
    public String[] properties;

    public Table(ParserRuleContext ctx, Table par, String type, String id, String[] props){
        this.ctx = ctx;
        parent = par;
        decs = new LinkedList<Table>();
        this.type = type;
        this.id = id;
        properties = props;
    }

    public void print(int intent){
        for(int i = 0; i < intent; i++)    System.out.print("  ");
        System.out.print(type + " " + id + ": ");
        if(properties.length > 1) System.out.println(properties[1]);
        else System.out.println(properties[0]);
        for(Table t : decs){
            t.print(intent + 1);
        }
    }
}
