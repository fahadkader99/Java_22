package march_22;

import java.util.Scanner;

public class DivisibleBy5OrNot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int a = sc.nextInt();

        if (a % 5 ==0){
            System.out.println("Divisible");
        }else {
            System.out.println("Not divisible");
        }

    }
}
