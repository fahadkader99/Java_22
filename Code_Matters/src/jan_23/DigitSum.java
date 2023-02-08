package jan_23;

import java.util.Scanner;

public class DigitSum {
    // sum the given digit
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num ");
        int num = sc.nextInt();
        sc.close();
        int sum = 0;

        while (num > 0){
            int rem = num % 10;
            sum+=rem;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
