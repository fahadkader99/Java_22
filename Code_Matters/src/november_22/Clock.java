package november_22;

import java.util.Scanner;

public class Clock {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter teh number of seconds");
        int sec = sc.nextInt();
        int min = sec/60;
        int remainingSec = sec % 60;
        int hour = min / 60;
        int remainMin = min % 60;

        System.out.println("\n"+hour +" : " + remainMin+" : " + remainingSec);


    }
}
