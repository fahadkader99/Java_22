package talent_LMS;

import java.util.Scanner;

public class QubeOfNum {
    // find the qube of a given num

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int num = sc.nextInt();
        sc.close();

        System.out.println("Qube of the num is "+ (num*num*num));

    }
}
