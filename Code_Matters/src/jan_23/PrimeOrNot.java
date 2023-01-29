package jan_23;

import java.util.Scanner;

public class PrimeOrNot {
// find the number is prime or not
//
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a a Num ");
    int num = sc.nextInt();
    sc.close();
    int count = 0;
    for (int i = 1; i<=num; i++){
        if (num % i ==0){
            count++;
        }
    }

    if (count==2){
        System.out.println("Prime");
    }else {
        System.out.println("Not prime");
    }
}
}
