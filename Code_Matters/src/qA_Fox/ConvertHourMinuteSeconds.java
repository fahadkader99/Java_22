package qA_Fox;

import java.util.Scanner;

public class ConvertHourMinuteSeconds {
    // java which takes number of seconds and converts into hours, minutes and seconds

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter any number of seconds");
        int totalSeconds = sc.nextInt();

        // logic for calculating hours , minutes and seconds

        int minutes = totalSeconds / 60;    // but there will be some remaining seconds

        int remainingSeconds = totalSeconds % 60;   // % will give us the remaining

        int hours = minutes / 60;   // 1 hr  = 60 minutes

        int remainingMinutes = minutes % 60;    // since there will be some remaining minute after

        System.out.println(hours+"hr : "+remainingMinutes+"m : "+remainingSeconds+"s");

    }
}
