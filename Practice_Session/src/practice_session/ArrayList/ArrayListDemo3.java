package practice_session.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo3 {
    public static void main(String[] args) {

//        ArrayList<Integer> n = new ArrayList<>();
//
//        n.add(-100);
//        n.add(-20);
//        n.add(0);
//        n.add(110);
//        n.add(210);
//        n.add(5);
//        n.add(2);
//
//        System.out.println("Before sorting: "+ n);
//
//        Collections.sort(n);                            // we can't keep sort in another variable.
//        System.out.println("After sorting: "+ n);   // Ascending sorting
//
//       Collections.sort(n,Collections.reverseOrder());
//       System.out.println("After Reverse sorting: "+ n);    // Reverse sorting / Descending sorting
//
        reverseM();




    }
    static void reverseM(){
        ArrayList<Integer> n = new ArrayList<>();
        n.add(100);
        n.add(-100);
        n.add(-20);
        n.add(0);
        n.add(110);
        n.add(210);
        n.add(5);
        n.add(2);

        System.out.println(n);
        System.out.println(n.size());

        Collections.sort(n);

        System.out.println(n);
        Collections.sort(n,Collections.reverseOrder());
        System.out.println(n);


    }

}
