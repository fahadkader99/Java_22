package practice_session.Basics_Code;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOdd {
    // Find out if a number si even or odd by taking input from user
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to find Odd or Even: ");
        int num []= {scan.nextInt(),scan.nextInt()};

        EvenOdd e = new EvenOdd();
        System.out.println("Even number: "+ e.oddEven(num));


        String [] s1 = {"Kader", "Fahad", "Urmy", "Sania"};
        System.out.println(Arrays.asList(s1));


    }
    public int oddEven(int num[]){
        int even = 0;


        for (int i = 0; i < num.length; i++){
            if (num[i] % 2 == 0){
                even = even+1;
            }else {
                System.out.println("Odd number");
            }

        }
        return even;





    }
}
