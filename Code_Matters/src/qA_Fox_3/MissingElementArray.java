package qA_Fox_3;

import java.util.Arrays;
import java.util.Scanner;

public class MissingElementArray {
    // find a missing element in array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int[]num = new int[size];

        for (int i = 0; i< num.length;i++){
            System.out.println("Enter element: "+(i+1));
            num[i] = sc.nextInt();
        }

        Arrays.sort(num);

        int first = num[0];
        int last = num[num.length-1];
        int assumSum = 0;

        for (int i = first; i<=last;i++){
            assumSum += i;
        }
        System.out.println(Arrays.toString(num));
        System.out.println(assumSum);

        int bSum = 0;
        for (int i = 0; i< num.length;i++){
            bSum +=num[i];
        }
        System.out.println("The missing number is: "+(assumSum-bSum));

    }
}
