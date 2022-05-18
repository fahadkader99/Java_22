package april_Fool;

public class FactorialOfNumber {
    // factorial is a number that multiply every number below it.

    public static void main(String[] args) {
        int range = 5;
        int result = 1;

        // ascending order
/*        for (int i = 1; i<=range; i++){
            result *= i;
        }
        System.out.println(result);*/

        // descending order
        for (int i = range; i>=1; i--){
            result *= i;
        }
        System.out.println(result);
    }
}
