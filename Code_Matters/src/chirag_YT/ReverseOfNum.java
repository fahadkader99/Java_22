package chirag_YT;

import java.util.Scanner;
//print reverse of given num
public class ReverseOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num: ");
        int num = sc.nextInt();
        int reverse=0;

        while (num>0){
            reverse = reverse*10+(num%10);  // 1st reversing then multiply with 10 and adding the next digit
            num = num/10;

        }
        System.out.println(reverse);
    }
}
