package random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListWarmup2 {
    public static void main(String[] args) {
        //createList();
        //equalMethod();
        //asList1();
        sortM();

    }
    static void createList(){
        List<String> n = new ArrayList<>();
        n.add("Ashikul");
        n.add("Kader");
        n.add("Fahad");
        n.add(1,"+");
        n.remove(1);
        n.remove("Fahad");


        System.out.println(n);
        System.out.println(n.size());
        System.out.println("Is n empty "+ n.isEmpty());
        n.add("Fahad");
        System.out.println(n);

        boolean isFahad = n.contains("Fahad");
        System.out.println("Is the elements Fahad "+ isFahad);


    }

    static void equalMethod(){
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        a.add(1);
        a.add(2);

        b.add(1);
        b.add(2);

        System.out.println("Is a and b equal: "+ a.equals(b));

    }
    static void asList1(){
        String [] a = {"Ashikul", "Kader","Fahad"};
        String [] b = {"Ashikul", "Kader","Fahad"};

        List<String> a1 = new ArrayList<String>(Arrays.asList(a));    // now the Array is List and it is editable!
        List<String> b1 = new ArrayList<String>(Arrays.asList(b));


        a1.add("Jahan");
        a1.add(2,"Esrat");
        b1.add("Jahan");
        b1.add(2,"Esrat");

        a1.set(4,".");
        b1.set(4, ".");

        System.out.println(a1);
        System.out.println(b1);

        System.out.println("Is List a1 and b1 equal: "+ a1.equals(b1));


    }
    static void sortM(){                        // no way to convert primitive Array to LIst?
        int[] a = {1,2,6,8,9,2,3,4,5,6,9,0};
        List<Integer> b = Arrays.asList(1,2,6,8,9,2,3,4,5,6,9,0);
        System.out.println("Before sorting: "+b);
        Collections.sort(b);

        System.out.println("B =");
        for (int i = 0; i < b.size(); i++){
            System.out.print(i+ " ");
        }

        System.out.println("\nReverse using Collection");
        Collections.sort(b,Collections.reverseOrder());
        System.out.println(b);








        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        c.add(1);
        c.add(2);
        d.addAll(c);

        System.out.println(c);
        System.out.println("is list contains 2: "+ c.contains(1));
        System.out.println("What index is 2 at: "+ c.indexOf(2));
        System.out.println("D = "+ d);








    }
}
