package practice_session.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<Integer> a1 = new LinkedList<>();    // in linkedList size can not be defined at the beginning, it will be defined when nodes are added
        LinkedList<Integer> a2 = new LinkedList<>(Arrays.asList(50,60,70,80,90));

        a1.add(10);
        a1.add(0,5);
        a1.addAll(a2);
        a1.add(3,70);

        a1.set(6,100);
        a1.forEach(n->show(n));


    }
    static void show(int n){
        if (n > 60){
            System.out.println(n);
        }
    }
}
