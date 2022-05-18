package May;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRightRotation {
    // right rotate an array by giving user defined position

    public static void main(String[] args) {

        rightRotation();

    }

    public static void rightRotation() {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num to right rotate: ");
        int range = sc.nextInt();


        for (int k = 0; k < range; k++) {

            int right = num[num.length - 1];
            for (int i = num.length - 1; i > 0; i--) {
                num[i] = num[i - 1];
            }
            num[0] = right;
        }


        System.out.println(Arrays.toString(num));

    }
}
