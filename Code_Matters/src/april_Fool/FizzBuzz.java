package april_Fool;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
/*        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int num = sc.nextInt();*/

        for (int num = 0; num<= 100; num++){
            if (num % 15 ==0){
                System.out.print(" fizzbuzz ");
            }else if(num % 5 ==0) {
                System.out.print(" buzz ");
            }else if (num % 3 ==0){
                System.out.print(" fizz ");
            }else {
                System.out.print(num+" ");
            }
        }


    }
}
