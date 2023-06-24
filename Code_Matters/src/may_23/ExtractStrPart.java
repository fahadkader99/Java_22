package may_23;

import java.util.Scanner;

public class ExtractStrPart {
    // extract from a string: first & last 4
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String a = sc.nextLine().trim();
        sc.close();

        String first = "";
        String middle = "";
        String last = "";

        if (a.length()>=8){
            first = a.substring(0,4);
            middle = a.substring(4,a.length()-4);
            last = a.substring(a.length()-4);
            System.out.println("First = " + first +"\nMiddle = " + middle +"\nLast = " + last);
        }else {
            System.out.println("String too short. . . ");
        }




    }

}
