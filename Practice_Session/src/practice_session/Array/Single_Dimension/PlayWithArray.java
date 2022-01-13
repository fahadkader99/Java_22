package practice_session.Array.Single_Dimension;

import java.util.Arrays;
import java.util.Scanner;
/*
find max, min. second max number

 */
public class PlayWithArray {
    public static void main(String[] args) {

    int [] num = {3,9,7,8,12,6,15,5,4,10};

    PlayWithArray p = new PlayWithArray();

    p.findSum(num);
    p.findMax(num);
    p.findSecondMax(num);
    p.findMin(num);
    p.searchElement(num);

    }
    int findSum(int[] num){
        int sum = 0;
        int avg = 0;
        for (int x : num){
            sum = sum + x ;
        }
        System.out.println("Sum is: " + sum);
        avg = sum / num.length;
        System.out.println("Avg is: " + avg);
        return sum;
    }
    int findMax(int [] num){

        int max = num[0];

        for (int i = 0; i < num.length; i++){
            if (num[i] > max){
                max = num[i];
            }
        }
        System.out.println("Max is: " + max);
        return max;

    }
    int findMin(int [] num){
        int min = num[0];

        for (int i = 0; i <num.length; i ++){
            if (num[i] < min){
                min = num[i];
            }
        }
        System.out.println("Min number is: "+ min);
        return min;

    }
    int findSecondMax(int[] num){
        int max1 = num[0];
        int max2 = num[0];

        for (int i = 0 ; i < num.length; i++){
            if (num[i] > max1){
                max2 = max1;
                max1 = num[i];
            }else if (num[i] > max2){
                max2 = num[i];
            }
        }
        System.out.println("The 2nd max is: " + max2);
        return max2;

    }
    int searchElement(int[] num){

        System.out.println(Arrays.toString(num));
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a key to look for: ");
        int key = input.nextInt();

        for (int i = 0; i < num.length; i ++){
            if (num[i] == key){
                System.out.println("The key is at index: "+ i);
                System.exit(0);
            }
        }
        System.out.println("Not found, Try again!");
        return key;

    }



}
