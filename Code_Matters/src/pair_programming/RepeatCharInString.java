package pair_programming;

import java.util.Scanner;

public class RepeatCharInString {
    //Printing repetitive characters in a string

    public static void main(String[] args) {

        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter a string: ");
            String str1 = s.nextLine();
            boolean isdup = false;

            for (int i = 0; i<str1.length();i++){
                for (int j = i+1; j<str1.length();j++){
                    if (str1.charAt(i)==str1.charAt(j)){
                        System.out.println("Repeat: "+ str1.charAt(j));
                        isdup = true;
                    }
                }
            }
            if (!isdup){
                System.out.println("No duplicate element. ");
            }
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
