package homeTask8;


import java.util.HashMap;
import java.util.Map;

public class Runner {


    public static void main(String[] args) {
        SpeedListsCounter speedListsCounter = new SpeedListsCounter();
        SpeedSetListsCounter speedSetListsCounter = new SpeedSetListsCounter();
        SpeedMapCounter speedMapCounter = new SpeedMapCounter();



        System.out.println("adding speed to array list: " + speedListsCounter.getAddingSpeedToArrayList() +  "\n"+
                " adding speed to linked list: " + speedListsCounter.getAddingSpeedToLinkedList() +"\n"+
                " search speed to array list: " + speedListsCounter.doSearchInArrayList() +"\n"+
                " search speed to linked list: " + speedListsCounter.doSearchInLinkedList()+"\n"+
                " removing speed to array list: " + speedListsCounter.doRemoveInArrayList()+"\n"+
                " removing speed to linked list: "+ speedListsCounter.doRemoveInLinkedList());

        System.out.println("adding speed to HashSet: " + speedSetListsCounter.getAddingSpeedToHashSet() +"\n"+
                " adding speed to TreeSet: " + speedSetListsCounter.getAddingSpeedToTreeSet() +"\n"+
                " search speed to HashSet: " + speedSetListsCounter.doSearchInHashSet() +"\n"+
                " search speed to TreeSet: " + speedSetListsCounter.doSearchInTreeSet()+"\n"+
                " removing speed to HashSet: " + speedSetListsCounter.doRemoveInHashSet()+"\n"+
                " removing speed to TreeSet: "+ speedSetListsCounter.doRemoveInTreeSet());

       System.out.println("adding speed to HashMap: " + speedMapCounter.getAddingSpeedToHashMap() +"\n"+
                " adding speed to TreeMap: " + speedMapCounter.getAddingSpeedToTreeMap() +"\n"+
                " search speed to HashMap: " + speedMapCounter.doSearchInHashMap() +"\n"+
                " search speed to TreeMap: " + speedMapCounter.doSearchInTreeMap()+"\n"+
                " removing speed to HashMap: " + speedMapCounter.doRemoveInHashMap()+"\n"+
                " removing speed to TreeMap: "+ speedMapCounter.doRemoveInTreeMap());
    }
}
