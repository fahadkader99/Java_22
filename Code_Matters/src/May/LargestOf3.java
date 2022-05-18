package May;

import java.util.Scanner;

public class LargestOf3 {

    public static void main(String[] args) {
        // find the largest of 3 num

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a>b && a>c){
            System.out.println("Largest "+ a);
        }
        else if (b>a && b>c){
            System.out.println("Largest "+ b);
        }
        else {
            System.out.println("Largest "+ c);
        }
        sc.close();

    }
}
