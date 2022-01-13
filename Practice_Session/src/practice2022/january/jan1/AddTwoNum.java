package practice2022.january.jan1;

import java.util.Scanner;

public class AddTwoNum {

    public static void main(String[] args) {
        // add 2 num from user.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 num to add");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        int result = n1+ n2;
        System.out.println("Result = "+ result);


    }

}
