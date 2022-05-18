package april_Fool;

public class SumOfDigits {
    // sum of all the number

    public static void main(String[] args) {
        int num = 235;

        int sum = 0;

        while (num!=0){
            int rem = num %10;
            sum += rem;
            num = num/10;
        }
        System.out.println("Sum "+ sum);
    }

}
