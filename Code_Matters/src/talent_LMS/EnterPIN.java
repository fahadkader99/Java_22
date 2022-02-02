package talent_LMS;

import java.util.Scanner;

public class EnterPIN {
    public static void main(String[] args) {


        int count = 1;

        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("WELCOME TO THE BANK OF MITCHELL.");
                System.out.println("Enter your pin: ");
                int entry = sc.nextInt();
                int pin = 12345;

                while (entry != pin){
                    System.out.println("\nINCORRECT PIN. TRY AGAIN.");
                    System.out.println("Enter your pin: ");
                    entry = sc.nextInt();

                }

                System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
                count = 2;
            }catch (Exception e){
                e.printStackTrace();
            }
        }while (count==1);
    }
}
