package practice_session.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

class MyCom implements Comparator<Integer>{         // we are creating Max value comparator, where big num will have higher priority

    public int compare(Integer o1, Integer o2){     // reversing the priority
        if (o1 < o2) return 1;
        if (01 > o2) return -1;
        return 0;
    }
}
public class PriorityQueue_Demo {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>(new MyCom());   // created objected and calling the upper class.

        p.add(20);
        p.add(10);
        p.add(30);
        p.add(5);
        p.add(15);
        p.add(3);
//        p.remove();

        System.out.println(p.peek());
        System.out.println(p.poll());
//        p.forEach((x)-> System.out.print(x));   // lamda expression

        for (Integer x : p){
            System.out.print(x+" ");
        }


// Priority queue can be used for Heap
        // to have higher value to have higher priority we will need Comparator class

    }
}
