package chirag_YT;

import java.util.Scanner;

public class CountNumOfDigit {
    // count number of digit in a given num
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num: ");
        int num = sc.nextInt();

        int count = 0;
        int last = 0;
        while (num>0){
            last = num%10;
            num=num/10;
            count++;
        }
        System.out.println(count);







    }
}
