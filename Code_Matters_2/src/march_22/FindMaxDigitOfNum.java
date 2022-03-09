package march_22;

import java.util.Scanner;

public class FindMaxDigitOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num:");
        int num = sc.nextInt();

        int max = num % 10;

        while (num>0){
            if (num%10 > max){
                max = num %10;
            }
            num = num / 10;
        }
        System.out.println(max);




    }
}
