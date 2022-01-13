package practice2022.january.jan1;

import java.util.Scanner;

public class Calculator {
    // Make a simple calculator
    public static void main(String[] args) {

        Calculator c = new Calculator();
        c.findCalculator();


    }

    public int findCalculator() {

        int count = 1;

        do {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("\nChoose Any Operation -->");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Modulus");
                System.out.print("# ");
                int choice = input.nextInt();
                input.nextLine();

                switch (choice) {
                    case 1:
                        int sum = 0;
                        System.out.println("Enter No. 1 ");
                        int n1 = input.nextInt();
                        System.out.println("Enter No. 2 ");
                        int n2 = input.nextInt();
                        sum = n1 + n2;
                        System.out.println("Sum = " + sum);
                        count = 2;
                        break;

                    case 2:
                        int sub = 0;
                        System.out.println("Enter No. 1 ");
                        n1 = input.nextInt();
                        System.out.println("Enter No. 2 ");
                        n2 = input.nextInt();
                        sub = n1 - n2;
                        System.out.println("Sub = " + sub);
                        count = 2;
                        break;

                    case 3:
                        int mul = 1;
                        System.out.println("Enter No. 1 ");
                        n1 = input.nextInt();
                        System.out.println("Enter No. 2 ");
                        n2 = input.nextInt();
                        mul = n1 * n2;
                        System.out.println("Mul = " + mul);
                        count = 2;
                        break;

                    case 4:
                        int div = 0;
                        System.out.println("Enter No. 1 ");
                        n1 = input.nextInt();
                        System.out.println("Enter No. 2 ");
                        n2 = input.nextInt();
                        div = n1 / n2;
                        System.out.println("Div = " + div);
                        count = 2;
                        break;

                    case 5:
                        int mod = 0;
                        System.out.println("Enter No. 1 ");
                        n1 = input.nextInt();
                        System.out.println("Enter No. 2 ");
                        n2 = input.nextInt();
                        mod = n1 % n2;
                        System.out.println("Mod = " + mod);
                        count = 2;
                        break;


                }
            } catch (Exception e) {
                System.out.println("Exception found. Try again ...! ");
            }
        } while (count == 1);

        return count;
    }

}

