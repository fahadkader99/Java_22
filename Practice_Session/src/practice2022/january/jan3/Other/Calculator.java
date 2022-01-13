package practice2022.january.jan3.Other;

import java.util.Scanner;

 class CalculatorDemo {

     int n1,n2;


     public void printInfo(int n1, int n2){
         Scanner s = new Scanner(System.in);
         System.out.println("Enter No 1 ");
         n1 = s.nextInt();
         System.out.println("Enter No 2 ");
         n2 = s.nextInt();
     }


}

public class Calculator extends CalculatorDemo{
    @Override
    public void printInfo(int n1, int n2) {
        super.printInfo(n1, n2);
    }

    public static void main(String[] args) {

        CalculatorDemo c = new CalculatorDemo();


        Scanner input = new Scanner(System.in);

        int count = 1;

        do {
            try {

                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Modulus");
                System.out.println("0. To EXIT ");
                int choice = input.nextInt();

                switch (choice){


                }




            }catch (Exception ex){
                ex.printStackTrace();

            }
        }
        while (count==1);






    }
}
