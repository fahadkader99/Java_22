package common_Interview_Question;

import java.util.Scanner;

public class FiboSeries {
    // find the fibonacci series until given num

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num:");
        int num = sc.nextInt();

        int first = 0;
        int second = 1;
        int add=0;


        for (int i = 2; i <num;i++){

            add = first+second;
            System.out.println(first);
            first = second;
            second = add;
        }



    }
}
