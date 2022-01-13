package practice_session.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {

        equalMethodAndAddALl();





    }
    static void equalMethodAndAddALl(){
        ArrayList<Integer> n1 = new ArrayList<>();
        ArrayList<Integer> n2 = new ArrayList<>();
        ArrayList<Integer> n3 = new ArrayList<>();

        n1.add(10);
        n1.add(20);
        n1.add(30);
        n1.add(40);
        n1.add(50);
        System.out.println("The elements in n1 = "+ n1);

        n2.add(10);
        n2.add(20);
        n2.add(30);
        n2.add(40);
        n2.add(50);
        System.out.println("The elements in n2 = "+ n2);

        boolean isEqual = n1.equals(n2);
        System.out.println("Is n1 and n2 equal: "+ isEqual);

        n3.addAll(n1);
        System.out.println("The elements in n3 = "+ n3);    // this is how we can clone or copy to another list

       if (n1.equals(n3)){              // list don't take == sign.
           System.out.println("True");
       }else {
           System.out.println("False");
       }

       if ((n1.equals(n2)) && (n2.equals(n3))) System.out.println("Horrraahh!!! All are equal in these 3 list");


    }
}
