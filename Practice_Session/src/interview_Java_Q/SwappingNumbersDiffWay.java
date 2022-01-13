package interview_Java_Q;

public class SwappingNumbersDiffWay {
    // 5 different ways of swapping numbers

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("Before swapping: "+ a +" "+ b);

        logic1(a,b);
        logic2(a,b);
        logic3(a,b);
        logic4(a,b);
        logic5(a,b);

    }
    static void logic1(int a, int b){       // using third variable

        int t = a;
        a = b;
        b = t;

        System.out.println("\nAfter swapping: "+ a +" "+ b);

    }
    static void logic2(int a, int b){       // using addition and subtraction operator

        a = a+b;    // 10+20
        b = a-b;    // 30-20
        a = a-b;    // 30-10

        System.out.println("After swapping: "+ a +" "+ b);

    }
    static void logic3(int a, int b){       // using Multiplication and Division (a & b should not be 0, or it will not work)
    // This is applicable only when both have some value in it / not 0.
        a = a*b;
        b = a/b;
        a = a/b;

        System.out.println("After swapping: "+ a +" "+ b);

    }
    static void logic4(int a, int b){       // using Bitwise / XOR (^)

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("After swapping: "+ a +" "+ b);
    }

    static void logic5(int a, int b){       // using single statement

        b = a+b -(a = b);

        System.out.println("After swapping: "+ a +" "+ b);

    }
}
