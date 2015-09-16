package homeTask8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SpeedListsCounter {

    private ArrayList listArr;
    private LinkedList listLinked;

    public SpeedListsCounter(){

        listArr = new ArrayList(){{
            add(1);
            add(2);
            add(3);
            add(4);
        }};

        listLinked = new LinkedList(){{
            add(1);
            add(2);
            add(3);
            add(4);
        }};
    }

    public long getAddingSpeedToArrayList(){
        long startTime = System.nanoTime();

        for(int i = 0; i < 9999; i++ ){

             listArr.add(i);

         }

        long endTime = System.nanoTime();

        return endTime - startTime;

    }

    public long getAddingSpeedToLinkedList(){
        long startTime = System.nanoTime();

        for(int i = 0; i < 9999; i++ ){

            listLinked.add(i);

        }

        long endTime = System.nanoTime();

        return endTime - startTime;

    }

    public long doSearchInArrayList(){
        long startTime = System.nanoTime();
        listArr.contains(1);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public long doSearchInLinkedList(){
        long startTime = System.nanoTime();
        listLinked.contains(1);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public long doRemoveInArrayList(){
        long startTime = System.nanoTime();
        listArr.remove("1");
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public long doRemoveInLinkedList(){
        long startTime = System.nanoTime();
        listLinked.remove("1");
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
