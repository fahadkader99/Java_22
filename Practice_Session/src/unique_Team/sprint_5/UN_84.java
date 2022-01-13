package unique_Team.sprint_5;

import java.util.Scanner;

public class UN_84 {
    /*
    Create a program to check if the given number is Spy or not. A positive integer is called a spy number
    if the sum and product of its digits are equal. In other words, a number whose sum and product of all
    digits are equal is called a spy number. For example: let's take number 1124. First,
    we will split into digits (1, 1, 2, 4). After,
    we find the sum and product of all digits → 1+1+2+4 =8 and product 1*1*2*4 =8 → the number is spy.

Input: Enter the number to check: 123
Expected output: The given number is a spy number.
Input: Enter the number to check: 456
Expected output: The given number is not a spy number.
     */
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter a Number: ");
            int num = s.nextInt();

            if (findSum(num)== findProduct(num)){
                System.out.println("Number is Spy");
            }else {
                System.out.println("Number is not Spy.");
            }
        }catch (Exception e){
            System.out.println("Exception found: "+ e);
        }
    }
    public static int findSum(int num){
        // Finding sum of digits
        int sum=0;
        while (num > 0){

            sum =sum + (num %10);
            num = num/10;
        }
        return sum;

    }
    public static int findProduct(int num){
        // Finding product of digits
        int product = 1;
        while (num > 0){
            product = product * (num %10);
            num = num / 10;
        }
        return product;
    }
}
