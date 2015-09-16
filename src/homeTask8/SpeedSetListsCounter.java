package homeTask8;

import java.util.HashSet;
import java.util.TreeSet;


public class SpeedSetListsCounter {


    private HashSet myHashSet;
    private TreeSet myTreeSet;


    public SpeedSetListsCounter(){
                myHashSet = new HashSet() {{
                    add(1);
                    add(2);
                    add(3);
                    add(4);

                }};

                myTreeSet = new TreeSet(){{

                    add(1);
                    add(2);
                    add(3);
                    add(4);
                }};

    }

    public long getAddingSpeedToHashSet(){
        long startTime = System.nanoTime();
        for (int i = 0; i < 9999; i++) {
            myHashSet.add(i);
        }
        long EndTime = System.nanoTime();
        return EndTime - startTime;

    }
    public long getAddingSpeedToTreeSet(){
        long startTime = System.nanoTime();
        for (int i = 0; i < 9999; i++) {
            myHashSet.add(i);
        }
        long EndTime = System.nanoTime();
        return EndTime - startTime;

    }
    public long doSearchInHashSet(){
        long startTime = System.nanoTime();
        myHashSet.contains(2);
        long EndTime = System.nanoTime();
        return EndTime - startTime;


    }
    public long doSearchInTreeSet(){
        long startTime = System.nanoTime();
        myTreeSet.contains(2);
        long EndTime = System.nanoTime();
        return EndTime - startTime;
    }
    public long doRemoveInHashSet(){
        long startTime = System.nanoTime();
        myHashSet.remove(2);
        long EndTime = System.nanoTime();
        return EndTime - startTime;
    }
    public long doRemoveInTreeSet(){
        long startTime = System.nanoTime();
        myTreeSet.remove(2);
        long EndTime = System.nanoTime();
        return EndTime - startTime;
    }

}
