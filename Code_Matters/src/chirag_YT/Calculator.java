package chirag_YT;

import java.util.Scanner;

public class Calculator {
    // calculator using switch

    public static void main(String[] args) {

        int count = 1;

        do {
            try {
                System.out.println("1. Add");
                System.out.println("2. Sub");
                System.out.println("3. Mul");
                System.out.println("4. Div");
                System.out.println("Enter choice: ");
                Scanner s = new Scanner(System.in);
                int choice = s.nextInt();
                System.out.println("No. A: ");
                int a = s.nextInt();
                System.out.println("No. B: ");
                int b = s.nextInt();
                s.close();

                switch (choice) {
                    case 1:
                        System.out.println("Add = " + (a + b));
                        count = 2;
                        break;
                    case 2:
                        System.out.println("Sub =" + (a - b));
                        count = 2;
                        break;
                    case 3:
                        System.out.println("Mul = " + (a * b));
                        count = 2;
                        break;
                    case 4:
                        System.out.println("Div = " + (a / b));
                        count = 2;
                        break;

                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        } while (count == 1);


    }
}
