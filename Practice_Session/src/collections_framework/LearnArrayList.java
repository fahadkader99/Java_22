package collections_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {
//        String[] students = new String[30];
//
//        students[29] = "Fahad";
//        students[30] = "kader";
//
//        System.out.println(Arrays.toString(students));
//
//        ArrayList<String> students = new ArrayList<>();
//        students.add("Ash");
//        students.add("Kad");
//        students.add("Fahad");
//        System.out.println(students);
//        students.add(1, "Jahan");    // this is method overloading
//        System.out.println(students);
//
//        List<String> name = new ArrayList<>();
//        name.add("a");
//        name.add("b");
//        name.add("c");
//
//        students.addAll(name);
//        System.out.println(students);
//
//        System.out.println(students.get(1));
//        System.out.println(students.remove("Fahad"));
//        System.out.println(students);


        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

//        System.out.println(list.remove(1));
//        System.out.println(list.remove(Integer.valueOf(10)));
//        System.out.println(list);

        list.set(0,5);
        System.out.println(list);

        System.out.println(list.contains(50));


        // iterate over:

        for (int i = 0; i < list.size(); i++) {       // for loop
            System.out.println("For : "+ list.get(i));
        }

        for(Integer x : list){      // for each loop
            System.out.println("For Each : "+ x);
        }

        Iterator<Integer> it = list.listIterator();     // Iterator
        while (it.hasNext()){
            System.out.println("Iterator : "+ it.next());
        }


    }
}
