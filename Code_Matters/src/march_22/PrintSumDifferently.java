package march_22;

import java.util.Scanner;

public class PrintSumDifferently {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i<=num;i++){

            if (i % 3==0){
                sum -= i;
            }
            else {
                sum += i;
            }
        }

        System.out.println(sum);

    }
}
