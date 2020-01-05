package ANTLR_COOL_Program.SymbolTable;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Table {
    public ParserRuleContext ctx;
    public ArrayList<Table> decs;
    public Table parent;
    public String type;
    public String id;
    public String[] properties;
    public int occuranceLine = 0;
    public static Table mainMethod;

    public Table(ParserRuleContext ctx, Table par, String type, String id, String[] props, int line){
        this.ctx = ctx;
        parent = par;
        decs = new ArrayList<Table>();
        this.type = type;
        this.id = id;
        properties = props;
        occuranceLine = line;
        mainMethod = null;
    }

    public void print(int indent){
        for(int i = 0; i < indent; i++)    System.out.print("  ");
        System.out.print(type + " " + id + ": ");

        if(properties != null){
            if(properties[0] != null){
                System.out.print(properties[0]);
            }
            for(int i =1; i < properties.length; i++){
                if(properties[i] != null){
                    System.out.print(", " + properties[i]);
                }
            }
            System.out.println();
        }

        for(Table t : decs){
            t.print(indent + 1);
        }
    }

    public void CheckDecs(){
        CheckClassDoubleDec();
        CheckFeatureDoubleDec();
        MainFuncExistanceCheck();
        if(mainMethod == null){
            System.out.println("Error104 : Can not find main method");
        }
    }

    protected void MainFuncExistanceCheck(){
        for(Table t : decs){
            if(t.type.equals("Method") && t.id.equals("main")){
                mainMethod = t;
            }
            else{
                t.MainFuncExistanceCheck();
            }
        }
    }

    private void CheckClassDoubleDec(){
        for(Table t : decs){
            if(t.type == "Class"){
                CheckClassDuplicate(t);
            }
        }
    }

    private void CheckClassDuplicate(Table cls){
        boolean foundItself = false;
        for(Table table : decs){
            if(table == cls) {
                foundItself = true;
                continue;
            }

            if(!foundItself && table.type == "Class"){
                if(table.id.equals(cls.id)){
                    System.out.println("Error101 in line "+ cls.occuranceLine + " , " + cls.id + " has been defined already");
                }
            }
        }
    }

    protected void CheckFeatureDoubleDec(){
        for(Table t : decs){
            if(t.type == "Method" || t.type == "Property"){
                CheckFeatureDuplicate(t, false);
            }
            else{
                t.CheckFeatureDoubleDec();
            }
        }
    }

    protected void CheckFeatureDuplicate(Table feat, boolean foundItself){
        for(Table table : decs){
            if(!foundItself && table == feat){
                foundItself = true;
                continue;
            }

            if(!foundItself && table.id.equals(feat.id)){
                String tmp = table.type == "Method"?"102":"103";
                System.out.println("Error" + tmp + ": in line " + feat.occuranceLine + " , " + feat.id + " has been defined already");
            }else{
                for(Table dec : table.decs){
                    dec.CheckFeatureDuplicate(feat, foundItself);
                }
            }
        }
    }
}
