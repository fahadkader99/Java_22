package practice2022.chirag_Youtube;

import java.util.Scanner;

public class FindMaxMinInDigit {
    /*
    find max digit in a given number.
    intput - 123 output 3
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = input.nextInt();

        findMax(num);
        findMin(num);
    }
    public static void findMax(int num){

        int max = num%10;
        while (num > 0){
            if (num %10 > max){
                max = num%10;
            }
            num = num / 10;

        }
        System.out.println("Max "+ max);

    }

    public static void findMin(int num){
        int min = num%10;
        while (num >0){
            if (num %10 < min){
                min = num %10;
            }
            num = num / 10;
        }
        System.out.println("Min "+min);
    }
}
