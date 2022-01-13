package practice_session.Basics_Code;

import java.util.Scanner;

public class ATM_Ex_Do_While {
    /** after inserting card
     * ask for price code
     * if you get it incorrectly then you will have 3 tries
     * if you get it wrong 3 times then print "Call customer support"
     */

    public static void main(String[] args) {

        int pin = 1234;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Pin");
        int enteredPin = input.nextInt();
        boolean flag = false;

        do {
            if (enteredPin == pin){
                System.out.println("Welcome to chase");
                flag = true;
                break;
            }else if (enteredPin != pin){
                for (int i = 1; i <=2; i++){
                    System.out.println("Pin incorrect, try again!");
                    enteredPin = input.nextInt();
                    if (enteredPin == pin){
                        System.out.println("Welcome to chase");
                        flag = true;
                        break;
                    }
                }
            }
            break;
        }
        while (true);
        if (!flag){
            System.out.printf("Your account is blocked. Call customer support.");
        }



    }


}
