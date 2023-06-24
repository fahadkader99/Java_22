package june_23;

import java.util.Scanner;

public class RangeAddition {
    // a program that inputs 1 int from 0 - 100 & prints its all ranges
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a num between 0 - 100. ");
        int range = scanner.nextInt();
        scanner.close();

        int sum = 0;

        if (range >=0 && range <= 100){
            for (int i = 0; i<= range; i++){
                sum+= i;
            }
            System.out.println("Sum of digits for " + range +" = " + sum);
        }else {
            System.out.println("Out of range. . . .Try again");
        }



    }
}
