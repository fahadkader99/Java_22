package march_22;

public class FactorialOfN {
    public static void main(String[] args) {
        // find factorial of N
        // n = 5 : 1 * 2 * 3 * 4 * 5

        int num = 5;
        int factor = 1;

        for (int i = 1; i<=num;i++){
            factor *= i;
        }
        System.out.println(factor);

    }
}
