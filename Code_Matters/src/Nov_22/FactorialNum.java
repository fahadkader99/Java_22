package Nov_22;

import java.util.Scanner;

public class FactorialNum {
    // find the factorial of a given num
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num");
        int a = sc.nextInt();
        sc.close();


        int num = 1;
        for (int i=1; i<=a; i++){
            num*=i;
        }

        System.out.println("Factorial of " + a +" is = " + num);



    }
}
