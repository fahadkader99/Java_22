package march_22;

import java.util.Scanner;

public class Divisible5Or3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = sc.nextInt();

        for (int i = 1; i<=num;i++){

            if (i % 3 == 0 || i % 5 ==0){
                System.out.print(i+" ");
            }
        }

    }
}
