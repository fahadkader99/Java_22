package november_22;

import java.util.Scanner;

public class EVENODD {
    // find the number of even & odd digit in a number
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a Number ");
        int a = sc.nextInt();
        int b = a;

        int even = 0;
        int odd = 0;

        while (b != 0){
            int rem = b % 10;

            if (rem % 2 ==0){
                even++;
            }else {
                odd++;
            }

            b = b/10;


        }

        System.out.println("Even = "+ even);
        System.out.println("Odd " + odd);
    }
}
