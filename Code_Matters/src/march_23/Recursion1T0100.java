package march_23;

import java.util.Scanner;

public class Recursion1T0100 {
    // print 1 to 100 with recursion
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num: ");
        int num = sc.nextInt();
        System.out.println("Enter a range: ");
        int range = sc.nextInt();
        sc.close();

        printInfo(num, range);

    }

    public static void printInfo(int num, int range){

        if (num <= range){
            System.out.println(num);
            num++;

            printInfo(num, range);
        }
    }
}
