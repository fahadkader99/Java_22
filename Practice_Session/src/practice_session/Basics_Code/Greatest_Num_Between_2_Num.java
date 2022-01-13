package practice_session.Basics_Code;

import java.util.Scanner;

public class Greatest_Num_Between_2_Num {
    public static void main(String[] args) {


        Scanner i = new Scanner(System.in);
        System.out.println("Enter two number to find out the greatest: ");
        int a = i.nextInt();
        int b = i.nextInt();

        Greatest_Num_Between_2_Num g = new Greatest_Num_Between_2_Num();
        g.findGreatest(a,b);

    }
    public int findGreatest(int a, int b){

        if (a>b){
            System.out.println("The greatest number is : " + a);
        }else if(b>a){
            System.out.println("The greatest number is : " + b);
        }else {
            System.out.println("Numbers are equal, try again!");
        }
        return 0;
    }
}
