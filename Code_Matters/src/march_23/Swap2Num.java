package march_23;

import java.util.Scanner;

public class Swap2Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 Num: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        with3rd(a,b);
        without3rd(a,b);

    }

    static void without3rd(int a, int b){
        /*
        a = a+b;
        b = a-b;
        a = a-b;
        */

        a = a * b;
        b = a/b;
        a = a/b;
        System.out.println(a +" " + b);
    }

    static void with3rd(int a, int b){
        int c = 0;
        c = a;
        a = b;
        b = c;

        System.out.println(a +" " + b);
    }
}
