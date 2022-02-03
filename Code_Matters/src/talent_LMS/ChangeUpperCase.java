package talent_LMS;

import java.util.Scanner;

public class ChangeUpperCase {
    /*
    Please write your first and last name in lower letters then your program should change it to first letter only to upper letter.

Ex: akilay    --> Akilay

       maratov--> Maratov
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter firstname ");
        String first = sc.nextLine();
        System.out.println("Enter last name: ");
        String last = sc.nextLine();
        String f = "";
        String l = "";


        f = first.substring(0,1).toUpperCase()+first.substring(1);
        l = last.substring(0,1).toUpperCase()+last.substring(1);

        System.out.println(first+" > "+ f);
        System.out.println(last+" > "+ l);




    }
}
