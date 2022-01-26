package common_Interview_Question;

import java.util.Scanner;

public class PrimeOrNot {
    // prime number is a number who can be decided only by 1 and the number itself.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        int prime = 0;
        for (int i = 1;i<=num; i++){
            if (num%i==0){
                prime++;
            }
        }
        //System.out.println(prime);

        if (prime==2){
            System.out.println("Prime");
        }else System.out.println("Not Prime");

    }
}
