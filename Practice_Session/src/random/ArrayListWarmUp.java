package random;

//import sun.tools.tree.ByteExpression;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListWarmUp {
    public static void main(String[] args) {

        //createList();
        //printList();
        //removeMethod();
        //setMethod();
        //equalMethod();
        //arrayToList();
        //sortMethod();
       // indexOfMethod();
        //equalsMethod();
        //ascendingAndDescendingSort();
        //autoBoxing();
        random();


    }
    static void createList(){
        ArrayList l1 = new ArrayList();
        ArrayList l2 = new ArrayList();
        ArrayList l3 = new ArrayList();
        ArrayList<String> l4 = new ArrayList<>();

        System.out.println(l1);
        System.out.println(l2.size());
        System.out.println(l1.equals(l2));

    }
    static void printList(){
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(2,15);
        a.remove(2);


        System.out.println(a);
    }
    static void removeMethod(){
        ArrayList<String> name = new ArrayList<>();
        name.add("Ashikul");
        name.add("Ashik");
        name.add("Ash");

        System.out.println(name);
        name.remove(2);
        System.out.println(name);

        for (String x : name){
            System.out.print(x+ " ");
        }

    }
    static void setMethod(){
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);

        System.out.println(a.get(2));
       a.set(1,25);
        System.out.println(a);

    }
    static void equalMethod(){
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();

        a.add("A");
        b.add("A");
        a.add("B");
        b.add("B");

        System.out.println(a);
        System.out.println(b);

        System.out.println("Is a and b equal: "+ a.equals(b));


    }
    public static void arrayToList(){               // converting array into list
        String[] a = {"Ashikul", "Kader","Fahad"};
        String[] b = {"Ashikul", "Kader","Fahad"};

        List<String> s1 = Arrays.asList(a);
        List<String> s2 = Arrays.asList(b);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.size());
        System.out.println(s1.equals(s2));

    }
    public static void sortMethod(){        // when sorting in list, we will need Collections
        List<Integer> n = new ArrayList<>();
        n.add(110);
        n.add(20);
        n.add(220);
        n.add(30);
        n.add(40);
        System.out.println(n);
        System.out.println(n.size());

        Collections.sort(n);
        System.out.println(n);


    }
    public static void indexOfMethod(){
        List<Integer> n = new ArrayList<>();
        n.add(300);
        n.add(110);
        n.add(20);
        n.add(220);
        n.add(30);
        n.add(40);

        int position =n.indexOf(2);
        System.out.println(position);
        Collections.sort(n);
        System.out.println(n);
        System.out.println(position);
        n.set(2, 22);
        System.out.println(n);


    }
    public static void equalsMethod(){
        List<String> a = Arrays.asList("Ashikul", "Kader","Fahad");
        List<String> b = Arrays.asList("Ashikul", "Kader","Fahad");
        ArrayList<String> c = new ArrayList<>();

        System.out.println(a);
        System.out.println(b);
        System.out.println(a.size());

        boolean isEqual = a.equals(b);
        System.out.println("Is a and b equal: "+ isEqual);

        c.addAll(a);            // addAll method
        System.out.println(c);
        if (a.equals(b)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

    }

    public static void ascendingAndDescendingSort(){
       ArrayList<Integer> n = new ArrayList<>();
       n.add(21);
        n.add(-100);
        n.add(-20);
        n.add(0);
        n.add(110);
        n.add(210);
        n.add(5);
        n.add(2);

        System.out.println("Before sorting "+ n);
        Collections.sort(n);
        System.out.println("After sorting "+ n);

        Collections.sort(n, Collections.reverseOrder());
        System.out.println("After reversing " + n);


    }
    static void autoBoxing(){   // primitive to obj
        int x = 10;
        Integer y = x;
        System.out.println(y);

        double d = 2.93d;
        Double d1 = d;
        System.out.println(d1);


        byte b = -32;
        Byte b1 = b;
        System.out.println(b1);


        Byte A = 32;
        byte c = A;
        System.out.println(c);

        Boolean bcc = true;
        boolean c1 = bcc;
        System.out.println(c1);


    }
    public static void random(){

        List<Double> l = new ArrayList<>();
        l.add(50.0);
        l.add(50.0);
        l.add(23.23);

        System.out.println(l);
        l.add(new Double(60));
        System.out.println(l);
        l.add(Double.valueOf(new Integer(23)));

    }


}
