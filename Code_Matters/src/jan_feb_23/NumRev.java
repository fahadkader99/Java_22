package jan_feb_23;

import java.util.Scanner;

public class NumRev {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num ");
        int num = sc.nextInt();
        sc.close();

        int rev = 0;

        while (num > 0){
            int rem = num % 10;
            rev = (rev * 10) + rem;
            num = num/10;
        }
        System.out.println(rev);




    }
}
