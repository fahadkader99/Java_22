package May;

public class FactorialOfNumber {

    public static void main(String[] args) {
        // find factorial of a given number

        int num = 10;
        int result = 1;

        for (int i = 1; i<=num;i++){
            result *= i;
        }
        System.out.println("Factorial of "+ num+" is "+ result);
    }
}
