package march_22;

import java.util.Scanner;

public class NumberDivisibleBy2And3 {
    // give a range of number and check which are divisible by 2 and 3 both
    public static void main(String[] args) {

        int a = 1;
        int b = 25;

        for (int i = a; i<=b;i++){
            if (i % 2==0 && i % 3 ==0){
                System.out.print(i+" ");
            }
        }
    }
}
