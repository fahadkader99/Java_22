package march_22;

import java.util.Scanner;

public class PerfectNumOrNot {
    // find perfect number or not;
    // perfect num: sum of divisor is equal to the given num: 6 = 1+2+3
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num");
        int num = sc.nextInt();

        int sum = 0;
        for (int i = 1; i<num;i++){
            if (num%i==0){
                sum+= i;
            }
        }
        System.out.println(sum);
        if (num==sum){
            System.out.println("Perfect");
        }else {
            System.out.println("Not perfect");
        }






    }
}
