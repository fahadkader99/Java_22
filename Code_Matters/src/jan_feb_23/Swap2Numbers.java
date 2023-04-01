package jan_feb_23;

public class Swap2Numbers {
    // swap 2 numbers in different ways
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        //one(a,b);
        //two(a,b);
        three(a,b);
    }
    static void one(int a, int b){
        int temp = 0;
        temp = a;
        a = b;
        b = temp;

        System.out.println(a+" \n" + b);
    }

    static void two(int a, int b){
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println(a+" \n" + b);
    }

    static void three(int a, int b){
        a = a*b;
        b = a/b;
        a = a/b;

        System.out.println(a +"\n" + b);
    }
}
