package Nov_22;

import java.util.Scanner;

public class Fibonacci {
    // write a fibonacci series

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range ");
        int range = sc.nextInt();
        sc.close();

        Fibonacci f = new Fibonacci();
        f.one(range);
    }

    void one(int range){
        int a = 0;
        int b = 1;

        for (int i=1; i<=range; i++){
            System.out.print(a+" ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
