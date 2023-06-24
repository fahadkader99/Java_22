package may_22;

public class FactorialNumber {
    public static void main(String[] args) {

        int num = 5;
        int factor = 1;
        for (int i = 1; i<=num; i++){
            factor*= i;
        }
        System.out.println(factor);
    }
}
