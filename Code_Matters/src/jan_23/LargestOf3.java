package jan_23;

import java.util.Scanner;

public class LargestOf3 {
    // find the largest of 3 num
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 num ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        int max = (a > b ? a : b);
        int maxx = ( max > c ? max : c);

        System.out.println("Largest: " + maxx);
    }
}
