package w3;

import java.util.*;

public class HashMap_Many_Methods {
    public static void main(String[] args) {


    //mapMethods();
    //mapScanner();
        mapIterate();

    }
    static void mapMethods(){
        //Write a Java program to associate the specified value with the specified key in a Tree Map.

        HashMap<String,Integer> ageName = new HashMap<>();
        ageName.put("Fahad", 29);
        ageName.put("Urmy", 27);
        ageName.put("Ayesha", 23);
        ageName.put("Ahad", 20);
        System.out.println(ageName);

        //Write a Java program to count the number of key-value (size) mappings in a map
        System.out.println("The size of the pair is: "+ ageName.size());
        System.out.println();

        //Write a Java program to copy all of the mappings from the specified map to another map

        HashMap<String, Integer> copy = new HashMap<>();
        copy.putAll(ageName);
        System.out.println("After copying "+ copy);
        System.out.println();


        // Write a Java program to remove all of the mappings from a map

        copy.clear();
        System.out.println("After removing all elements in copy: "+ copy);
        System.out.println("Size after removing: "+ copy.size());
        System.out.println("is the map copy empty: "+ copy.isEmpty());
        System.out.println();

        //Write a Java program to check whether a map contains key-value mappings (empty) or not
        System.out.println("is fahad in the map? "+ ageName.containsKey("Fahad"));
        System.out.println();

        // Write a Java program to get a shallow copy of a HashMap instance. (making a clone to another HashMap)
        HashMap<Integer, String> clone = new HashMap<>();
        clone=(HashMap<Integer, String>) ageName.clone();   // this is how clone is done.
        System.out.println("After cloning ageName to clone map: clone = "+ clone);
        System.out.println();

        // Write a Java program to test if a map contains a mapping for the specified value
        System.out.println("is the map contain 29 "+ ageName.containsValue(29));
        System.out.println();

        //Write a Java program to create a set view of the mappings contained in a map
        // create set view for the map

        Set setView = ageName.entrySet();   // this is how to iterate in map
        System.out.println("the set view of the map: "+ setView);   //[Urmy=27, Ahad=20, Fahad=29, Ayesha=23]


    }
    static void mapScanner(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the key to see the value: ");
        Integer key = scan.nextInt();

        HashMap<Integer,Integer> num = new HashMap<>();
        num.put(1,10);
        num.put(2,200);
        num.put(3,3000);
        num.put(4,40);
        num.put(5,5000);
        System.out.println("\nThe value associated with the key is: "+ num.get(key));

        //Write a Java program to get a set view of the keys contained in this map
        Set setView = num.entrySet();
        System.out.println("The set view of this map is: "+ setView);

        //Write a Java program to get a collection view of the values contained in this map
        //Checking collection view of the map:
        System.out.println("\nCollection view: "+ num.values());        // collection view showing the values



        // Iterate over the keys: > using iterator.
        Iterator<Integer> it = num.keySet().iterator();
        while (it.hasNext()){
            Integer key1 = it.next();
            System.out.println("All the key: "+ key1);
        }





    }
    public static void mapIterate(){

        HashMap<Integer, String> areaZip = new HashMap<>();

        areaZip.put(10462, "Bronx");
        areaZip.put(10011, "Manhattan");
        areaZip.put(10112, "Astoria");
        areaZip.put(1920, "Wilmington");

        System.out.println(areaZip);

        // Iterate over map with Iterator > for Key
        Iterator<Integer> it = areaZip.keySet().iterator();
        while (it.hasNext()){
            Integer key = it.next();
            System.out.println(key);
        }

        System.out.println(areaZip.entrySet());
        System.out.println(areaZip.values());   // only showing value/ not iterating!

        // Iterating over se(pairs) by using entrySet:
        Iterator<Map.Entry<Integer, String>> it2 = areaZip.entrySet().iterator();
        while(it2.hasNext()){
            Map.Entry<Integer, String> entry = it2.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }

}
