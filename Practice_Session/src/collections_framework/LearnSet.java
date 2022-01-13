package collections_framework;

import java.util.HashSet;
import java.util.Set;

public class LearnSet {

    public static void main(String[] args) {
//
//        Set<Integer> set = new HashSet<>();
//
//        set.add(10);
//        set.add(9);
//        set.add(5);
//        set.add(22);
//        set.add(19);
//        set.add(11);
//        set.add(5);     // duplicates are not added.
//
//
//
//        set.remove(5);
//        System.out.println(set);
//        System.out.println(set.contains(12));
//        System.out.println(set.isEmpty() );

        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student("fahad", 10));
        studentSet.add(new Student("Kader", 20));
        studentSet.add(new Student("Ash",30));


        System.out.println(studentSet);
    }
}
