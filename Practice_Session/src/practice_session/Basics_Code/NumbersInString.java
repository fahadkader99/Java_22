package practice_session.Basics_Code;

import java.util.Scanner;

public class NumbersInString {
    public static void main(String[] args) {

        // string from a user
        // identify numbers and return them as  string
        // separate method
        // given input: "dev1x2 3 schools5"
        // expected output: "12345" > string


        Scanner inout = new Scanner(System.in);
        System.out.println("Please input your sentence: ");
        String str = inout.nextLine();

        System.out.println(identifyNumbers(str));





    }
    public static String identifyNumbers(String str){
        String s = "";
        for (int i = 0; str.length() > i; i++){
            if (str.charAt(i)>= 48 && str.charAt(i) <=57){
                s +=str.charAt(i);

            }

        }
        return s;

    }


}
