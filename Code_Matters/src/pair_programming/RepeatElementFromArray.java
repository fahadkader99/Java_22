package pair_programming;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RepeatElementFromArray {
    static Scanner s = new Scanner(System.in);
    //Removing repeated elements from an array
    public static void main(String[] args) {


        System.out.println("Enter the size");
        int size = s.nextInt();
        s.nextLine();


       // method1(size);


    }
    public static void method1(int size){
        String [] arr = new String[size];

        try {
            for (int i = 0; i < size;i++){
                System.out.println("Enter element # "+(i+1));
                arr[i] =s.nextLine();

            }
        }catch (Exception e){
            e.printStackTrace();
        }

        Integer[] arr2 = new Integer[size];
        try {
            for (int i = 0; i <size; i++){
                arr2[i]=Integer.valueOf(arr[i]);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        boolean isdup = false;
        for (int i = 0; i < arr2.length;i++){
            for (int j = i+1; j< arr2.length;j++){
                if (arr2[i]==arr2[j]){
                    System.out.println("Duplicate "+ arr2[j]);
                    isdup = true;
                }
            }
        }
        if (!isdup){
            System.out.println("No duplicate found!");
        }

    }
    public static void method2(int size){       // using array and take them to set

//        Integer[] arr = new Integer[size];
//
//        for (int i = 0; i< arr.length;i++){
//            System.out.println("Enter elements "+(i+1));
//            arr[i] = s.nextInt();
//        }
//        Set<Integer> num =new HashSet<Integer>();
//        for (int i = 0; i <size;i++){
//            num.add(arr[i]);
//            if (num.contains(i)!=arr[i])
//        }
//


    }

}
