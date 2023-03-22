package march_23;

import java.util.Scanner;

public class PowerNum {
    // find the power of a num
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num:");
        int num = sc.nextInt();
        System.out.println("Enter the Power");
        int power = sc.nextInt();
        sc.close();

        int result = 1;

        while (power > 0){
            result*= num;
            power--;
        }
        System.out.println(result);

    }
}
