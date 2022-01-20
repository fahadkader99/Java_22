package anotherDay.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listPractice {
    public static void main(String[] args) {

        //wrapper();
        list1();



    }
    public static void wrapper(){

        int a = 10;
        Integer b = Integer.valueOf(a);
        System.out.println(a);
        String c = String.valueOf(a);
        System.out.println(c);

        String d = "20";
        Integer e = Integer.valueOf(d);
        System.out.println(e);



    }
    public static void list1(){

        String[] name = {"Ashikul", "Kader", "Fahad"};


        List<String> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(name));
        list1.add("Jahan");
        list1.set(0,"Ash");
        System.out.println(list1);

        String[]arr = new String[list1.size()];
        for (int i = 0; i <arr.length;i++){
            arr[i]=list1.get(i);
        }

        System.out.println("Array: "+ Arrays.toString(arr));


    }
}
