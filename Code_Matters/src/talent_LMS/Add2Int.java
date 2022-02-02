package talent_LMS;

import java.util.Scanner;

public class Add2Int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 int numbers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println(twoSum(n1,n2));


    }
    public static int twoSum(int n1, int n2){
        int sum = 0;

        sum = n1+n2;
        return sum;

    }

}
