package c_Bat.warmUp2;

import java.util.Scanner;

public class doubleX {
    /**
     * Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
     *
     *
     * doubleX("axxbb") → true
     * doubleX("axaxax") → false
     * doubleX("xxxxx") → true
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();

        boolean ans = false;

        for (int i = 0; i < str.length()-1; i++){
            if(str.charAt(i)==str.charAt(i+1)){
                ans = true;
            }else ans = false;
        }

        System.out.println(ans);


    }
}
