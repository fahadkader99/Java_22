package qA_Fox_3;

import java.util.Scanner;

public class NumOfElement {
    // find the number of element in the given array;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size");
        int []num = new int[sc.nextInt()];

        for (int i = 0; i<num.length;i++){
            System.out.println("Enter element"+(i+1));
            num[i] = sc.nextInt();
        }

        int count = num.length;
        System.out.println("The number of elements are: "+count);
    }
}
