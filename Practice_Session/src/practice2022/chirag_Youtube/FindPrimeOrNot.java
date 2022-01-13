package practice2022.chirag_Youtube;

import java.util.Scanner;

public class FindPrimeOrNot {
    /*
    Prime Num ; a  number that is divisible by 1 and itself.
        So, divisor of prime num is always 2 (1 and num itself)
    Example ; 2,3,5,7,11,13

    Program to find a prime number.
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Num");
        int num = s.nextInt();
        int count = 0;

        try {
            for (int i = 1; i <= num; i++){
                if (num % i ==0){   // everytime we find divisor count will increase.
                    count++;
                }
            }
            if (count ==2){                 // since every prime num will have 2 divisor, if more than 2 then not prime
                System.out.println("Prime");
            }else System.out.println("Not Prime");
        }catch (Exception e){
            e.printStackTrace();
        }







    }
}
