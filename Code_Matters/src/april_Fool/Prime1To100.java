package april_Fool;

public class Prime1To100 {
    // find all the prime number 1 to 100;

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {

            boolean isPrime = true;

            if (i > 1) {

                for (int j = 2; j < i; j++) {

                    if (i % j == 0) {

                        isPrime = false;
                    }
                }


            } else {
                isPrime = false;
            }

            if (isPrime){
                System.out.print(i+" ");
            }


        }
    }


}
