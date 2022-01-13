package practice2022.chirag_Youtube;

import java.util.Scanner;

public class DaysInMonth {
    // print number of days in a mothen

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("Enter no. of months: ");
        int days = s.nextInt();

        switch (days){
            case 1:
                System.out.println("Jan - 31");
                break;
            case 2:
                System.out.println("Feb - 28");
                break;
            case 3:
                System.out.println("Mar - 31");
                break;
            case 4:
                System.out.println("Apr - 30");
                break;
            case 5:
                System.out.println("May - 31");
                break;
            case 6:
                System.out.println("June - 30");
                break;
            case 7:
                System.out.println("July - 31");
                break;
            case 8:
                System.out.println("Aug - 31");
                break;

            default:
                System.out.println("Rest in Peach. Just try between 1 - 8 for Now. ");
                break;


        }


    }
}
