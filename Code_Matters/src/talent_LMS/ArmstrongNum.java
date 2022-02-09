package talent_LMS;

import java.util.Scanner;

public class ArmstrongNum {

    public static void main(String[] args) {
        // verify the given num is armstrong. ex: 153 || 407

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int num = sc.nextInt();
        sc.close();

        int original = num;
        int cubeNum = 0;

        while (num>0){
            int remainder = num %10;
            cubeNum = cubeNum+(remainder * remainder * remainder);
            num = num / 10;

        }

        if (original == cubeNum){
            System.out.println("Armstrong");
        }else System.out.println("Not Armstrong");

    }
}
