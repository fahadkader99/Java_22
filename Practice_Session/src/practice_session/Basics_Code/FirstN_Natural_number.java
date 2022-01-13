package practice_session.Basics_Code;

import java.util.Scanner;

public class FirstN_Natural_number {
    // find N natural number and print them

    public static void main(String[] args) {
        int n;
        System.out.println("Enter no. of terms");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();
      FirstN_Natural_number num = new FirstN_Natural_number();
      num.getResult(n);

    }
    void getResult(int n){
       for (int i = 1; i <= n; i++){
           System.out.print(i + " ");   // printing i , coz value of i is increasing. n is user input and it is constant.
       }
    }
}
