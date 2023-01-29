package Nov_22;

import java.util.Scanner;

public class SearchElementArray {
    // search for an element in array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for (int i=0; i< arr.length; i++){
            System.out.println("enter element " +(i+1));
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Number to find : ");
        int num = sc.nextInt();
        sc.close();

        boolean flag = false;

        for (int i = 0; i< arr.length; i++){
            if (arr[i] == num){
                System.out.println("Found at index " + i);
                flag = true;
                break;
            }else {
                flag = false;
            }
        }

        if (!flag){
            System.out.println("Not found");
        }



    }
}
