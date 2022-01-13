package practice_session.Set_Collections;

import java.util.*;

public class w3Exercise {
    public static void main(String[] args) {

        //hash1();
        //hash2();
        random();


    }
    static void hash1(){    // Set has no index and it is unique.

        //Write a Java program to append the specified element to the end of a hash set
        HashSet<Integer> a = new HashSet<Integer>(Set.of(1,2,3,4,56));
        a.add(5);
        System.out.println(a);
        TreeSet<Integer> b = new TreeSet<>(a);
        b.add(6);
        System.out.println(b);


        HashSet<String> s = new HashSet<String>();
        s.add("Blue");
        s.add("Yellow");
        s.add("Red");
        s.add("Pink");

        System.out.println(s);
        // a Java program to iterate through all elements in a hash list
        for (String x:s){
            System.out.print(x+" ");
        }

        //Write a Java program to get the number of elements in a hash set
        System.out.println("The number of elements are: "+ s.size());

        //Write a Java program to empty an hash set.
        System.out.println("Is the set empty: "+ s.isEmpty());
        // test is empty or not
        s.removeAll(s);
        System.out.println("Is the set empty: "+ s.isEmpty());

        // Write a Java program to clone a hash set to another hash set.

        HashSet<Integer> d = new HashSet<>(b);
        System.out.println(d);

        //Write a Java program to convert a hash set to an array.                       <<<< >>>>>>

        Integer [] q = new Integer[d.size()];
        d.toArray(q);
        System.out.println("HashSet converted into Array: "+Arrays.toString(q));


        //Write a Java program to convert a hash set to a tree set.

        HashSet<Integer> a1 = new HashSet<Integer>(Set.of(10,20,30,40,50));
        TreeSet<Integer> t = new TreeSet<>(a1);

        System.out.println("HashSet to TreeSet "+ t);

        //Write a Java program to convert a hash set to a List/ArrayList                 <<<< >>>>>
        List<Integer> l = new ArrayList<Integer>(a1);
        System.out.println("HashSet to List: "+l);
        l.add(0,1);
        Collections.sort(l);
        System.out.println(l);                              // Q, why not the sorting is not working from List to set?
        HashSet<Integer>h = new HashSet<Integer>(l);
        System.out.println("List to HashSet "+ h);

        //Write a Java program to compare two hash set.
        HashSet<Integer> a2 = new HashSet<Integer>(Set.of(10,20,30,40,50));

        System.out.println("Is a1 equals to a2 "+ a.equals(a2));            // This is not the correct way to check


    }
    static void hash2(){

        ////Write a Java program to compare two hash set.

        HashSet<String> h = new HashSet<>();
        h.add("Ashikul");
        h.add("Kader");
        h.add("Fahad");

        System.out.println(h);

        HashSet<String> h1 = new HashSet<>();
        h1.add("Ashikul");
        h1.add("Kader");
        h1.add("Fahad");
        h1.add("Mr");
        System.out.println(h1);

        System.out.println("Does h contains elements of h1: "+ h1.contains(h));     // this is not right way to chack contains elements
        for (String element : h){                           // we need to use for loop for checking contains elements in HashSet.
            System.out.println(h1.contains(element)+ " ");
        }

        // Write a Java program to compare two sets and retain elements which are same on both sets


        System.out.println("H set "+ h);
        System.out.println("H1 set "+ h1);
        h.retainAll(h1);                            // this is how to retain all.
        System.out.println("retain all: "+ h);

        //Write a Java program to remove all of the elements from a hash set.

        HashSet<Integer> a1 = new HashSet<Integer>(Set.of(10,20,30,40,50));
        a1.removeAll(a1);
        System.out.println("Is a1 empty: "+ a1.isEmpty());


    }
    static void random(){
        //Write a Java program to get the value of a specified key in a map.

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Ball");
        map.put(2, "Bat");
        map.put(3, "Cat");
        map.put(4, "Dog");
        System.out.println("Get the value of a key "+ map.get(1));

        //Write a Java program to get a set view of the keys contained in this map.

        map.entrySet();
        System.out.print("SetView: "+ map);

       // Write a Java program to get a collection view of the values contained in this map

        map.values();
        System.out.println("\nCollection view: "+ map);

        map.keySet();
        System.out.println("\nKeySet view: "+ map);



    }

}
