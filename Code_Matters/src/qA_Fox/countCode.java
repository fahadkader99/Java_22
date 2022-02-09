package qA_Fox;

import java.util.Scanner;

public class countCode {
    /*
    Return the number of times that the string "code" appears anywhere in the given string,
    except we'll accept any letter for the 'd', so "cope" and "cooe" count.


countCode("aaacodebbb") → 1
countCode("codexxcode") → 2
countCode("cozexxcope") → 2
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        int count=0;

        for (int i = 0; i<str.length()-3;i++){
            if (str.substring(i,i+2).equals("co") && str.charAt(i+3)=='e'){
                count++;
            }
        }




//        if (str.substring(0,str.length()-1).contains("code")){
//            count++;
//        }

        System.out.println(count);




    }
}
