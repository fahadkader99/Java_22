package c_Bat.string2;

import java.util.Scanner;

public class xyzThere {
    /*
    Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.).
     So "xxyz" counts but "x.xyz" does not.


xyzThere("abcxyz") → true
xyzThere("abc.xyz") → false
xyzThere("xyz.abc") → true
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        boolean flag= false;

        if (str.length()>=3 && str.substring(0,3).equals("xyz")){
            flag = true;
        }

        for (int i= 1; i<str.length()-2;i++){
            if (str.charAt(i-1)!='.' && str.substring(i,i+3).equals("xyz")){
                flag = true;
           }
        }

        System.out.println(flag);
        sc.close();


    }
}
