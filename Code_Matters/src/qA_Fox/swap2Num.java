package qA_Fox;

public class swap2Num {
    public static void main(String[] args) {

//        swap1();
//        swap2();
        swap3();


    }
    public static void swap1(){
        int a = 10;
        int b = 20;
        int c = 0;


        c = a;
        a = b;
        b = c;
        System.out.println(a);
        System.out.println(b);

    }
    public static void swap2(){
        int a = 10;
        int b = 20;

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println(a);
        System.out.println(b);
    }
    public static void swap3(){
        int a = 10;
        int b = 20;

        a = a*b;
        b = a/b;
        a = a / b;

        System.out.println(a);
        System.out.println(b);

    }
}
