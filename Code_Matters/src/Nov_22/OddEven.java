package Nov_22;

import java.util.Scanner;

public class OddEven {
    // take a number and find out odd or even
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int num = sc.nextInt();
        sc.close();


        if (num % 2 == 0){
            System.out.println("Even ");
        }else {
            System.out.println("Odd");
        }



    }
}
