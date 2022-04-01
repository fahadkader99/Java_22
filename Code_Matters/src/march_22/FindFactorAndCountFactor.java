package march_22;

import java.util.Scanner;

public class FindFactorAndCountFactor {
    // find factors of number and count number of factors

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num");
        int num = sc.nextInt();
        sc.close();
        int count = 0;

        for (int i = 1; i<=num;i++){
            if (num % i ==0){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println("Num of factors: "+ count);

    }

}
