package march_april_23;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveArrayElement {
    // remove an element from array

    public static void main(String[] args) {

        int num,index,p;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        num = sc.nextInt();

        int[] a = new int[num];
        int[] b = new int[num-1];             // new array that will be returned

        System.out.println("Enter values: ");
        for (int i = 0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("\nBefore removing index: " + Arrays.toString(a));
        System.out.println("\nEnter the index to be removed: ");
        index = sc.nextInt();

        if (a.length <= 0){
            System.out.println("Not enough element ...!");
        }else if (index > a.length ){
            System.out.println("Index is greater then array size | index not found ");
        }
        else if (index <= a.length) {

            // condition of swapping array elements
            for (int i = 0; i<a.length; i++){

                if (i < index){
                    b[i] = a[i];
                }
                else if (i == index) {                  // when i is same as index to remove just continue, means skip i
                    continue;
                }
                else {
                    b[i-1] = a[i];                      // after skipping b[i-1] = a [i]
                }
            }

            System.out.println("\nAfter removing element on index " + index);
            for (int i = 0; i < b.length; i++){
                System.out.print(b[i]+" ");
            }

        }









    }
}
