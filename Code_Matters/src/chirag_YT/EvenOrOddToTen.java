package chirag_YT;

import java.util.Scanner;

public class EvenOrOddToTen {
    // print odd and even numbers up to given N number.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a No. for N: ");
        int n = input.nextInt();
        input.close();

        System.out.println(even(n));
        System.out.println(odd(n));

    }
    public static int even(int n){
        int even =0;

        System.out.println("Even =");
        for (int i = 0; i <= n; i++){
            if (i %2 ==0){
                System.out.print(i+" ");
                even = i;

            }
        }
        return even;



    }
    public static int odd(int n){

        int odd = 0;

        System.out.println("Odd = ");
        for (int i = 0; i <= n; i++){
            if (i %2 !=0){
                odd = i;
                System.out.print(i+" ");
            }
        }
        return odd;



    }
}
