package rough_and_tough;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num:");
        int num = sc.nextInt();

        method1(num);


    }
    public static void method1(int num){

        int rev = 0;
        while (num>0){
            rev = rev*10+num%10;
            num = num/10;
        }

        System.out.println("Rev= "+ rev);
    }
}
