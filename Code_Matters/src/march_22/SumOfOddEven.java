package march_22;

import java.util.Scanner;

public class SumOfOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int num = sc.nextInt();
        int oddSum=0;
        int evenSum = 0;

        for (int i = 0; i<num;i++){
            if (i % 2 ==0){
                evenSum += i;
            }
        }

        for (int i = 0; i<num;i++){
            if (i % 2 != 0){
                oddSum += i;
            }
        }

        System.out.println("Even Sum: "+ evenSum);
        System.out.println("Odd sum: "+ oddSum);




    }
}
