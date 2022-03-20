package march_22;

import java.util.Map;
import java.util.Scanner;

public class FindFactorialOfNum {
    // factorial 3 = 1*2*3 = 6
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num");
        int num = sc.nextInt();

        int factor = 1;

        for (int i = 1; i<=num;i++){
            factor *= i;

        }
        System.out.println(factor);




    }
}
