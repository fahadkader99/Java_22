package qA_Fox_3;

import java.util.Scanner;

public class Calculator {
    // perform calculator operation

    static int a, b;

    public static void main(String[] args) {

        int count = 1;


        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("1. Add");
                System.out.println("2. Sub");
                System.out.println("3. Multiply");
                System.out.println("4. Div");
                System.out.println("5. Mod");
                System.out.println("0. Exit");
                System.out.println("Enter your choice: ");
                int choice = sc.nextInt();
                int result=1;



                switch (choice){
                    case 1:
                        System.out.println("Enter 1st num");
                        int a = sc.nextInt();
                        System.out.println("Enter 2nd num");
                        int b = sc.nextInt();
                        result = a+b;
                        System.out.println("Adding");
                        count = 2;
                        break;
                    case 2:
                        System.out.println("Enter 1st num");
                         a = sc.nextInt();
                        System.out.println("Enter 2nd num");
                        b = sc.nextInt();
                        result = a-b;
                        count = 2;
                        break;
                    case 3:
                        System.out.println("Enter 1st num");
                         a = sc.nextInt();
                        System.out.println("Enter 2nd num");
                         b = sc.nextInt();
                        result = a*b;
                        count = 2;
                        break;
                    case 4:
                        System.out.println("Enter 1st num");
                         a = sc.nextInt();
                        System.out.println("Enter 2nd num");
                         b = sc.nextInt();
                        result = a / b;
                        count = 2;
                        break;
                    case 5:
                        System.out.println("Enter 1st num");
                         a = sc.nextInt();
                        System.out.println("Enter 2nd num");
                         b = sc.nextInt();
                        result = a % b;
                        count =2;
                        break;
                    case 0:
                        System.out.println("Thank you for your our system");
                        if (choice == 0){
                            result = 0;
                        }else result = 1;
                        count = 2;
                        break;

                }


                System.out.println("Result: "+ result);
            }catch (Exception e){
                System.out.println("\nException found try again.!!!!");
            }
        }while (count==1);



    }

}
