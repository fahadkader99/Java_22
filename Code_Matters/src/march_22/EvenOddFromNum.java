package march_22;

import java.util.Scanner;

public class EvenOddFromNum {
    // find the even abd odd number from the range of number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = sc.nextInt();


        for (int i = 1; i<= num;i++){

            if (i % 2==0) {
                System.out.print("E: " + i + " ");
            }
        }

        for (int i = 1;i<=num;i++){
            if (i%2 !=0){
                System.out.println("O:"+i+" ");
            }
        }
    }
}
