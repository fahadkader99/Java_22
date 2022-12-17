package Nov_22;

import java.util.Scanner;

public class CountOddEven {
    public static void main(String[] args) {
        // count the number of odd and even digit from  a given number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num ");
        int a = sc.nextInt();

        int odd = 0;
        int even = 0;

        for (int i=1; i<=a; i++){
            if (i % 2 ==0){
                even++;
            }
        }
        for (int i=1; i<=a; i++){
            if (i % 2 != 0){
                odd++;
            }
        }
        System.out.println("Even num " + even);
        System.out.println("Odd num " + odd);
    }
}
