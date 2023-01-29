package jan_23;

import java.util.Scanner;

public class OneT100NoLoop {
    public static void main(String[] args) {
        // print our 1 to given number without loop

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range ");
        int count = sc.nextInt();

        noLoop(count);

    }

    static void noLoop(int count){
        int b = 1;
        if (count <= 100){
            System.out.println(count);
            count++;

            noLoop(count);
        }
    }
}
