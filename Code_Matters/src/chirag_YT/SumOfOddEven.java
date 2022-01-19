package chirag_YT;

import java.util.Scanner;

public class SumOfOddEven {
    // find out sum of odd and even number up to a given number.

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a No. ");
        int n = s.nextInt();

        SumOfOddEven sum = new SumOfOddEven();
        sum.sumOfOdd(n);
        sum.sumOfEven(n);

    }
    public void sumOfOdd(int n){

        int sum = 0;
        for (int i = 0; i <= n; i++){
            if(i %2 !=0){
               sum +=i;
            }
        }
        System.out.println("Sum of Odd = "+ sum);

    }
    public void sumOfEven(int n){
        int sum = 0;
        for (int i = 1; i <= n;i++){
            if (i % 2 ==0){
              sum+=i;
            }
        }
        System.out.println("Sum of Even = "+ sum);
    }
}
