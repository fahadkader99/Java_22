package chirag_YT;

import java.util.Scanner;

public class MaxDigitFromNum {
    //find out the maximum digit from a given number:


    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num: ");
        int num = sc.nextInt();

        int max = num%10;

        while (num>0){
            if(num%10> max){
                max = num%10;
            }
            num = num/10;
        }
        System.out.println(max);



    }
}
