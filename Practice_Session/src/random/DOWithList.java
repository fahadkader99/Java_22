package random;

import java.util.*;

public class DOWithList {
    public static void main(String[] args) {

        //list1();
        DOWithList l = new DOWithList();
        //l.list2();
        //l.order();
        l.boxing();

    }
    static void list1(){
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList(List.of(1,2,3,4,5));
        a.add(10);
        a.add(11);
        a.add(12);

        System.out.println(a);

        b.add(1,1);


//       b.remove(1);
//        System.out.println(b);
        System.out.println(b.remove(1));

        b.set(0,0);
        System.out.println(b);


//        for (Integer x : a){
//            System.out.print(x+" ");
//        }
//
//        for (Integer x : b){
//            System.out.print(x+" ");
//        }
    }
    void list2(){

        String []s ={"AB","BC","CD"};
        String []s1 ={"AB","BC","CD"};


        ArrayList<String> a = new ArrayList<>(Arrays.asList(s));
       // ArrayList<String> b = new ArrayList<>(Arrays.asList(s1));

        a.add("EE");
        //b.add("EE");

        System.out.println(a);
        //System.out.println(b);

        //System.out.println("Is a and b equal "+ a.equals(b));


//        Scanner input = new Scanner(System.in);
//        System.out.println(a);
//        System.out.println("Key =");
//       // String key= input.nextLine();
//        int key1 = input.nextInt();
//
//        System.out.println("the key is at "+ a.get(key1));
//        System.out.println(a);
//
        a.remove("CD");
        System.out.println(a);
        System.out.println(a.removeAll(a));
        System.out.println(a);
        System.out.println(a.retainAll(a));

    }

    void order(){
        ArrayList<Integer> a = new ArrayList<>(List.of(1,4,2,6,1,3,5,78,90,12));
        System.out.println("Before sort "+ a);
        Collections.sort(a);

        System.out.println("After sorting: "+ a); // also ascending order.

        Collections.sort(a,Collections.reverseOrder());
        System.out.println("Reverse sort "+ a);


    }
    void boxing(){
        int a = 10;                         //Boxing
        Integer b = Integer.valueOf(a);
        System.out.println(b);

        Float f =10.10F;        // auto boxing
        float c = f;

        Long l = 10111l;
        long l1 = l;
        System.out.println(l1);








    }




}
