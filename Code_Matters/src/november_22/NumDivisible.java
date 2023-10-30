package november_22;

import java.util.Scanner;

public class NumDivisible {
    // display number from a range which is divisible by 2 & 3
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range");
        int range = sc.nextInt();
        sc.close();

        for (int i = 1; i<= range; i++){

            if (i % 2 ==0 && i % 3 ==0){
                System.out.println(i);
            }
        }






    }
}
