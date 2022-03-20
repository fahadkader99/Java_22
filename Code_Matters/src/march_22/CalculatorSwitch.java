package march_22;

import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        int count = 0;
        do {
            try {
                System.out.println("Enter a num to operate: ");
                System.out.println("1. Add");
                System.out.println("2. Sub");
                System.out.println("3. Multiple");
                System.out.println("4. Divide");
                System.out.println("5. Mod");
                System.out.println("0  Exit");
                Scanner sc = new Scanner(System.in);
                int ch = sc.nextInt();


                switch (ch) {
                    case 1:
                        System.out.println("Enter 2 Numbers:");
                        int a = sc.nextInt();
                        int b = sc.nextInt();
                        System.out.println(a + b);
                        count = 1;
                        break;

                    case 2:
                        System.out.println("Enter 2 Numbers:");
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println(a - b);
                        count = 1;
                        break;

                    case 3:
                        System.out.println("Enter 2 Numbers:");
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println(a * b);
                        count = 1;
                        break;

                    case 4:
                        System.out.println("Enter 2 Numbers:");
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println(a / b);
                        count = 1;
                        break;

                    case 5:
                        System.out.println("Enter 2 Numbers:");
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println(a % b);
                        count = 1;
                        break;

                    case 0:
                        System.out.println("Thanks for using out app:");
                        count = 1;
                        break;

                    default:
                        System.out.println("Try 0 - 5");

                }
            } catch (Exception e) {
                System.out.println("Try again....!");
            }
        } while (count == 0);


    }
}
