package practice2022.chirag_Youtube;

import java.util.Scanner;

public class SwapValue {
    public static void main(String[] args) {
        Scanner inout = new Scanner(System.in);
        System.out.println("Enter No. A: ");
        int num1 = inout.nextInt();
        System.out.println("Enter No. B: ");
        int num2 = inout.nextInt();

        SwapValue s = new SwapValue();
        s.method1(num1,num2);
        s.method2(num1,num2);
        s.method3(num1,num2);

    }
    public void method1(int num1, int num2){
        int num3 = 0;

        num3 = num1;
        num1=num2;
        num2=num3;


        System.out.println("No A "+ num1);
        System.out.println("No B "+ num2);


    }
    public void method2(int num1, int num2){        // without 3rd variable

        num1 = num1+num2;
        num2 = num1-num2;
        num1= num1-num2;

        System.out.println("A "+ num1);
        System.out.println("B "+ num2);



    }

    public void method3(int num1, int num2){        // without 3rd variable

        num1 = num1*num2;
        num2 = num1 / num2;
        num1 = num1 / num2;

        System.out.println("A "+ num1);
        System.out.println("B "+ num2);

    }


}
