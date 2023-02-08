package jan_23;

import java.util.Scanner;

public class Fibo {
    // print fibonacci series
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range: ");
        int range = sc.nextInt();

        int a = 0, b = 1, c = 0;

        System.out.print("\n"+a+" " + b+" ");

        while (c < range){
            c = a+b;
            if (c > range){
                break;
            }
            System.out.print(c +" ");

            a = b;
            b = c;
        }



    }
}
