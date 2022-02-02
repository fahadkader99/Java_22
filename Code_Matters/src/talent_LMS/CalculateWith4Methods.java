package talent_LMS;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CalculateWith4Methods {
    /*
    Please write 4 different return type methods for the Calculator class

input numbers  are int a=21;  int b=3;

a) addNumbers(a,b)

b) divideNumbers(a,b)

c) multiplyNumbers(a,b)

d) subtractNumbers(a,b)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st num");
        int a = sc.nextInt();
        System.out.println("Enter 2nd num");
        int b = sc.nextInt();

        CalculateWith4Methods four = new CalculateWith4Methods();
        System.out.println(four.addNum(a,b));
        System.out.println(four.divideNum(a,b));
        System.out.println(four.multiplyNum(a,b));
        System.out.println(four.subtractNum(a,b));


    }
    public int addNum(int a, int b){
        int sum = a+b;
        return sum;
    }
    public int divideNum(int a, int b){
        int divide = a/b;
        return divide;
    }
    public int multiplyNum(int a, int b){
        int multiply = a*b;
        return multiply;
    }
    public int subtractNum(int a, int b){
        int subtract = a - b;
        return subtract;
    }
}
