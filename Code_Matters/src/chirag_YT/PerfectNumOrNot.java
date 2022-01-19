package chirag_YT;

import java.util.Scanner;

public class PerfectNumOrNot {
    // find perfect number or not;
    // perfect num: sum pf divisor is equal to the given num: 6 = 1+2+3

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num: ");
        int num = sc.nextInt();
        int ori = num;

        int sum = 0;
        for (int i = 1; i<num;i++){
            if (num%i==0){
                sum = sum+i;
            }
        }
        //System.out.println("sum "+sum);

        if (ori == sum){
            System.out.println("Perfect Num");
        }else System.out.println("Not perfect!");

    }
}
