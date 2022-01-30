package c_Bat.warmUp2;

import java.util.Scanner;

public class frontTime {
    /*
    Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
    or whatever is there if the string is less than length 3. Return n copies of the front;


frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        System.out.println("Enter num of time to repeat: ");
        int n = sc.nextInt();

        int count = 0;
        String returns = "";

        for (int i = 0; i<n;i++){
            if (str.length()>3){
                returns = returns+str.substring(0,3);
                count++;
            }else if (str.length()<=3){
                returns = returns+str;
            }
        }

        System.out.println(returns);


    }
}
