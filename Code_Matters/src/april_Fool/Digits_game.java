package april_Fool;

import java.util.Scanner;

public class Digits_game {
    // find the number of even nad odd digits in a num

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num");
        int num = sc.nextInt();

        //num_of_digits(num);
        //sum_of_all_digits(num);
        reverse_digits(num);


    }public static void num_of_digits(int num){

        int even = 0;
        int odd = 0;

        while (num!=0){
            int remainder = num %10;

            if (remainder % 2==0){
                even++;
            }else {
                odd++;
            }
            num = num/10;
        }

        System.out.println("Even "+ even);
        System.out.println("Odd "+ odd);
    }

    public static void sum_of_all_digits(int num){

        int sum = 0;

        while (num != 0){
            int remainder = num%10;
            sum += remainder;
            num = num/10;
        }
        System.out.println(sum);

    }
    public static void reverse_digits(int num){
        int r = 0;
        while (num>0){
            int remainder = num%10;
            r = (r*10) + remainder;
            num = num/10;
        }
        System.out.println(r);

    }


}
