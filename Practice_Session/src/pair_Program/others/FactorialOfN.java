package pair_Program.others;

import java.util.Scanner;

public class FactorialOfN {
    // find factorial of a given number.
    /*
    input = n = 5;
    output: 1 * 2 * 3 * 4 * 5
     */

    public static void main(String[] args) {

        int count = 1;

        do {
            try {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter a num: ");
                int num = s.nextInt();
                int factor = 1;

                for (int i = 1; i <= num; i++){
                    factor *= i;
                    count=2;
                }
                System.out.println("Factorial of "+ num+": "+factor );
            }catch (Exception e){
                e.printStackTrace();
            }
        }while (count==1);


    }
}
