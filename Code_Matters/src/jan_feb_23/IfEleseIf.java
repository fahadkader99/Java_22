package jan_feb_23;

import java.util.Scanner;

public class IfEleseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toLowerCase();
        sc.close();

        if (a.equals("fahad")){
            System.out.println("Match");
        }else if (a.equals("fahad")) {
            System.out.println("Else IF 1");
        }else if (a.equals("fahad")){
            System.out.println("Else IF 2");
        }
        else {
            System.out.println("Else only comes after if / else if ");
        }
        System.out.println("Test");
    }

    /*
    So multiple if will check all the of the conditions but else if will check one & execute the 1 that matches
     */
}
