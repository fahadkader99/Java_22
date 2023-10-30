package november_22;

import java.util.Scanner;

public class DivisibleCounter {

    public static void main(String[] args) {
        // find if the number is divisible and find the ounter of how man ytimes the number is divisible
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range");
        int num = sc.nextInt();
        sc.close();

        int counter = 0;
        for (int i=1; i<=num; i++){
            if (num % i ==0){
                System.out.println(i);
                counter++;

            }
        }

        System.out.println("Total factor : "+counter);




    }
}
