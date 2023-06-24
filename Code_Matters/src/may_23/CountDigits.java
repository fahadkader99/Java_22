package may_23;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        // count the number of digits in a given num
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num");
        int num = sc.nextInt();
        sc.close();
        int a = num;

        int count = 0;

        while (a != 0){
            a = a/10;
            count++;
        }
        System.out.println(num +" has digits: " + count);



    }
}
