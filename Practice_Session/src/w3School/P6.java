package w3School;

public class P6 {
    //Write a Java program to swap two variables.

    public static void main(String[] args) {
        int a, b, temp;

        a = 1;
        b = 2;

        System.out.println("Before swapping: a, b = "+ a +","+ b );

        temp = a;
        a = b;
        b = temp;

        System.out.println("After swap: a, b = " + a + "," + b  );

    }
}
