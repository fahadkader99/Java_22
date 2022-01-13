package practice_session.Basics_Code;

import java.util.Scanner;

public class CalculateSumOfOddOrEven {

    // calculate sum of odd or even number in given range:

    public static void main(String[] args) {

        int n, i , sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a range: ");
        n = input.nextInt();

        if (n % 2 ==0){
            for (i = 0; i <= n; i++) {
                sum = sum + i;
            }
                System.out.println("The sum of Even numbers are: " + sum);

        } else {
            for (i = 0; i <=n; i ++){
                sum = sum + i;

            }
            System.out.println("THe sum of Odd dumber: " + sum);



        }

    }

}


