package practice_session.Set_Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Set_Methods<stat> {
    public static void main(String[] args) {

//        whatIsSet();
//        setOfMethod();
//        iterateSetMethod();
//       treeSetMethod();      // just to see how tree Set work
        //removeMethod();
        //clearMethod();
        //addAllMethod();
        //removeAll();
        //retainAll();
        containsMethod();




    }
    static void whatIsSet(){
        Set<String> name = new HashSet<>();

        name.add("Ashikul");
        name.add("Kader");
        name.add("Fahad");

        System.out.println(name);

        boolean added = name.add("Fahad");
        System.out.println("What the Fahad element added: "+ added);
        System.out.println("\n");

    }
    static void setOfMethod(){

        Set<String> n = Set.of("Ashikul","Kader","Fahad","1","!","2","4","3");

        System.out.println(n);
        System.out.println("The size of the set is: "+n.size());
        System.out.println("\n");

    }
    static void iterateSetMethod(){

        Set<String> set = Set.of("Ashikul","Kader","Fahad","1","!","2","4","3");

        Iterator<String> iterator = set.iterator();     // iterating using Iterator
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.print(next+" ");
        }
        System.out.println("\n");

        for (String x : set){               // iterating using for each loop
            System.out.print(x+" ");
        }

        System.out.println("\n");



    }
    static void treeSetMethod(){

        Set<String> set = new TreeSet<>();

        set.add("Ashikul");
        set.add("Kader");
        set.add("Fahad");
        set.add("4");
        set.add("2");

        System.out.println(set);
        System.out.println("Size of Tree Set "+ set);


        System.out.println("\n");

    }
    static void removeMethod(){

        Set<String> name = new HashSet<>();
        name.add("Ashikul ");
        name.add("Kader");
        name.add("Fahad");

        System.out.println(name);

        boolean isRemoved = name.remove("Fahad");
        boolean isRemoved1 = name.remove("1");

        System.out.println("Is Fahad removed: "+ isRemoved);
        System.out.println("Is Fahad removed: "+ isRemoved1);       // false: since 1 does not exist in the elements

        System.out.println("\n");
    }
    static void clearMethod(){
        Set<Integer> n = new HashSet<>(Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 10));

        System.out.println("all the elements are: "+ n);

        n.add(22);
        n.add(25);
        System.out.println(n);
       // n.removeAll(n);
        n.clear();
        System.out.println(n);
        boolean isEmpty = n.isEmpty();

        System.out.println("Is all the elements are empty ? "+ isEmpty);


    }
    static void addAllMethod(){      // by using add all we can also add other elements to the collections

        Set<Integer> n = new HashSet<>(Set.of(1,2,3,4,5,6,7,8,9));

        System.out.println("Before adding: "+ n);

        n.add(10);
        n.add(11);
        System.out.println(n);
        n.addAll(Set.of(11,12,13,14,15,16,5,6,7,8,9));

        System.out.println("After using addAll method "+ n);

        System.out.println("\n");

    }
    static void removeAll(){
        Set<Integer> n = new HashSet<>(Set.of(1,2,3,4,5,6,7,8,9,0));
        n.add(90);
        n.add(91);

        n.addAll(Set.of(11,12,14,13,16,15,2,3,4,5));

        System.out.println("After addAll "+ n);

        n.removeAll(Set.of(1,0,91,45));                // it removes the given set of elements
        System.out.println("After remove All "+ n);

    }
    static void retainAll(){        // confused about retainAll
        Set<String> word = new HashSet<>(Set.of("Ashikul","Kader","Fahad"));

        word.add("1");
        word.add("2");
        word.add("3");


        word.addAll(Set.of("1", "2", "abc","Fahad","XYZ"));

        System.out.println("After adding all these, elements are "+ word);

        boolean isRetained  = word.retainAll(Set.of("Fahad", "1","5", "95", "66"));

        System.out.println("After retainAll "+ isRetained);

        System.out.println(word);
        System.out.println("Is the collection is empty: "+ word.isEmpty());

    }
    static void containsMethod(){
        Set<String> word = new HashSet<>(Set.of("Ashikul","Kader","Fahad"));

        word.add("1");
        word.add("2");
        word.add("3");

        boolean contain1 = word.contains("1");
        boolean contain8 = word.contains("8");

        System.out.println(contain1);
        System.out.println(contain8);

        System.out.println("Is the collection contains Fahad : "+ word.contains("Fahad"));


    }
    static void setToList(){

    }


}
