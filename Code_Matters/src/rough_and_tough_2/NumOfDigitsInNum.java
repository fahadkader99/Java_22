package rough_and_tough_2;

import java.util.Scanner;

public class NumOfDigitsInNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = sc.nextInt();


        int count = 0;
        int first = 0;

        for (int i = 0; i <=num;i++){
            while (num>0){
                first = num%10;
                num = num/10;
                count++;
            }
        }
        System.out.println(first);
        System.out.println("Digits "+count);


    }
}
