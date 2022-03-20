package march_22;

import java.util.Scanner;

public class CountNumOfDigitsInNumber {
    // count the number of digit in the number

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = sc.nextInt();

        int count = 0;

        while (num>0){
            int r = num %10;
            num = num / 10;
            count++;
        }
        System.out.println(count);




    }
}
