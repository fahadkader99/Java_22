package Nov_22;

import java.util.Scanner;

public class NumFactor {
    // find the factor and number of factor in a given number
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num ");
        int a = sc.nextInt();

        int count = 0;

        for (int i = 1; i<=a; i++){
            if (a % i ==0){
                System.out.println("Factor: "+i);
                count++;
            }
        }
        System.out.println("\nTotal number of factor in the number: "   + count);


    }
}
