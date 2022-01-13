package practice_session.Basics_Code;

import java.util.Scanner;

public class Voting_Eligibility {
    /*
    Age >= 18 > vote
    Age < 18 = can't vote.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter age to find out vote eligibility: ");
        int age = input.nextInt();
        Voting_Eligibility q = new Voting_Eligibility();
        q.canVote(age);
    }
    int canVote(int age){
        if (age >= 18 && age <= 150){
            System.out.println("Congratulation! You can vote");
        }else if (age > 0 && age < 18){
            System.out.println("You can not vote.");
        }else {
            System.out.println("Please try again");
        }
        return age;
    }
}
