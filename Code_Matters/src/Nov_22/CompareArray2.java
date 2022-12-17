package Nov_22;

import java.util.Arrays;
import java.util.Scanner;

public class CompareArray2 {
    // compare 2 array without using inbuilt method

    // take input from the user bot times

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Size 1st array " );
        int size1 = sc.nextInt();

        int[] a = new int[size1];
        for(int i=0; i<a.length; i++){
            System.out.println("Enter values " +(i+1));
            a[i] = sc.nextInt();
        }

        System.out.println("\nEnter Size for 2nd array ");
        int size2 = sc.nextInt();

        int[] b = new int[size2];
        for (int i=0; i<b.length; i++){
            System.out.println("Enter values " +(i+1));
            b[i] = sc.nextInt();
        }

        // sorting both array in case if they are equal but given in unsorted order
        Arrays.sort(a);
        Arrays.sort(b);

        boolean flag = true;

        if (a.length==b.length){

            for (int i =0; i<a.length; i++){
                if (a[i] != b[i]){
                    flag = false;
                }else {
                    flag = true;
                }
            }

        }else {
            flag = false;
        }

        if (flag){
            System.out.println("Equal");
        }else {
            System.out.println("Not equal");
        }



    }


}
