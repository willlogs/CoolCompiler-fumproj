package ANTLR_COOL_Program.SymbolTable;

import ANTLR_COOL_Program.COOLParser;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.HashMap;
import java.util.LinkedList;
import static ANTLR_COOL_Program.COOLParser.*;

public class MethodUtility {

//    public Table[] paramters;
//
//    public MethodUtility(MethodContext ctx, Table par, String type, String id, String[] props, int line){
//        super(ctx, par, type, id, props, line);
//        paramters = new String[ctx.formal().size()];
//        for(int i =0; i < ctx.formal().size(); i++){
//            String parName = ctx.formal(i).OBJECTID().getSymbol().getText();
//            String parType = ctx.formal(i).TYPEID().getSymbol().getText();
//            paramters[i] = new Table(, , , , , )
//        }
//    }

    public static int ParamtersCount(Table methodTable){
        return ((MethodContext)methodTable.ctx).formal().size();
    }

    public static Table GetParamter(Table methodTable, int index){
        if(index >= 0 && index < ((MethodContext)methodTable.ctx).formal().size()){
            return methodTable.decs.get(index);
        }

        return null;
    }
}
