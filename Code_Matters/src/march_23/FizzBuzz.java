package march_23;

import java.util.Scanner;

public class FizzBuzz {
    //Write a method that returns 'Fizz' for multiples of three and 'Buzz' for the multiples of five.
    //For numbers which are multiples of both three and five return 'FizzBuzz'.
    //For numbers that are neither, return the input number.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        sc.close();

        String result = "";
        if (num % 3 == 0){
            result += "Fizz";
        }
        if (num % 5 == 0){
            result += "Buzz";
        }
        if (result.equals("")){
            result = String.valueOf(num);
        }
//        if ((num % 3 ==0) & (num % 5 == 0)){
//            result += "FizzBuzz";
//        }
//        else {
//            result += num;
//        }

        System.out.println(result);


        /*
        if -> if 1 is not matched, it will check other if statements

        Else if -> if any 1 condition is matched it will not check other condition

         */

    }
}
