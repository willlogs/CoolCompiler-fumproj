package ANTLR_COOL_Program.SymbolTable;

import ANTLR_COOL_Program.COOLParser;

import java.util.*;

public class InheritanceCycleDetector {
    HashMap<String, InheritanceCycleInfo> searchedClassTrees = new HashMap<String, InheritanceCycleInfo>();

    public boolean HasCycle(Table startClassNode){
        if(searchedClassTrees.containsKey(startClassNode.id)){ //the table has searched before
            return searchedClassTrees.get(startClassNode.id).hasCycle;
        }
        else{
            Table currentClass = startClassNode;
            Table previousClass = currentClass;
            Table programTable = currentClass.parent;
            HashMap<String, Table> classTree = new HashMap<String, Table>();
            boolean hasCycle = false;

            //traverse through base classes path
            while(currentClass != null){
                classTree.put(currentClass.id, currentClass);
                previousClass = currentClass;

                //has base class
                if(currentClass.properties[1] != null){
                    currentClass = FindBaseClass(programTable, currentClass.properties[1]);

                    if(startClassNode == currentClass){    //reached the start class again
                        hasCycle = true;
                        break;
                    }
                }
                else{
                    currentClass = null;
                }
            }

            //add table tree to searched table trees in order to not analyse them again
            InheritanceCycleInfo searchedClasses = new InheritanceCycleInfo(previousClass, hasCycle, classTree);
            searchedClassTrees.put(searchedClasses.rootClass.id, searchedClasses);

            return hasCycle;
        }
    }

    public String GetClassInheritancePath(Table currentClass){
        Table programTable = currentClass.parent;
        Table startCycleClass = currentClass;

        //add first class
        String classPath = currentClass.id;
        if(currentClass.properties[1] != null){
            currentClass = FindBaseClass(programTable, currentClass.properties[1]);
        }
        else{
            currentClass = null;
        }

        //traverse through base classes path
        while(currentClass != null){
            classPath += " -> " + currentClass.id;

            //has base class
            if(currentClass.properties[1] != null){
                currentClass = FindBaseClass(programTable, currentClass.properties[1]);

                if(startCycleClass == currentClass){    //reached the start class again
                    classPath += " -> " + currentClass.id;
                    break;
                }
            }
            else{
                currentClass = null;
            }
        }

        return classPath;
    }

    Table FindBaseClass(Table programTable, String baseName){
        Iterator<Table> iterator = programTable.decs.descendingIterator();

        while(iterator.hasNext()){
            Table currentClass = iterator.next();
            if(currentClass.id.equals(baseName)){
                return currentClass;
            }
        }

        return null;
    }
}

class InheritanceCycleInfo {
    public Table rootClass;
    public boolean hasCycle;
    public HashMap<String, Table> classTree;

    public InheritanceCycleInfo(Table rootClass, boolean hasCycle, HashMap<String, Table> classTree){
        this.rootClass = rootClass;
        this.hasCycle = hasCycle;
        this.classTree = classTree;
    }
}
