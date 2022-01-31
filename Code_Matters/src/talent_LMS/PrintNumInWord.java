package talent_LMS;

import java.util.Scanner;

public class PrintNumInWord {
    /*
    Write a program called PrintNumberInWord which prints "ONE", "TWO",... , "NINE",
    "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively. Use (a) a "nested-if" statement;
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = sc.nextInt();

        switch (num){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;

            default:
                System.out.println("Try again, Wrong Input!!!");
        }




    }
}
