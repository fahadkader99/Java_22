package collections_framework;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(10);
        pq.offer(20);
        pq.offer(3);
        pq.offer(40);
        pq.offer(7);
        pq.offer(1);


//        System.out.println(pq);
//        pq.poll();
//        System.out.println(pq.peek());
//        System.out.println(pq);

        System.out.println(pq);
        System.out.println(pq.peek());
        pq.poll();
        System.out.println(pq.peek());



    }
}
