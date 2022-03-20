package march_22;

import java.util.Scanner;
// prime is a number divisible by 1 or number it-self

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = sc.nextInt();

        int count = 0;

        for (int i = 1; i<=num;i++){
            if (i % 2 ==0){
                count++;
            }
        }
        if (count==2){
            System.out.println("prime");
        }else {
            System.out.println("Not prime");
        }





    }
}
