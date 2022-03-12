package march_22;

import java.util.Scanner;

public class FindFactorOrDivisor {
    // a factor are those num that divide the num perfectly

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num");
        int num = sc.nextInt();

        for (int i = 1; i<=num;i++){
            if (num % i ==0){
                System.out.print(i+" ");
            }
        }


    }
}
