package practice_session.Queue;

import java.util.ArrayDeque;

public class DeQueueDemo {
    public static void main(String[] args) {

        // DeQueue add all elements in the constant time.

       ArrayDeque<Integer> dq = new ArrayDeque<>();
       dq.offerLast(10);    // instead of addLast used offerLast, since addLast throws exception if the value is null
       dq.offerLast(20);
       dq.offerLast(30);
       dq.offerLast(40);

       dq.pollLast();   // it deletes from last. when insert and delete from the last that is called stack/ LIFO
       dq.pollFirst(); // delete from first. when insert from first and delete from last that is called Queue. /
        System.out.println("OfferLast / add last");
       for (Integer x : dq){
           System.out.print(x+" ");     //10 20 30 40
       }


        System.out.println("\nOffer First or add First");
       dq.offerFirst(1);
       dq.offerFirst(2);
       dq.offerFirst(3);
       dq.offerFirst(4);

       for (Integer x: dq){
           System.out.print(x+" ");     //4 3 2 1 10 20 30 40
       }
    }
}
