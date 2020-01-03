package ANTLR_COOL_Program.SymbolTable;

import java.util.*;

public class InheritanceCycleDetector {
    HashMap<String, Table> analysedClasses = new HashMap<String, Table>();

    // print error if the class is in the not-found inheritance cycle
    public void CheckCycle(Table startClassNode){
        if(analysedClasses.containsKey(startClassNode.id)){
            return;
        }

        Table programTable = startClassNode.parent;
        if(startClassNode.properties[1] == null){
            analysedClasses.put(startClassNode.id, startClassNode); //add to analysed classes
            return; //no cycle
        }
        else{
            Table baseClass = FindBaseClass(programTable, startClassNode.properties[1]);
            if(baseClass == null || analysedClasses.containsKey(baseClass.id)){    //base class not exist or analysed before
                analysedClasses.put(startClassNode.id, startClassNode); //add to analysed classes
                return;
            }
        }

        //the class has noy analysed before, so analyse it
        Table currentClass = startClassNode;
        HashMap<String, Table> inheritanceTree = new HashMap<String, Table>();
        ArrayList<String> classIds = new ArrayList<String>();

        //traverse through base classes path
        while(currentClass != null){
            if(inheritanceTree.containsKey(currentClass.id)){   //reached on of the traversed classes again
                //print error
                System.out.println("Error108 : invalid inheritance " + GetInheritancePath(classIds));
                break;
            }

            //track class path
            inheritanceTree.put(currentClass.id, currentClass);
            analysedClasses.put(currentClass.id, currentClass); //add to analysed classes
            classIds.add(currentClass.id);

            //get base class
            if(currentClass.properties[1] != null){
                currentClass = FindBaseClass(programTable, currentClass.properties[1]);
            }
            else{
                currentClass = null;
            }
        }
    }

    private String GetInheritancePath(ArrayList<String> classIds){
        String classPath = classIds.get(0);
        for(int i =1; i < classIds.size(); i++){
            classPath += " -> " + classIds.get(i);
        }
        classPath += " -> " + classIds.get(0);

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
