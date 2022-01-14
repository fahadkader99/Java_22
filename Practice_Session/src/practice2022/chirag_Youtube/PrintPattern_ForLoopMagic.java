package practice2022.chirag_Youtube;

import java.util.Scanner;

public class PrintPattern_ForLoopMagic {
    /*
    write a program to print given pattern (given num lines of 12345)
    12345
    12345
    12345
    12345
    12345
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = s.nextInt();

        method1(num);
        //method2(num);

    }
    public static void method1(int num){
        for (int i = 1; i <=num; i++){
            System.out.println("12345");
        }
//        for (int i = 1; i <=num;i++){
//            System.out.println("1");
//            System.out.println("2");
//            System.out.println("3");
//            System.out.println("4");
//            System.out.println("5");
//
//            System.out.println();
//        }


    }
    public static void method2(int num){
      // what if we have to print (1 -100) 10 times

        for (int i = 0; i<=num; i++){
            for (int j = 1; j <=num; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
