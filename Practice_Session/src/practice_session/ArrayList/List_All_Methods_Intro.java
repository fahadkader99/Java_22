package practice_session.ArrayList;

import java.util.*;

public class List_All_Methods_Intro {
    public static void main(String[] args) {

        //createList();
        //addMethod();
        //waysOfPrintList();        // different ways of printing List.
        //removeMethod();
        //setMethod();
        //equalsMethod();
        //arrayToList();
        //sortMethod();
        //indexOfMethod();
        //equalMethodAndAddALl();
//        ascendingAndDescendingSort();
//        autoBoxing();
//        unBoxing();

        extraMethod();


    }

    static void createList() {
        ArrayList l1 = new ArrayList();
        ArrayList l2 = new ArrayList(10);
        ArrayList l3 = new ArrayList(l2);
        ArrayList<String> l4 = new ArrayList(); // right side <> is optional, but left side is must  specify

        System.out.println(l3);
        System.out.println(l3.size());
        System.out.println(l2.size());
        System.out.println(l2.equals(l3));
    }

    static void waysOfPrintList() {
        ArrayList<Integer> a = new ArrayList<>();
        System.out.println("Size = " + a.size());

        a.add(10);
        a.add(20);
        a.add(30);
        a.add(2, 50);
        System.out.println(a);
        System.out.println("Size = " + a.size());


        System.out.println("print using For each loop:  ");
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("Size = " + a.size());

        System.out.println("\nPrinting using Iterator Method: ");
        Iterator itr = a.iterator();                                // Complex way of printing (Using Iterator)
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println("\n");

        a.remove(0);
        a.removeAll(a);
        System.out.println("After removing 0 index " + a);
        System.out.println(a.isEmpty());
    }

    static void addMethod() {

        ArrayList l1 = new ArrayList();
        l1.add("Fahad");
        l1.add(Boolean.TRUE);
        System.out.println(l1);

        ArrayList<String> s = new ArrayList<>();
        s.add("Fahad");
        s.add("Kader");
        s.add("Ashikul");
        s.add("123");
        s.add(4, "@");
        s.add(3, "!");      //here by using array list i can add any string in any index, but using array this is complex
        System.out.println(s);
        System.out.println(l1.isEmpty());
        System.out.println();

    }

    public static void removeMethod() {
        ArrayList<String> s = new ArrayList<>(10);
        s.add("Fahad");
        s.add("Kader");
        s.add("Ashikul");
        s.add("Urmy");
        System.out.println(s);
        s.remove("Urmy");
        System.out.println(s.remove(1));
        System.out.println(s);
        System.out.println(s.remove("Fahad"));
        System.out.println(s);

    }

    static void setMethod() {

        ArrayList<String> s = new ArrayList<>();
        s.add("Ashikul");
        s.add("Kader");
        System.out.println(s.get(1));
        s.set(0, "Fahad");
        System.out.println(s);
        System.out.println(s.isEmpty());            // isEmpty method
        System.out.println(s.size());               // size method, which shows the length of the list

        s.add("Ash");
        s.add("B");
        s.add("c");
        System.out.println(s);
        //s.clear();                          // clear() method clean / remove all the elements
        System.out.println(s.contains("Fahad"));        // contain() method returns true or false


    }

    static void equalsMethod() {
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();

        a.add("A");
        b.add("A");
        a.add("B");
        b.add("B");


        System.out.println(a);
        System.out.println(b);
        System.out.println(a.equals(b));

    }

    static void arrayToList() {                     // tolist is used to convert array into list
        String s[] = {"Ashikul", "Kader", "Fahad"};
        String s2[] = {"Ashikul", "Kader", "Fahad"};


        List<String> s1 = new ArrayList<String>(Arrays.asList(s));      // now the array is List and we can modify it.
        List<String> s4 =  new ArrayList<String>(Arrays.asList(s2));
//        s1.add("28");
//        s1.remove(1);
        System.out.println(s1);
        System.out.println(s1.size());
        //s1.add("AB");
        //s1.remove();
        //System.out.println(s1);
        System.out.println(s1.equals(s4));      // even though the elements are same but s1 is List and s2 is Array. But if i conver both to list then it will work

    }

    static void sortMethod() {
        List<Integer> n = new ArrayList<>();
        n.add(1);
        n.add(2);
        n.add(3);
        n.add(9);
        n.add(7);
        n.add(8);
        System.out.println(n);
//        System.out.println(n.get(2));
        Collections.sort(n);                // sort with List requires help of Collections!
        System.out.println("After sorting with helper class Collections: " + n);

    }

    public static void indexOfMethod() {
        List<Integer> n = new ArrayList<>();
        n.add(1);
        n.add(0);
        n.add(2222);
        n.add(230);

        int position = n.indexOf(0);
        System.out.println("The given element is at index " + position);
        n.set(3, 99);
        System.out.println(n);
    }

    static void equalMethodAndAddALl() {
        ArrayList<Integer> n1 = new ArrayList<>();
        ArrayList<Integer> n2 = new ArrayList<>();
        ArrayList<Integer> n3 = new ArrayList<>();

        n1.add(10);
        n1.add(20);
        n1.add(30);
        n1.add(40);
        n1.add(50);
        System.out.println("The elements in n1 = " + n1);

        n2.add(10);
        n2.add(20);
        n2.add(30);
        n2.add(40);
        n2.add(50);
        System.out.println("The elements in n2 = " + n2);

        boolean isEqual = n1.equals(n2);
        System.out.println("Is n1 and n2 equal: " + isEqual);

        n3.addAll(n1);
        System.out.println("The elements in n3 = " + n3);    // this is how we can clone or copy to another list

        if (n1.equals(n3)) {              // list don't take == sign.
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if ((n1.equals(n2)) && (n2.equals(n3))) System.out.println("Horrraahh!!! All are equal in these 3 list");


    }
    public static void ascendingAndDescendingSort(){
        ArrayList<Integer> n = new ArrayList<>();

        n.add(-100);
        n.add(-20);
        n.add(0);
        n.add(110);
        n.add(210);
        n.add(5);
        n.add(2);

        System.out.println("Before sorting: "+ n);

        Collections.sort(n);                            // we can't keep sort in another variable.
        System.out.println("After sorting: "+ n);   // Ascending sorting

        Collections.sort(n,Collections.reverseOrder());
        System.out.println("After Reverse sorting: "+ n);    // Reverse sorting / Descending sorting
    }
    static void autoBoxing(){   // primitive to obj
        int x = 30;
        Integer y = Integer.valueOf(x);     // autoBoxing 1st way
        System.out.println(y);

        double d = 100.00d;
        Double D = d;           // autoboxing 2nd way, we can directly box it.
        System.out.println(D);
    }

    static void unBoxing(){     // obj to primitive
        Double D = 2.90;
        double d = D;                    // unboxing 1st way
        System.out.println(d);

        Boolean B = new Boolean(true);
        boolean b = B.booleanValue();           // unboxing 2nd way

        int i  = new Integer(2);


    }
    static void extraMethod(){
        ArrayList<Integer> n1 = new ArrayList<>();
        ArrayList<Integer> n2 = new ArrayList<>();
        ArrayList<Integer> n3 = new ArrayList<>();

        n1.add(10);
        n1.add(20);
        n1.add(30);
        n1.add(40);
        n1.add(50);
        n1.add(60);
        n1.add(70);
        System.out.println("The elements in n1 = " + n1);

        n2.add(10);
        n2.add(20);
        n2.add(30);
        n2.add(40);
        n2.add(50);
        System.out.println("The elements in n2 = " + n2);

//        n1.removeAll(n2);       // removeAll, removes all the element on n1, which is already there in n2.
//        System.out.println(n1);

//        n2.retainAll(n1);           // retainAll will retain or bring back all the elements which are already in both places and rest will be deletec
//        System.out.println(n2);

        System.out.println("Is n1 contains all n2:"+ n2.containsAll(n1));       // will check is n1 all obj is present in n2? // false

    }

}