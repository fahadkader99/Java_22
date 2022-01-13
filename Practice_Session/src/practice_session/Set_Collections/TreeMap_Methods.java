package practice_session.Set_Collections;

import java.util.Comparator;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap_Methods {
    public static void main(String[] args) {

       //treeMap1();
        //mapMethod2();
        //greatestKey();
       // keyScan();
        treeMap3();


    }

    static void treeMap1(){

        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "Ashikul");
        map.put(2, "Kader");
        map.put(3,"Fahad");
        map.put(4, "Mr");
        System.out.println(map);

        //Write a Java program to copy a Tree Map content to another Tree Map
        TreeMap<Integer, String > a = new TreeMap<>();
        a.putAll(map);
        System.out.println("After copying map to a: "+ a);

        //Write a Java program to search a key in a Tree Map.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the key you are looking for: ");
        Integer key = scan.nextInt();

        System.out.println("Search by key: "+ map.get(key));
        System.out.println("Search by key: "+ map.containsKey(key));




    }
    static void mapMethod2(){

        //Write a Java program to search a value in a Tree Map
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "Ashikul");
        map.put(2, "Kader");
        map.put(3,"Fahad");
        map.put(4, "Mr");
        System.out.println(map);

        //Write a Java program to search a value in a Tree Map - 4
        if (map.containsValue("Ashikul")){
            System.out.println("Contains Ashikul");
        }else {
            System.out.println("Contains Kader");
        }
        if (map.containsValue("Fahad")){
            System.out.println("Contains Fahad");
        }else{
            System.out.println("Contain Mr");
        }

        //Write a Java program to get all keys from the given a Tree Map.
        System.out.println(map.keySet());

        //Write a Java program to delete all elements from a given Tree Map
        map.clear();
        System.out.println("After clearing all elements "+map);



    }
    static void sortKeys(){     // Tough
        //Write a Java program to sort keys in Tree Map by using comparator .. > DID not got it!

        TreeMap<Integer, String> a = new TreeMap<>();
        a.put(3, "Ashikul");
        a.put(1, "Kader");
        a.put(2, "Fahad");
        a.put(4, "FahadKader");

        class sort_key implements Comparator<String>{

            @Override
            public int compare(String str1, String str2) {
                return str1.compareTo(str2);
            }
        }

    }
    static void greatestKey(){
        // Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map
        TreeMap<Integer, String> a = new TreeMap<>();
        a.put(3, "Ashikul");
        a.put(1, "Kader");
        a.put(2, "Fahad");
        a.put(4, "FahadKader");
        System.out.println("The treemap contents: "+ a);
        System.out.println("The greatest key: "+ a.firstEntry());   // the greatest key
        System.out.println("The least key: "+ a.lastEntry());       // the least key

        //Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.

        System.out.println("The first key: "+ a.firstKey());
        System.out.println("The last key: "+ a.lastKey());

        // Write a Java program to get a reverse order view of the keys contained in a given map.

        System.out.println("Print in reversed order: "+ a.descendingKeySet());  // reversing key Set


    }
    static void keyScan(){      // <<<<<<<<<<<<<<<< tough >>>>>>>>>>>>>>>>>
        //Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key
        Scanner scan = new Scanner(System.in);
        TreeMap<Integer, String > a  = new TreeMap<>();
        a.put(3, "Ashikul");
        a.put(1, "Kader");
        a.put(2, "Fahad");
        a.put(4, "FahadKader");
        a.put(5, "Urmy");
        a.put(6, "JAhan");
        a.put(7, "Store");
        a.put(8, "Meta");

        System.out.println("Enter the key [1-8] ");
        Integer key = scan.nextInt();

        System.out.println("Key value mapping with the greatest key value maping less then or equal: ");
        System.out.println("Greatest key-value mapping associated with the given key: "+ a.floorEntry(key));   // find the greatest key, value close to the given number

        //Write a Java program to get the greatest key less than or equal to the given key
        System.out.println("\nGreatest key less then or equal to given key: ");
        System.out.println("THe answer is: "+ a.floorKey(key));     // only greatest key closest to the given key


        // Write a Java program to get the portion of a map whose keys are strictly less than a given key.
        System.out.println("\nGet a portion of the map whoes keys are less then or equal: ");
        System.out.println("The portion less then or equal: "+ a.headMap(key));

        //Write a Java program to get the portion of this map whose keys are less than (or equal to, if inclusive is true) a given key
        System.out.println("\nPortion of this map whose keys are less than (or equal to, if inclusive is true) a given key ");
        System.out.println("The portion : "+ a.headMap(key, true));


        //Write a Java program to get the least key strictly greater than the given key. Return null if there is no such key.
        System.out.println("\nGet the least key strictly greater than the given key. Return null if there is no such key");
        System.out.println("The lest key: "+ a.higherEntry(key));   // the least key greater than the given key, or null if not there

        //Write a Java program to get a key-value mapping associated with the greatest key strictly less than the given key. Return null if there is no such key
        System.out.println("\nKey-value mapping associated with the greatest key strictly less than the given key");
        System.out.println("THe key-value mapping: "+ a.lowerEntry(key));

        //Write a Java program to get the greatest key strictly less than the given key. Return null if there is no such key.
        System.out.println("\nGet the greatest key strictly less than the given key");
        System.out.println("The greatest key strictly less than the given key: "+ a.lowerKey(key)); // greatest key lower than the given key


    }
    static void treeMap3(){
        //Write a Java program to get NavigableSet view of the keys contained in a map
        Scanner scan = new Scanner(System.in);
        //Integer key = scan.nextInt();

        TreeMap<Integer, String > a  = new TreeMap<>();
        a.put(3, "Ashikul");
        a.put(1, "Kader");
        a.put(2, "Fahad");
        a.put(4, "FahadKader");
        a.put(5, "Urmy");
        a.put(6, "JAhan");
        a.put(7, "Store");
        a.put(8, "Meta");
        a.put(9, "Facebok");
        a.put(10,"Instagram");

        System.out.println("Nevigable set view of the map: "+ a.keySet());

        //Write a Java program to remove and get a key-value mapping associated with the least key in a map

        System.out.println("\nRemove and get a key-value mapping associated with the least key in a map");
        System.out.println("key-value mapping associated with the least key: "+ a.pollFirstEntry());    // removes the first key and remain others
        System.out.println(a);

        // Write a Java program to remove and get a key-value mapping associated with the greatest key in this map.
        System.out.println("\nRemove and get a key-value mapping associated with the greatest key in this map");
        System.out.println("Remove and get a key-value mapping associated with the greatest key "+ a.pollLastEntry());
        System.out.println(a);

        //Write a Java program to get the portion of a map whose keys range from a given key (inclusive), to another key (exclusive)
        System.out.println(" get the portion of a map whose keys range from a given key (inclusive), to another key ");
        System.out.println("The portion is: "+ a.subMap(2,6));
        SortedMap<Integer, String> b = new TreeMap<>();

        b = a.subMap(2,6);       // in this case to save the sub portion new map has to be sorted map

        System.out.println("\nTHe portion from the TreMap to Sorted map: "+ b);

        // Write a Java program to get the portion of a map whose keys range from a given key to another key
        System.out.println("\nGet the portion of a map whose keys range from a given key to another key ");
        System.out.println("Portion of the map from given key to another key: "+ a.subMap(2,true,9,false));

        // Write a Java program to get a portion of a map whose keys are greater than or equal to a given key.
        System.out.println("\nGet a portion of a map whose keys are greater than or equal to a given key");
        System.out.println("Portion greater than or equal to key: "+ a.tailMap(5));     // equal or more

        //  Write a Java program to get a portion of a map whose keys are greater than to a given key
        System.out.println("\nA portion of a map whose keys are greater than to a given key ");
        System.out.println("Portion greater than the given key: "+ a.tailMap(5, false));    // only more

        // Write a Java program to get a key-value mapping associated with the least key greater than or equal to the given key. Return null if there is no such key
        System.out.println("\nkey-value mapping associated with the least key greater than or equal to the given key");
        System.out.println("Key-value mapping with the lest key, greater than or equal: "+ a.ceilingEntry(3));      //returns key-value mapping
        System.out.println("Key-value mapping with the lest key, greater than or equal: "+ a.ceilingKey(3));    // returns only key


        //Write a Java program to get the least key greater than or equal to the given key. Returns null if there is no such key.
        System.out.println("\nLeast key greater than or equal to the given key");
        System.out.println("Key greater than or equal to given key: "+ a.ceilingKey(5));
        System.out.println("Key greater than or equal to given key: "+ a.ceilingKey(15));   // null, coz no such entry
        System.out.println("Key greater than or equal to given key: "+ a.ceilingKey(1));


    }

}
