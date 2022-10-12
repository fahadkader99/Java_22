package June;

import java.util.Scanner;

public class Finobacci {

    // find a fibonacci series up to a given number by user

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range ");
        int range = sc.nextInt();
        sc.close();
        System.out.println("\n");

        int a = 0;
        int b = 1;
        int temp = 0;
        System.out.print(a+" "+ b+" ");

        while (range >= temp){
            temp = a+b;

            if (temp>range) break;
            System.out.print(temp+" ");
            a = b;
            b = temp;
        }
    }
}
