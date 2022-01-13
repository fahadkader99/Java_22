package collections_framework;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(12);
        queue.offer(20);
        queue.offer(30);
        queue.add(40);

        System.out.println(queue);

    }
}
