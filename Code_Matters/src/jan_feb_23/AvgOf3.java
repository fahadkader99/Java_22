package jan_feb_23;

import java.util.Scanner;

public class AvgOf3 {
    // take 3 number and find the average of them
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        int sum = (a + b + c);
        float avg = sum / 3;

        System.out.println("Avg of 3 num: " + avg);

    }
}
