package homeTask8;

import java.util.HashMap;
import java.util.TreeMap;

public class SpeedMapCounter {

    private HashMap<Integer,String> myHashMap;
    private TreeMap<Integer,String>  myTreeMap;

    public SpeedMapCounter(){
        myHashMap = new HashMap();

            myHashMap.put(1, "5");
            myHashMap.put(2, "6");
            myHashMap.put(3, "8");
            myHashMap.put(4, "65");



        myTreeMap = new TreeMap();

            myTreeMap.put(1, "5");
            myTreeMap.put(2, "6");
            myTreeMap.put(3, "8");
            myTreeMap.put(4, "65");


    }

    public long getAddingSpeedToHashMap(){
        long startTime = System.nanoTime();
        for (int i = 0; i < 9999; i++) {
            myHashMap.put(i, "u");
        }
        long EndTime = System.nanoTime();
        return EndTime - startTime;

    }
    public long getAddingSpeedToTreeMap(){
        long startTime = System.nanoTime();
        for (int i = 0; i < 9999; i++) {
                myTreeMap.put(i, "u");
        }
        long EndTime = System.nanoTime();
        return EndTime - startTime;

    }
    public long doSearchInHashMap(){
        long startTime = System.nanoTime();
        for (int i = 0; i < 9999; i++) {
            myHashMap.get(i);
        }
        long EndTime = System.nanoTime();
        return EndTime - startTime;


    }
    public long doSearchInTreeMap(){
        long startTime = System.nanoTime();
        for (int i = 0; i < 9999; i++) {
            myTreeMap.get(i);
        }

        long EndTime = System.nanoTime();
        return EndTime - startTime;
    }
    public long doRemoveInHashMap(){
        long startTime = System.nanoTime();
        for (int i = 0; i < 9999; i++) {
            myHashMap.remove(i);
        }

        long EndTime = System.nanoTime();
        return EndTime - startTime;
    }
    public long doRemoveInTreeMap(){
        long startTime = System.nanoTime();
        for (int i = 0; i < 9999; i++) {
            myTreeMap.remove(i);
        }

        long EndTime = System.nanoTime();
        return EndTime - startTime;
    }


}
