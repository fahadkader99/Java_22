package c_Bat.string2;

import java.util.Scanner;

public class sameStarChar {
    /*Returns true if for every '*' (star) in the string, if there are chars both immediately
    before and after the star, they are the same.


sameStarChar("xy*yzz") → true
sameStarChar("xy*zzz") → false
sameStarChar("*xa*az") → true*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();

        boolean isStar = false;

        if (str.contains("*")){
            for (int i = 1; i<str.length()-1;i++){
                if (str.charAt(i)=='*' && str.charAt(i-1)== str.charAt(i+1)){
                    isStar = true;
                }
            }
        }else {
            isStar = false;
        }


        System.out.println("\n"+isStar);

    }
}
