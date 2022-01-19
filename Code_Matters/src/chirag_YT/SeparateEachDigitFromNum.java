package chirag_YT;

import java.util.Scanner;

public class SeparateEachDigitFromNum {
    /*
    separate each digit from a num:
    ex: input 123
    output: 3
            2
            1
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int n = sc.nextInt();
        String num = sc.nextLine();

        separateMethod1(n);



    }
    public static void separateMethod1(int n){
        while (n != 0){
            System.out.println(n % 10);
            n = n / 10;
        }
    }



}
