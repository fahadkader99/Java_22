package qA_Fox;

public class FindPrimeNumFrom1To100 {
    // get all the prime number from 1 to 100
    public static void main(String[] args) {
        int num = 100;
        System.out.println("\nAll prime from 1 - 100: ");

        for (int i = 0; i <= num; i++) {

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
            if (isPrime) {
                System.out.print(i + " ");
            }

        }


    }
}
