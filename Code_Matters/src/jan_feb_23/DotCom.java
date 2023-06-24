package jan_feb_23;

import java.util.Scanner;

public class DotCom {
    public static void main(String[] args) {
        // extract the words in between .
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String a = sc.nextLine().trim();

        String middle = "";

        if ((a.length() >= 9) || (a.charAt(3)=='.' && a.charAt(a.length()-4)=='.')){
            middle = a.substring(4, a.length()-4);
            System.out.println(middle);
        }else {
            System.out.println("Try Again. . . . ");
        }


    }
}
