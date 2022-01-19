package chirag_YT;

import java.util.Scanner;

public class SeparateDigitFromNum {
    // separate each digit from a given num

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num: ");
        int num = sc.nextInt();

        int last = 0;
        while (num>0){
            System.out.println(num%10);
            num=num/10;


        }



    }

}
