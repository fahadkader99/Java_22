package practice_session.ArrayList.W3;

import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ManyExerciseTogether {
    /*
    Write code that creates an ArrayList that can hold string objects.
    Add the names of three cars to the ArrayList, and then display the contents of the ArrayList.
     */
    public static void main(String[] args) {



        //insetList();
       // addElement3();
        array2();

    }
    static void insetList(){
        // how to add more than one element in a list?
        ArrayList<Integer> a = new ArrayList<>(List.of(1,2,3,4,5,6,6,7,8));
        ArrayList<Integer> b = new ArrayList<>(List.of(2,2,2,2,2,2,2));

        a.add(0);
        a.add(10);
        System.out.println(a);
        b.add(0);
        b.add(10);
        System.out.println(b);
        a.addAll(b);
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        for (int x : a){
            System.out.print(x+" ");
        }

    }
    static void addElement3(){
        //Write a Java program to insert an element into the array list at the first position

        List<Integer> a = new ArrayList<>(List.of(0,0,1,2,3,4,5,6,7,8));
        a.add(0,1);
        System.out.println("add element at the front"+a);

        //Write a Java program to retrieve an element (at a specified index) from a given array list


        System.out.println(a);
        System.out.println("get index 2 "+ a.get(7));

        //Write a Java program to update specific array element by given element

        System.out.println("update the element with 5 "+ a.set(0,100));


        // Write a Java program to remove the third element from a array list.

        a.remove(2);
        System.out.println(a);

        //Write a Java program to search an element in a array list
        System.out.println("search 100 from the list: T/ F = "+ a.contains(100));

        //Write a Java program to sort a given array list.

        Collections.sort(a);
        System.out.println("After sort"+a);

        //Write a Java program to copy one array list into another.
        List<Integer> b = new ArrayList<>();
        b.addAll(a);
        System.out.println("Copy a to b and b = "+b);

        //Write a Java program to shuffle elements in a array list.

        Collections.shuffle(b);
        System.out.println("After shuffling: "+ b);

        // Reverse order // W3 - 10
        Collections.sort(b,Collections.reverseOrder());
        System.out.println("After reversing B : "+ b);


    }
    static void array2(){

        // Write a Java program to extract a portion of a array list

        List<Integer> a = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
        System.out.println("The portion is: "+ a.subList(2,6));

        // Compare two array list:

        List<Integer> b = new ArrayList<>(List.of(2,3,4,5,6,7));

        boolean isSame = a.containsAll(b);
        System.out.println("Does a and b contains the same "+ isSame);

        // Write a Java program of swap two elements in an array list

        Collections.swap(a,0,2);
        System.out.println("After swapping "+ a);

        //Write a Java program to join two array lists.

        List<Integer> c = new ArrayList<>();

        c.addAll(a);
        c.addAll(b);
        System.out.println("After adding a and b into new list: "+ c);

        //Write a Java program to clone an array list to another array list

        List<Integer> d = new ArrayList<>(c);

        System.out.println(d);

        //Write a Java program to empty an array list.
        boolean isEm = d.isEmpty();
        System.out.println("Is d empty "+ isEm);
        d.removeAll(d);
        System.out.println("Is d empty? "+ d.isEmpty());

        //Write a Java program to trim the capacity of an array list the current list size

        ArrayList<Integer> a1 = new ArrayList<>(List.of(1,2,3,4,5,6,7,7,8,9));

        a1.trimToSize();
        System.out.println(a1);

        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Original array list: " + c1);
        System.out.println("Let trim to size the above array: ");
        c1.trimToSize();
        System.out.println(c1);

        //Write a Java program to increase the size of an array list.

        c1.ensureCapacity(10);
        System.out.println("THe size of array is: "+ c1.size());

        //Write a Java program to replace the second element of a ArrayList with the specified element

        a1.set(0,0);
        System.out.println("After replacing element 0 to 0 "+ a1);


        //Write a Java program to print all the elements of a ArrayList using the position of the elements.

        System.out.println("Print using the position of elements");
        int element = a1.size();
        for (int i = 0; i < element; i++){
            System.out.print(a1.get(i));
        }



    }


}
