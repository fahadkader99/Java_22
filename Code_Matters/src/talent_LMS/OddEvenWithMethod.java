package talent_LMS;

import java.util.Scanner;

public class OddEvenWithMethod {
    /*Please  find if a number is even or odd in Java using the method and use your method in your class to show the result.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int num = sc.nextInt();

        findEvenOrOdd(num);

    }
    public static int findEvenOrOdd(int num){
        if (num%2==0){
            System.out.println("Num is Even");
        }else {
            System.out.println("Num is Odd");
        }
        return num;
    }

}
