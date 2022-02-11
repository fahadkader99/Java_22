package c_Bat.array2;

import java.util.Arrays;
import java.util.Scanner;

public class has22 {
    /*Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.


has22([1, 2, 2]) → true
has22([1, 2, 1, 2]) → false
has22([2, 1, 2]) → false*/
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

        boolean flag = false;
        for (int i = 0; i<num.length-1;i++){
            for (int j = i+1; j<num.length;j++){
                if (num[i]==2 && num[j]==2){
                   flag = true;
                }
            }
        }
        System.out.println(flag);
        sc.close();

    }
}
