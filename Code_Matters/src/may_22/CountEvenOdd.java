package may_22;

public class CountEvenOdd {
    // count the number of even and odd digits in a given array and find there sum;

    public static void main(String[] args) {
        int num = 12345;

        int even = 0;
        int evenSum = 0;
        int odd = 0;
        int oddSum = 0;

        while (num!=0){

            int rem = num%10;

            if (rem %2==0){
                even++;
                evenSum+= rem;
            }

            else{
                odd++;
                oddSum+= rem;
            }

            num = num/10;

        }

        System.out.println("Even num "+ even);
        System.out.println("Even sum "+ evenSum);
        System.out.println("ODD num "+ odd);
        System.out.println("Odd sum "+ oddSum);
    }
}
