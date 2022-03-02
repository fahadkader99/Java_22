package qA_Fox_3;

public class SwapValue {
    // swap value within two variable without third variable
    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        method1(x,y);
        method2(x,y);
        method3(x,y);
        //method4(x,y);

    }
    public static void method1(int x, int y){
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println(x);
        System.out.println(y);
    }
    public static void method2(int x, int y){
        x = x*y;
        y = x/y;
        x = x/y;

        System.out.println(x);
        System.out.println(y);
    }
    public static void method3(int x, int y){
        x = x^y;
        y = x^y;
        x = x^y;

        System.out.println(x);
        System.out.println(y);

    }
//    public static void method4(int x, int y){
//        x = x % y;
//        y = x % y;
//        x = x % y;
//        System.out.println(x);
//        System.out.println(y);
//
//    }

}
