package jan_23;

import java.util.*;

public class ReadOnlyCollection {
    // how to make a collection read only in java

    public static void main(String[] args) {
        // so java collection have some read only prebuilt methods

        List<Integer> list = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<Integer>();

        //readList(list);
        readSet(set);

    }

    static void readList(List<Integer> list){
        for (int i = 0; i<= 10; i++){
            list.add(i);
        }
        System.out.println(list);

        // now modify
        list.set(0,99);
        System.out.println(list);

        // make it read-only & then try to update the list

        try {
            list = Collections.unmodifiableList(list);
            list.remove(0);
        }catch (Exception e){
            System.out.println("\nException is: " + e);
        }
        finally {
            System.out.println("Read only: "+list);

        }
    }

    static void readSet(Set<Integer> set){
        for (int i = 0; i<=5; i++){
            set.add(i);
        }
        System.out.println(set);

        // update the set
        set.add(99);

        // make the set read only
        try {
            set = Collections.unmodifiableSet(set);
            set.clear();
        }catch (UnsupportedOperationException e){
            System.out.println("\nException : " + e);
        }finally {
            System.out.println("Read only: " + set);
        }
    }
}
