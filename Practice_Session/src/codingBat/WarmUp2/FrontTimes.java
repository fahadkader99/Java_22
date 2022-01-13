package codingBat.WarmUp2;

import java.util.Scanner;

public class FrontTimes {

    /**
     * Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
     * or whatever is there if the string is less than length 3. Return n copies of the front;
     *
     *
     * frontTimes("Chocolate", 2) → "ChoCho"
     * frontTimes("Chocolate", 3) → "ChoChoCho"
     * frontTimes("Abc", 3) → "AbcAbcAbc"
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = input.nextLine();
        System.out.println("No. of times to concat: ");
        int num = input.nextInt();

        int count = 0;
        //String front = str.substring(0,3);
        String returns = "";

        for (int i = 0; i < num; i++){
            if (str.length()>=3){
                returns += str.substring(0,3);
                count++;
            }else if(str.length() < 3) {
                returns +=str;
                count++;
            }
        }
        System.out.println(returns);

    }
}
