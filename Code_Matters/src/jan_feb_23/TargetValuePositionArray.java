package jan_feb_23;

import java.util.Scanner;

public class TargetValuePositionArray {
    public static void main(String[] args) {
        // find the first & last position of target value

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a target: ");
        int a = sc.nextInt();
        sc.close();

        int[] arr = new int[] {4,1,2,3,4,4,5,5,6,7};

        one(arr, a);
    }

    static void one(int[] arr, int target){
        int first = -1;
        int last = -1;
        boolean flag = false;

        for (int i = 0; i < arr.length; i++ ){
            if (arr[i] == target && first == -1){
                first = i;
                flag = true;
            }
            if (arr[i] == target && first != -1){
                last = i;
                flag = true;
            }
        }

        if (!flag){
            System.out.println("Index not found.!!!");
        }else {
            System.out.println("First = " + first);
            System.out.println("Last = " + last);
        }
    }
}
