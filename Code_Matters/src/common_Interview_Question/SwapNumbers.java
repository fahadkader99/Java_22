package common_Interview_Question;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A num");
        int a = sc.nextInt();
        System.out.println("Enter B num");
        int b = sc.nextInt();

        System.out.println("before swap: "+a+" "+ b);

        method1(a,b);
        method2(a,b);
    }
    public static void method1(int a, int b){

        int temp;

        temp=a;
        a=b;
        b=temp;

        System.out.println("after swap: "+ a+" "+b);
    }
    public static void method2(int a, int b){
        a = a*b;
        b = a/b;
        a = a/b;
        System.out.println("after swap: "+ a+" "+b);

    }
}
