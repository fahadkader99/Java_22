package practice_session.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        System.out.println("Size = "+a.size());

        a.add(10);
        a.add(20);
        a.add(30);
        a.add(2,50);
        System.out.println(a);
        System.out.println("Size = "+a.size());


        System.out.println("print using For each loop:  " );
        for (int x : a){
            System.out.print(x+ " ");
        }
        System.out.println();
        System.out.println("Size = "+a.size());

        System.out.println("\nPrinting using Iterator Method: ");
        Iterator itr = a.iterator();                                // Complex way of printing
        while (itr.hasNext()){
            System.out.print(itr.next()+ " ");
        }
        System.out.println("\n");

//        a.remove(0);
//        a.removeAll(a);
//        System.out.println("After removing 0 index "+a);
//        System.out.println(a.isEmpty());

        boolean con = a.contains(30);
        System.out.println("Does the list contains 30 : "+ con);



    }
}
