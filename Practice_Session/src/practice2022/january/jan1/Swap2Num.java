package practice2022.january.jan1;

import java.util.Scanner;

public class Swap2Num {
    // swap 2 num form user.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter No. A ");
        int n1 = input.nextInt();
        System.out.println("Enter No. B ");
        int n2 = input.nextInt();
        System.out.println("Before swap: "+ n1 +" "+ n2);


        //method1(n1,n2);
        //method2(n1,n2);
        method3(n1,n2);

    }
    public static void method1(int n1, int n2){
        int n3;
        n3 = n1;
        n1 = n2;
        n2 = n3;

        System.out.println("After swap: "+ n1 +" "+ n2);
    }
    public static void method2(int n1, int n2){     // without third variable

        n1 = n1+n2;
        n2 = n1-n2;
        n1 = n1-n2;

        System.out.println("After swap: "+ n1 +" "+ n2);
    }
    public static void method3(int n1, int n2){     //without third variable
        n1 = n1 * n2;
        n2 = n1 / n2;
        n1 = n1 / n2;

        System.out.println("After swap: "+ n1 +" "+ n2);

    }
}
