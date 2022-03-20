package march_22;

import java.util.Scanner;

public class PositiveOrNegative {
    // check given number is positive negative or zero
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int a = sc.nextInt();

        if (a > 0){
            System.out.println("positive");
        }else if (a < 0 ){
            System.out.println("Negative");
        }else {
            System.out.println("Zero");
        }
    }
}
