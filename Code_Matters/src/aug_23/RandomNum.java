package aug_23;

import java.util.Scanner;

public class RandomNum {
    // generate a random number

    public static void main(String[] args) {
        System.out.println("Generate a random number ");
        Scanner scanner = new Scanner(System.in);
        int min  = scanner.nextInt();
        int max = scanner.nextInt();
        scanner.close();


        String random = String.valueOf((int) Math.floor(Math.random() * (max - min + 1) + min));

        System.out.println(random);


    }
}
