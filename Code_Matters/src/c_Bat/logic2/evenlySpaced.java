package c_Bat.logic2;

import java.util.Arrays;
import java.util.Scanner;

public class evenlySpaced {
    /*Given three ints, a b c, one of them is small, one is medium and one is large.
    Return true if the three values are evenly spaced, so the difference between small and
    medium is the same as the difference between medium and large.


evenlySpaced(2, 4, 6) → true
evenlySpaced(4, 6, 2) → true
evenlySpaced(4, 6, 3) → false*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean flag = false;

        int [] arr = {a,b,c};
        Arrays.sort(arr);

        int low = arr[1]-arr[0];
        int hi = arr[2]- arr[1];

        if (low==hi){
            flag = true;
        }else flag = false;

        System.out.println(flag);

    }
}
