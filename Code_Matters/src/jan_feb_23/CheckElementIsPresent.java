package jan_feb_23;

import java.util.Scanner;

public class CheckElementIsPresent {
    // check if the given element is par of collection or not
    public static void main(String[] args) {


        int count = 0;
        boolean flag = false;
        int index = 0;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("\nEnter an Element ");
            int a = sc.nextInt();
            int[] arr = new int[]{0,10,100, 1,2,3,4,5,6,7,8,9};

            for (int i = 0; i<arr.length; i++){
                if (arr[i] == a){
                    flag = true;
                    index = i;
                    count = 1;
                    break;
                }
            }
        }while (count == 0);


        if (flag){
            System.out.println("\nFound at index " + index);
        }else {
            System.out.println("\nNot Found . . . . ");
        }


    }
}
