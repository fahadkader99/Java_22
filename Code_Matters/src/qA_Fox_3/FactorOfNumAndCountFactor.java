package qA_Fox_3;

import java.util.Scanner;

public class FactorOfNumAndCountFactor {
    // program to count the factor of a number
    public static void main(String[] args) {
        // factor of a number mean it has to be divisible evenly and there will be no remainder after divide
        // ex: for 5 the factor is 1 and 5.
        // for 6 is 1,2,3,6

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        int count = 0;

        for (int i = 1; i <=num; i++){

            if (num % i ==0){
                System.out.print(i+" |");
                count++;
            }
        }
        System.out.println("\nThe number of factors are " + count);



    }
}
