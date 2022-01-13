package random;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SomeTreeSet {

    public static void main(String[] args) {

        //tree1();
        tree2();

    }

    static void tree1(){

        TreeSet<Integer> a = new TreeSet<>(Set.of(1,2,3,4,5,55,23));

//        a.add(1);
//        a.add(4);
//
//        System.out.println(a);
//
//
//        for (Integer x : a){
//            System.out.print(x+" ");
//        }

        System.out.println("\n1st element "+a.first());
        System.out.println("Last element: "+ a.last());

//        Scanner input = new Scanner(System.in);
//        System.out.println("\nElements are"+ a);
//        System.out.println("Enter the element to remove: ");
//        Integer key = input.nextInt();
//
//        a.remove(key);
//        System.out.println("After removing key "+ a);

        System.out.println("number strickly higher: "+ a.higher(5));
        System.out.println("number strickly lower: "+ a.lower(1));






    }
    static void tree2(){
        // Write a Java program to get the element in a tree set which is greater than or equal to the given element
        TreeSet<Integer> a = new TreeSet<>(Set.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
        System.out.println("Elements: "+ a);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the key: ");
        Integer key = input.nextInt();

        System.out.println("\nElement greater than the key");

        for (Integer x : a){
            if ( x >= key){
                System.out.print(x+" ");
            }

        }
        System.out.println("\nElement smaller than key ");
        for (int i = 0; i< a.size(); i++){
            if (i <= key){
                System.out.print(i+" ");
            }
        }

    }


}
