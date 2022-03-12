package march_22;

import java.util.Scanner;

public class CountNumOfDigits {
    // count the number of digits inputed

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num:");
        int num = sc.nextInt();

        int count = 0;

        while (num>0){
            int r = num %10;
            num = num/10;
            count++;
        }

        System.out.println(count);

        sc.close();




    }
}
