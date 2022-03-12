package march_22;

import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        int count = 1;

        do {
            try {
                Scanner sc = new Scanner(System.in);

                System.out.println("0. Exit");
                System.out.println("1. Add");
                System.out.println("2. Sub");
                System.out.println("3. Multiply");
                System.out.println("4. Divide");
                System.out.println("5. Mod");

                int choice = sc.nextInt();
                System.out.println("Enter 1st Num:");
                int a = sc.nextInt();
                System.out.println("Enter 2nd Num:");
                int b = sc.nextInt();


                switch (choice) {

                    case 0:
                        System.out.println("Thank You...!");
                        count = 2;
                        break;
                    case 1:
                        System.out.println(a + b);
                        count = 2;
                        break;
                    case 2:
                        System.out.println(a - b);
                        count = 2;
                        break;
                    case 3:
                        System.out.println(a * b);
                        count = 2;
                        break;
                    case 4:
                        System.out.println(a / b);
                        count = 2;
                        break;
                    case 5:
                        System.out.println(a % b);
                        count = 2;
                        break;
                }
            } catch (Exception e) {
                System.out.println("Exception Found, Try Again");
            }
        } while (count == 1);


    }
}
