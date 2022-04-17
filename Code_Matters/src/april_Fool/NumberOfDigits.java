package april_Fool;

import java.util.Scanner;

public class NumberOfDigits {
    // find the number of digits of a given number

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num");
        int num = sc.nextInt();

        int count = 0;

        while (num >0){
            //int remainder = num %10;
            count++;
            num = num/10;
        }
        System.out.println(count);


    }
}
