package jan_feb_23;

import java.util.Scanner;

public class PrimeNum {
    // check if the number is prime or not
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range: ");
        int range = sc.nextInt();
        sc.close();

        int count = 0;

        for (int i = 1; i<= range; i++){
            if (range % i == 0 ){
                count++;
            }
        }
        if (count == 2){
            System.out.println("Prime");
        }else {
            System.out.println("Not Prime");
        }


    }
}
