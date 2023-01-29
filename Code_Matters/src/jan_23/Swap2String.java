package jan_23;

import java.util.Scanner;

public class Swap2String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 String ");
        String a = sc.nextLine();
        String b = sc.nextLine();
        sc.close();


        String c = "";
        c = a;
        a = b;
        b = c;

        System.out.println(a+" \n"+b);

    }
}
