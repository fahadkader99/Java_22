package practice2022.chirag_Youtube;

import java.util.Arrays;
import java.util.Scanner;

public class SeparateNumberFromString {
    // separate numbers using string
    // input = 123
    //output 3
            //2
            //1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        String str = sc.nextLine();

        char[]ch = str.toCharArray();
        //System.out.print(Arrays.toString(ch));
        for (int i = 0; i <ch.length;i++){
            System.out.println(ch[i]);
        }




    }
}
