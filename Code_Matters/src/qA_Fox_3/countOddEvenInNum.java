package qA_Fox_3;

import java.util.Scanner;

public class countOddEvenInNum {
    // count the number of odd and even in a given number.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int num = sc.nextInt();

        int odd = 0;
        int even = 0;

        for (int i = 0; i<=num;i++){
            if (i%2==0){
                System.out.print("Even num: "+ i+" ");
                even++;
            }
        }
        System.out.println(even);
        System.out.println();

        for (int i = 0; i<=num;i++){
            if (i%2!=0){
                System.out.print("Odd num: "+ i+" ");
                odd++;
            }
        }
        System.out.println(odd);




    }


}
