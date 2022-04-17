package april_Fool;

import java.util.Scanner;

public class LargerOf3Num {
    // find the largest of 3 num in 2 way

    public static void main(String[] args) {
/*        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num");
        int num = sc.nextInt();*/


       // way1();
        ternary_operator();


    }
    public static void way1(){
        int a = 12;
        int b = 5;
        int c = 10;

        if (a>b && a > c) System.out.println(a);
        if (b > a && b > c) System.out.println(b);
        if (c > a && c > b) System.out.println(c);
    }

    public static void ternary_operator(){
        int a = 12;
        int b = 15;
        int c = 10;

        int largest = a>b?a:b;
        int mostLargest = largest>c?largest:c;

        System.out.println(mostLargest);

    }
}
