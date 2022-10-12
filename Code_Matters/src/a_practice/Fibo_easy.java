package a_practice;

import java.util.Scanner;

public class Fibo_easy {

    // print out the fibonacci series

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range ");
        int range = sc.nextInt();
        sc.close();

        //easy(range);
        hardWay(range);

    }

    static void easy(int range){

        int a = 0;
        int b = 1;


        for (int i=1; i<=range; i++){
            System.out.print(a+" ");
            int c = a + b;
            a = b;
            b = c;
        }

    }

    static void hardWay(int range){

        int a = 0;
        int b = 1;
        int temp = 0;
        System.out.print(a+" "+ b+" ");

        while (temp<=range){

            temp = a + b;

            if (temp>range){
                break;
            }
            System.out.print(temp+" ");
            a = b;
            b = temp;
        }
    }
}
