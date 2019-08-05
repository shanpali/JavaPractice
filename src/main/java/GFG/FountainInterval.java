package GFG;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.LinkedList;

public class FountainInterval {

    int n = 4;
    int[] interval = {2,4,6,8};

@Test
    public void test(){
    ArrayList al = new ArrayList();
    al.add(3);
    al.add(2);
    al.add(1);
    al.add(4);
    al.add(5);
    al.add(6);
    al.add(6);

    al.forEach(n -> System.out.println(n));
//    Iterator iter1 = al.iterator();
//    while(iter1.hasNext()){
//        System.out.println(iter1.next());
//    }
}

@Test
    public void testtime(){
    ArrayList arrayList = new ArrayList();
    LinkedList linkedList = new LinkedList();

// ArrayList add
    long startTime = System.nanoTime();

    for (int i = 0; i < 100000; i++) {
        arrayList.add(i);
    }
    long endTime = System.nanoTime();
    long duration = endTime - startTime;
    System.out.println("ArrayList add:  " + duration);

// LinkedList add
    startTime = System.nanoTime();

    for (int i = 0; i < 100000; i++) {
        linkedList.add(i);
    }
    endTime = System.nanoTime();
    duration = endTime - startTime;
    System.out.println("LinkedList add: " + duration);

// ArrayList get
    startTime = System.nanoTime();

    for (int i = 0; i < 10000; i++) {
        arrayList.get(i);
    }
    endTime = System.nanoTime();
    duration = endTime - startTime;
    System.out.println("ArrayList get:  " + duration);

// LinkedList get
    startTime = System.nanoTime();

    for (int i = 0; i < 10000; i++) {
        linkedList.get(i);
    }
    endTime = System.nanoTime();
    duration = endTime - startTime;
    System.out.println("LinkedList get: " + duration);


// ArrayList remove
    startTime = System.nanoTime();

    for (int i = 9999; i >=0; i--) {
        arrayList.remove(i);
    }
    endTime = System.nanoTime();
    duration = endTime - startTime;
    System.out.println("ArrayList remove:  " + duration);

// LinkedList remove
    startTime = System.nanoTime();

    for (int i = 9999; i >=0; i--) {
        linkedList.remove(i);
    }
    endTime = System.nanoTime();
    duration = endTime - startTime;
    System.out.println("LinkedList remove: " + duration);
}

}
