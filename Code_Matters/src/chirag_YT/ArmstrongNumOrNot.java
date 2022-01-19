package chirag_YT;

import java.util.Scanner;

public class ArmstrongNumOrNot {
    /*
    check given num is Armstrong num or not
    Armstrong num: is a num that is equal to the sum of cubes of its digits

    in: 153, 1^3 + 5^3 + 3^3 = 153 > output Armstrong
    in: 123, 1^3 + 2^3 + 3^3 = 36  > out: Not Armstrong.
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a num:");
        int num = s.nextInt();
        int number = num;
        s.close();
        int sum = 0;

        // we have to separate each digit
        while (num > 0){            // we will get sum of each digit from the num
            sum = sum + (num%10)*(num%10)*(num%10);     // we are finding the qube of i
            num = num / 10;
        }
//        System.out.println(sum);
//        System.out.println(number);

        if (sum==number){
            System.out.println("Armstrong");
        }
        else {
            System.out.println("Not Armstrong");
        }






    }
}
