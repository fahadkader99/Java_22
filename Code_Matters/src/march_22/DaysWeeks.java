package march_22;

import java.util.Scanner;

public class DaysWeeks {
    public static void main(String[] args) {
    int count = 0;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a num");
                int a = sc.nextInt();

                switch (a){
                    case 1:
                        System.out.println("Saturday");
                        count = 1;
                        break;


                    case 2:
                        System.out.println("Sunday");
                        count = 1;
                        break;

                    case 3:
                        System.out.println("Monday");
                        count = 1;
                        break;

                    case 4:
                        System.out.println("Tuesday");
                        count = 1;
                        break;

                    case 5:
                        System.out.println("Wednesday");
                        count = 1;
                        break;

                    case 6:
                        System.out.println("Thrusday");
                        count = 1;
                        break;

                    case 7:
                        System.out.println("Friday");
                        count = 1;
                        break;

                    default:
                        System.out.println("Try between 1 - 7");
                        count = 0;

                }
            }catch (Exception e){
                System.out.println("Try again");
            }
        }while (count == 0);



    }
}
