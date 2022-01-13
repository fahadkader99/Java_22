package practice_session.Array.Single_Dimension;

import java.util.Scanner;

/*
1. finding sum of all the elements
2. finding average
3. finding max, 2nd max and minimum of the elements
4. searching for elements
 */

public class PlayWithElements {

    public static void main(String[] args) {

        int[] a = {3,9,7,8,12,6,15,5,4,10};
        int sum = 0;


        for (int i = 0; i < a.length; i++){
           sum = sum + a[i];
        }
        int avg = sum / a.length;
        System.out.println("Sum using for loop is: " + sum);       // finding sum
        System.out.println("Avg is: " + avg);       // finding avg


        for (int x : a){            // for each loop for showing the elements
            System.out.print(x);      // printing all the elements in the array

        }
        System.out.println();

        findMax(a);
        findSecondMax(a);
        findMin(a);
        searchIndex(a);


    }
    public static void searchIndex(int[] a){          // search for array in the elements
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the No. you are looking for: ");
        int key = input.nextInt();

        for (int i = 0; i < a.length; i ++){
            if (a[i] == key){                   // we are searching the element
                System.out.println("The element is at index : " + i);
                System.exit(0);     // the program will stop if it found the index
            }
        }
        System.out.println("Not found");


    }
    public static void findMax(int[] a){
        double max = a[0];

        for (int i = 0; i < a.length; i ++){
            if (a[i] > max){
                max = a[i];
            }
        }
        System.out.println("Max is: " + max);
    }

    public static void findMin(int[] a){
        double min = a[0];

        for (int i = 1; i < a.length; i++){
            if (a[i] < min){
                min = a[i];
            }
        }
        System.out.println("Minimum is: " + min);

    }
    public static void findSecondMax(int[] a){
      int max1 = a[0];
      int max2 = a [0];

      for (int i = 0; i < a.length; i++){
          if (a[i] > max1){
              max2 = max1;
              max1 = a[i];

          }else if (a[i] > max2 ){
              max2 = a[i];

          }
      }
        System.out.println("2nd Max is: " + max2);

    }

}
