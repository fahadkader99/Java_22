package practice_session.Basics_Code;

import java.util.Scanner;

public class Multiplication_Table {
    //find multiplication table of given number
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for multiplication table: ");
        int num = input.nextInt();
        Multiplication_Table m = new Multiplication_Table();
        m.findTable(num);

    }
    int findTable(int num){
        int result =0;

        for (int i = 1; i <= num; i++){
            result = i * num;
            System.out.println(num + " x " + i + " = " + result);
        }
        return result;
    }
}
