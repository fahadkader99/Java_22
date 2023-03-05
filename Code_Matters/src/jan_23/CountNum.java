package jan_23;

import java.util.Scanner;

public class CountNum {
    //
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num ");
        int a = sc.nextInt();
        sc.close();
        int count = 0;

        while (a > 0){
            a = a/10;
            count++;
        }
        System.out.println("Digits: " + count);
    }
}
