package chirag_YT;

import java.util.Scanner;

public class SumOfUpToN {
    // find sum of 1 to 10

    public static void main(String[] args) {
        // find sum of up to N number
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a No. ");
        int n = s.nextInt();
        int sum = 0;

        for (int i = 1; i <=n; i++){
            sum +=i;
        }
        System.out.println("Sum = "+ sum);



    }
}
