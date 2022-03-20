package march_22;

import java.util.Scanner;

public class FibonacciSeries {
    //find fibonacci up the given num

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int num = sc.nextInt();

        //m1(num);
        m2(num);


    }
    public static void m1(int num){                 // prints first 10 or given number
        int a = 0;
        int b = 1;
        int c;
        System.out.print(a+" "+ b+" ");
        for (int i = 2; i<=num;i++){
            c = a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }

    }
    public static void m2(int num){             // prints up to the given number

        int a = 1;
        int b = 1;
        int c = 0;
        System.out.print(a+" "+b+" ");

        while (c <= num){
            c = a+b;
            if (c>num)break;

            a = b;
            b = c;
            System.out.print(c+" ");
        }

    }
}
