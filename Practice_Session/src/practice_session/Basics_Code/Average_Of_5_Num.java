package practice_session.Basics_Code;

import java.util.Scanner;

public class Average_Of_5_Num {
    // find average of 5 numbers from input
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 numbers to get average: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();


     Average_Of_5_Num q = new Average_Of_5_Num();
     q.getAverage(a,b,c,d,e);

    }
    void getAverage(int a, int b, int c, int d, int e){
        int result=0;
        result = (a+b+c+d+e)/5;
        System.out.println("THe average of 5 numbers are: " + result);
    }
}
