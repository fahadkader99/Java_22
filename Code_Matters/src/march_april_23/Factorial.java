package march_april_23;

public class Factorial {
    //Write a method that calculates the factorial of a given number.
    public static void main(String[] args) {
        int num = 4;

        Factorial factor = new Factorial();
        System.out.println(factor.factorial(num));

    }
    int factorial(int num){

        int ans = 1;
        for (int i = 1; i<=num; i++){
            ans*= i;
        }
        return ans;
    }
}
