package march_22;

import java.util.Scanner;

public class OddandEven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }



    }
}
