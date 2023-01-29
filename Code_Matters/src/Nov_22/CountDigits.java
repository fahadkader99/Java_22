package Nov_22;

import java.util.Scanner;

public class CountDigits {
    // count the number of digits
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num ");
        int a = sc.nextInt();
        sc.close();
        int b= a;
        int count = 0;

        while (b !=0){
            b = b/10;
            count++;
        }
        System.out.println("Num of digit in " + a + " is: " + count);
    }
}
