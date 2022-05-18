package May;

public class FactorialOfNum_Recursion {
    // find factorial of a number using recursion

    public static void main(String[] args) {

        int num = 10;

        int result = findFactorial(num);
        System.out.println("Factorial of "+num+" is "+ result);
    }
    public static int findFactorial(int num){

        if (num<=1){
            return 1;
        }else {
            return num * findFactorial(num-1);
        }

    }
}
