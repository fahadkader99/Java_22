package april_Fool;

public class PrimeRange {
    // check the range of number for prime or not
    public static void main(String[] args) {

        for (int i = 0; i<100; i++){

            boolean isPrime= true;

            if (i>1){

                for (int j = 2; j<i; j++){
                    if (i%j==0){
                        isPrime = false;
                    }
                }
            }
            else {
                isPrime = false;
            }

            if (isPrime){
                System.out.print(i+" ");
            }
        }
    }
}
