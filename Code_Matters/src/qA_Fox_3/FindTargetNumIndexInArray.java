package qA_Fox_3;

import java.util.Arrays;
import java.util.Scanner;

public class FindTargetNumIndexInArray {
    // find the target number in an array > output will be the index
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();

        int [] num = new int[size];

        for(int i = 0; i<num.length;i++){
            System.out.println("Enter element: "+(i+1));
            num[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(num));
        System.out.println("Enter the target Num: ");
        int target = sc.nextInt();

        for (int i = 0; i<num.length;i++){
            if (num[i]==target){
                System.out.println("Index: "+i);
            }
        }


    }
}
