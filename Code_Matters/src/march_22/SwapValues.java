package march_22;

import java.util.Scanner;

public class SwapValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int a = sc.nextInt();
        int b = sc.nextInt();

//        a = a+b;
//        b = a-b;
//        a = a-b;
//        System.out.println(a);
//        System.out.println(b);
//
//        a = a*b;
//        b = a/b;
//        a = a/b;
//        System.out.println(a);
//        System.out.println(b);

        int temp = 0;
        temp = a;
        a = b;
        b =temp;

        System.out.println(a);
        System.out.println(b);



    }
}
