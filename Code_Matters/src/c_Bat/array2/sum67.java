package c_Bat.array2;

import java.util.Scanner;

public class sum67 {
    /*
    Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7
    (every 6 will be followed by at least one 7). Return 0 for no numbers.


sum67([1, 2, 2]) → 5
sum67([1, 2, 2, 6, 99, 99, 7]) → 5
sum67([1, 1, 6, 7, 2]) → 4
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();

        Integer[] num = new Integer[size];

        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter element: " + (i + 1));
            num[i] = sc.nextInt();
        }

        int sum = 0;
        boolean flag = false;

        for (int i = 0; i<num.length;i++){
            if (num[i]==6){
                flag=true;
            }
            if (!flag){
                sum=sum+num[i];
            }

            if (flag&& num[i]==7){
                flag = false;
            }
        }

        System.out.println(sum);




    }
}
