package march_22;

import java.util.Scanner;

public class SeperateDigitFromum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a Num: ");
        int num = sc.nextInt();

        int r = 0;
        while (num>0){
            r = num %10;
            System.out.println(r);
            num = num/10;

        }




    }
}
