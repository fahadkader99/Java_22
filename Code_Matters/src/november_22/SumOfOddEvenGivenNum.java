package november_22;

import java.util.Scanner;

public class SumOfOddEvenGivenNum {
    // find the sum of odd and even number of a given number
    public static void main(String[] args) {
        System.out.println("Enter a Range ");
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        sc.close();

        int evenSum = 0;
        int oddSum = 0;
        for (int i=0; i<=range; i++){
            if (i%2==0){
                evenSum+=i;
            }
        }
        System.out.println("Even Sum " + evenSum);

        for (int i=0; i<=range; i++){
            if (i%2!=0){
                oddSum+=i;
            }
        }
        System.out.println("Odd Sum " + oddSum);


    }
}
