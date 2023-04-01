package jan_feb_23;

import java.util.Scanner;

public class FirstLastNumber {
    // find the first & last position of a number in an array

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target ");
        int target = sc.nextInt();
        sc.close();
        boolean flag = false;

        int[] array = {5,7,7,8,8,10};

        int first = -1;
        int last = -1;

        for (int i = 0; i < array.length; i++){
            if (array[i] == target && first == -1){
                first = i;
                flag = true;
            }
            if (array[i] == target && first != -1){
                last = i;
                flag = true;
            }
        }


        System.out.println("First Index = " + first);
        System.out.println("Last Index = " + last);

    }
}
