package collections_framework;

import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {

        ArrayDeque<Integer> dp = new ArrayDeque<>();
        dp.offerFirst(10);
        dp.offerFirst(12);
        dp.offerLast(5);
        dp.offerLast(40);

        System.out.println(dp);
        System.out.println(dp.peekFirst());
        System.out.println(dp.peekLast());


        System.out.println(dp.pollFirst());
        System.out.println(dp.pollLast());

        System.out.println(dp.peekFirst());
        System.out.println(dp.peekLast());


    }
}
