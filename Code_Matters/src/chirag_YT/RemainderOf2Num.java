package chirag_YT;

public class RemainderOf2Num {
    // find the remainder of 2 numbers without remainder operator

    public static void main(String[] args) {
        int a = 10;
        int b = 7;

        int dividend = a / b;
        int remainder = a - (dividend * b);

        System.out.println("The remainder is: "+ remainder);


    }
}
