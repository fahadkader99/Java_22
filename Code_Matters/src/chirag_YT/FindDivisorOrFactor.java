package chirag_YT;

import java.util.Scanner;

public class FindDivisorOrFactor {
    // find divisor or factor of a num:
    // a factor are those num that divide the number parfectly

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num: ");
        int num = sc.nextInt();

        for (int i = 1; i <num; i++){
            if(num%i==0){
                System.out.println(i);
            }
        }


    }
}
