package practice2022.chirag_Youtube;

import java.util.Scanner;

public class PerfectNumOrNot {
    /*
    given number is Spy / Perfect or not.
    Perfect Num: 6, Divisor of the num and there sum will be same as given num.
    in: 6, Divisor - 1, 2, 3 out - perfect.

     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = s.nextInt();
        int other = num;
        int sum = 0;

        for (int i = 1; i <num; i++){
            if (num%i==0){
                sum +=i;
            }
        }
        if (other==sum){
            System.out.println("Perfect Num");
        }else System.out.println("Not perfect ");
    }
}
