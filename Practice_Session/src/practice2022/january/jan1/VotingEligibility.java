package practice2022.january.jan1;

import java.util.Scanner;

public class VotingEligibility {
    // if age is 18+ then eligible to vote or not

    public static void main(String[] args) {

        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your age to find out : ");
            int age = input.nextInt();

            if (age >= 18 && age <= 150){
                System.out.println("Eligible to vote. ");
            }else System.out.println("Not eligible");
        }finally {
            System.out.println("Exception detected. Try again!");
        }


    }
}
