package random.Array;

import java.util.*;

public class ArrayList_Basics {
    public static void main(String[] args) {

//        ArrayList<Integer> a1 = new ArrayList<>();
//        ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(50,60,70,80));
//
//        a1.add(10);
//        a1.add(0,5);
//        //a1.addAll(a2);
//        a1.addAll(1,a2);    // here all the value of a2 from index of 1 in a1.
//        a1.add(5,70);
//
//        System.out.println(a1);
//        System.out.println("Is a1 contain given elements "+ a1.contains(10));
//        System.out.println("get= "+a1.get(5));
//        System.out.println("indexOf= "+a1.indexOf(70));
//        System.out.println("LastIndexOf= "+ a1.lastIndexOf(70));
//        System.out.println("set/ replace = "+ a1.set(0,10));
//        System.out.println(a1);
//
//
//        System.out.println("\nA1 elements with for loop = ");
//        for (int i = 0; i <a1.size(); i++){
//            System.out.print(a1.get(i)+" ");
//        }
//
//        System.out.println("\n\nA1 elements with for each loop = ");
//        for (Integer x : a1){
//            System.out.print(x+ " ");
//        }
//
//        System.out.println("\n\nA1 elements with Iterator = ");
//        Iterator<Integer> it = a1.iterator();
//        while (it.hasNext()){
//            System.out.print(it.next()+ " ");
//        }
//        System.out.println("\n\nA1 elements with listIterator = ");     // listIterator has more functions
//        Iterator<Integer> listIt = a1.listIterator();
//        while (listIt.hasNext()){
//            System.out.print(listIt.next()+" ");
//        }


        arrayList1();





    }
    static void arrayList1(){
        ArrayList<Integer> listOfData = new ArrayList<>();

        listOfData.add(10);
        listOfData.add(22);
        listOfData.add(72);
        listOfData.add(45);

        Integer a = 22;
        listOfData.remove(a);
        listOfData.remove(2);

        for (int data : listOfData){
            System.out.println(data);
        }

    }

    static void set1(){
        ArrayList<Integer> listOfData = new ArrayList<>();
        HashSet<Integer> setOfData = new HashSet<Integer>();

        setOfData.add(30);
        setOfData.add(20);
        setOfData.add(45);
        setOfData.add(19);

        for (int data : setOfData){
            System.out.println(data);
        }

    }

    static void map1(){
        ArrayList<Integer> listOfData = new ArrayList<>();
        HashSet<Integer> setOfData = new HashSet<>();
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(2, "Two");
        map.put(1, "One");
        map.put(5, "Five");




    }
}
