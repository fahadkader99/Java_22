package june_23;

import java.util.Scanner;

public class NegativePositiveNum {
    // write a method to check a given num is negative or positive
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Num");
        int a = scanner.nextInt();
        scanner.close();

        one(a);
        two(a);

    }

    static void one(int a){
        if (a > 0){
            System.out.println("Positive");
        }else {
            System.out.println("Negative");
        }
    }

    static void  two(int a){
        String  b = String.valueOf(a);
        if (b.contains("-")){
            System.out.println("Negative");
        }else {
            System.out.println("Positive");
        }
    }

}
