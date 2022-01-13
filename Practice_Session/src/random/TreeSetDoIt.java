package random;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSetDoIt {
    public static void main(String[] args) {

    //tree1();
    //ree2();
    treeSet1();

    }
    static TreeMap<Integer, String > tree1(){
        TreeMap<Integer, String> tree = new TreeMap<>();

        tree.put(1,"Ash");
        tree.put(2,"Kad");
        tree.put(3,"Fahad");
        tree.put(4,"Jahan");

        System.out.println(tree);
        Scanner input = new Scanner(System.in);

        //Integer key = input.nextInt();

        //String value = input.nextLine();
        System.out.println("Enter the key ");
        System.out.println("The key value map: "+ tree.containsKey(input.nextInt()));
//        System.out.println(tree);
//        System.out.println("Enter the value: ");
//
//        System.out.println(tree);
        System.out.println("Enter key ");
        System.out.println("Get key: "+ tree.get(input.nextInt()));

        System.out.println("Enter key, value to Delete");
        System.out.println("The value is: "+ tree.remove(input.nextInt(), input.nextLine()));

        System.out.println(tree);


        return tree;


    }

    static void tree2(){
        //Write a Java program to search a value in a Tree Map
        TreeMap<Integer, String> tree = new TreeMap<>();

        tree.put(1,"Ash");
        tree.put(2,"Kad");
        tree.put(3,"Fahad");
        tree.put(4,"Jahan");

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the value to look for");
//        String val = input.next();
//
//        if (tree.containsValue(val)){
//            System.out.println("THe map contains the value ");
//        }else {
//            System.out.println("Not contained");
//        }

//        tree.clear();
//        System.out.println("After clear: "+ tree);

        System.out.println("The first: "+ tree.firstKey());
        System.out.println("first: "+ tree.firstEntry());

        System.out.println("last "+ tree.lastKey());
        System.out.println("last "+ tree.lastEntry());






    }
    static void treeSet1(){
        TreeSet<Integer> tree = new TreeSet<>(Set.of(1,2,3,4,5,6));
        tree.add(6);
        tree.add(7);
        System.out.println(tree);
        TreeSet<Integer> a = new TreeSet<>(Set.of(2,5,6,1,30,70,110));
        System.out.println(a);

        System.out.println(a.ceiling(99));
        System.out.println(a.floor(90));



    }


}
