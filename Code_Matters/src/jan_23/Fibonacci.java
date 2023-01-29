package jan_23;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range");
        int range = sc.nextInt();
        sc.close();

        int a = 0;
        int b = 1;
        int c = 0;
        System.out.print(a+" " + b+" ");

        while (range >= c){

            c = a+b;
            if (c>range){
                break;
            }
            System.out.print(c+" ");
            a = b;
            b = c;
        }



    }
}
