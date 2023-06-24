package june_23;

import org.testng.annotations.Test;

import java.util.Scanner;

public class FourEquals {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 4 int values: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        scanner.close();

        if (a == b && b == c && c == d){
            System.out.println("All equals");
        }else {
            System.out.println("Not equals");
        }

    }
}
