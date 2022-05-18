package May;

public class SwapNumber {
    public static void main(String[] args) {

    method2();
    }
    public static void method1(){

        int a = 10;
        int b = 20;
        int temp = 0;

        temp = a;
        a = b;
        b = temp;

        System.out.println(a+" "+b);
    }
    public static void method2(){
        int a = 10;
        int b = 20;

        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(a+" "+b);

    }
}
