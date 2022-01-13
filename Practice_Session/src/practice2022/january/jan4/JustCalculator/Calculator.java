package practice2022.january.jan4.JustCalculator;

import java.util.Scanner;

public class Calculator {
    int a, b;


    public int sum(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public int mod(int a, int b) {
        return a % b;
    }
}

class CalculatorTest extends Calculator {


    Scanner input = new Scanner(System.in);

//    @Override
//    public int sum(int a, int b) {
//        return super.sum(a, b);
//    }
//
//    @Override
//    public int sub(int a, int b) {
//        return super.sub(a, b);
//    }
//
//    @Override
//    public int mul(int a, int b) {
//        return super.mul(a, b);
//    }
//
//    @Override
//    public int div(int a, int b) {
//        return super.div(a, b);
//    }
//
//    @Override
//    public int mod(int a, int b) {
//        return super.mod(a, b);
//    }

    public void ask(int a, int b) {

        System.out.println("Enter Num 1: ");
        this.a = input.nextInt();
        System.out.println("Enter Num 2: ");
        this.b = input.nextInt();
    }


    public int printCalculation() {

        int count = 1;

        do {
            try {
                System.out.println("\n1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Modulus");
                System.out.println("0. To EXIT ");
                System.out.print("# ");
                int choice = input.nextInt();

                switch (choice) {
                    case 1:
                        ask(a, b);
                        System.out.println("---------------");
                        System.out.println("Sum: " + sum(a, b));
                        System.out.println("---------------");
                        //count = 2;
                        break;

                    case 2:
                        ask(a, b);
                        System.out.println("---------------");
                        System.out.println("Sub: " + sub(a, b));
                        System.out.println("---------------");
                        //count = 2;
                        break;

                    case 3:
                        ask(a, b);
                        System.out.println("---------------");
                        System.out.println("Mul: " + mul(a, b));
                        System.out.println("---------------");
                        //count = 2;
                        break;

                    case 4:
                        ask(a, b);
                        System.out.println("---------------");
                        System.out.println("Div: " + div(a, b));
                        System.out.println("---------------");
                        //count = 2;
                        break;

                    case 5:
                        ask(a, b);
                        System.out.println("---------------");
                        System.out.println("Mod: " + mod(a, b));
                        System.out.println("---------------");
                        //count = 2;
                        break;

                    case 0:
                        count = 2;
                        break;

                    default:
                        System.out.println("Wrong Input. ");
                }

            } catch (Exception e) {
                System.out.println("Exception Found. Try Again...! ");
            }
        } while (count == 1);


        return count;
    }


}


