package random;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDoIt {
    public static void main(String[] args) {

        hash1();


    }
    static void hash1(){
        HashMap<Integer, String> name = new HashMap<>();

        name.put(1,"Ash");
        name.put(2,"Kader");
        name.put(3,"Fahad");

        System.out.println(name);
        System.out.println(name.size());

        hashCopy(name);

    }
    static HashMap<Integer,String> hashCopy(HashMap<Integer, String> name){
        //hash1();
        System.out.println("\n||");
        HashMap<Integer, String> copy = new HashMap<>();

        copy.putAll(name);
        System.out.println(copy);
        copy.put(4, "Jahan");
        copy.put(5, "Esrat");

        System.out.println("is empty "+ copy.isEmpty());
        System.out.println(copy.containsValue("Ash"));
        System.out.println("Copy "+copy);

        HashMap<Integer, String> clone = new HashMap<>();
        clone = (HashMap<Integer, String>)copy.clone();     // clone one map to another.

        System.out.println("CLone = "+clone);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the key: ");
        Integer key = input.nextInt();


        System.out.println("The key is"+ clone.get(key));









        return clone;


    }
}
