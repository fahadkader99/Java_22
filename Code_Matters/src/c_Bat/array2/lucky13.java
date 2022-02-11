package c_Bat.array2;

import java.util.Arrays;
import java.util.Scanner;

public class lucky13 {
    /*Given an array of ints, return true if the array contains no 1's and no 3's.


lucky13([0, 2, 4]) → true
lucky13([1, 2, 3]) → false
lucky13([1, 2, 4]) → false*
/

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();


        int[]num = new int[size];
        for (int i = 0; i<num.length;i++){
            System.out.println("Enter element: "+(i+1));
            num[i] = sc.nextInt();

        }
        System.out.println(Arrays.toString(num));
        boolean flag = true;

        for (int i = 0; i< num.length;i++){
            if (num[i]==1 || num[i]==3){
                flag = false;
            }
        }
        System.out.println(flag);


    }
}
