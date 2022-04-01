package march_22;

import java.util.Scanner;

public class Seconds {
    // give seconds and convert to minutes and seconds , hours

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of seconds");
        int seconds = sc.nextInt();

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        System.out.println(hours+":"+remainingMinutes+":"+remainingSeconds);
        sc.close();



    }
}
