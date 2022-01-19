package chirag_YT;

import java.util.Scanner;

public class FindReverseOfN {
    //find reverse of given num:
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a num:");
        int num = s.nextInt();
        int rev = 0;

        while (num > 0){
            rev = rev *10 +(num%10);
            num = num / 10;
        }
        System.out.println(rev);
    }
}
