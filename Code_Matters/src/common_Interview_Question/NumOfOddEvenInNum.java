package common_Interview_Question;

import java.util.Scanner;

public class NumOfOddEvenInNum {
    // find the number of odd and even in a given num

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num: ");
        int num = sc.nextInt();

        int evenCount = 0;
        int oddCount = 0;

        while (num>0){
            int first = num%10;     // 1st get the last num
            if (num%2==0){          // check the last num odd or even
                evenCount++;
            }else oddCount++;
            num = num/10;           // eliminate the last num and keep moving until it is 0
        }

        System.out.println("Even "+evenCount);
        System.out.println("Odd "+oddCount);

    }
}
