package march_22;

import java.util.Scanner;

public class SumOfAllDIGITS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int n = sc.nextInt();
        int num = n;


//        // reverse the number
//        int r = 0;
//        while (n > 0){
//            int remainder = n % 10;
//            r = (r *10) + remainder;
//            n = n/10;
//        }
//        System.out.println(r);
//


        // sum of all the digits
//        int sum = 0;
//
//        while (n > 0){
//            int remainder = n % 10;
//            sum = sum+ remainder;
//            n = n/10;
//        }
//        System.out.println("Sum"+sum);


        // print out all the number separately
        while (n > 0){
            System.out.println(n % 10);
            n = n/10;

        }


    }
}
