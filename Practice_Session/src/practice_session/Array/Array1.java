package practice_session.Array;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {

    array1();
    sortMethod();
    binarySearch();

    }
    public static void array1(){
        int num[] = new int[10];

        for (int i = 0; i < num.length; i++) {
            num[i] = i + 5;
        }
        System.out.println(num.length);
        System.out.println(Arrays.toString(num));
        System.out.println("\n");
    }
    public static void sortMethod(){
        // Sort method

        int[] a = {9,5,8,1}  ;
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }

        System.out.println("\nSort with String");
        String name[] = {"Dell", "Lenovo", "ABC", "CCD", "QWD"};

        Arrays.sort(name);
        for (int i = 0; i < name.length; i ++){
            System.out.print(name[i] + " ");
        }
        System.out.println("\n");
    }
    static void binarySearch(){
        int[]num = {8,6,4,2};
        System.out.println("Before sort");
        System.out.println(Arrays.binarySearch(num,2));
        System.out.println(Arrays.binarySearch(num,4));

        Arrays.sort(num);

        System.out.println("After sort");
        System.out.println(Arrays.binarySearch(num,2));
        System.out.println(Arrays.binarySearch(num,4));
        System.out.println(Arrays.binarySearch(num,9));



    }




}
