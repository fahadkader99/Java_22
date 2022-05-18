package april_Fool;

public class NumberOddEven {
    public static void main(String[] args) {
        // number of odd and even in a number:

        int num = 123;

        int evenCount = 0;
        int oddCount = 0;

        while (num>0){
            int rem = num %10;

            if (rem %2==0){
                evenCount++;
            }
            else {
                oddCount++;
            }
            num = num/10;
        }
        System.out.println("Even"+ evenCount);
        System.out.println("Odd "+ oddCount );
    }
}
