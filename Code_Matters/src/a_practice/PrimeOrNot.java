package a_practice;

public class PrimeOrNot {

    // check the number is prime, means divisible by 1 and the number itself

    public static void main(String[] args) {

        int num = 3;
        int count = 0;
        for (int i=1; i<=num; i++){

            if (num % i ==0){
                count++;
            }
        }

        if (count==2){
            System.out.println("The number is prime");
        }else {
            System.out.println("The number is not prime");
        }
    }
}
