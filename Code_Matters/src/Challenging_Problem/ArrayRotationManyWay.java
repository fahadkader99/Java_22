package Challenging_Problem;

import java.util.Arrays;

public class ArrayRotationManyWay {
    // right rotate of an array by 3 element
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};

        System.out.println("\nMain Array: "+ Arrays.toString(a));

        //rightRotation1(a);
        //leftRotation(a);
        //rightRotationBy3(a);
        leftRotateBy3(a);




    }
    public static void rightRotation1(int[] a){
        int size = a.length;
        int last = a[size-1];

        for (int i = size-1; i>0;i--){
            a[i] = a[i-1];

        }
        a[0] = last;
        System.out.println();
        System.out.println("\nRight rotation by 1: "+Arrays.toString(a));

    }
    public static void leftRotation(int[] a){
        int size = a.length;
        int first = a[0];

        for (int i = 0; i<size-1;i++){
            a[i] = a[i+1];
        }
        a[size-1] = first;
        System.out.println("\nLeft rotation by 1: "+ Arrays.toString(a));

    }
    public static void rightRotationBy3(int[] a){
        // 1st move / right rotate the array by 1 element then we will do with 3 element

        int size = a.length;

        int n = 3;      // num of time the element going to move
        int last;
        for (int j = 1; j<=n;j++){          // just one for loop for numbe rof times to move

            last = a[size-1];
            for (int i = size-1; i>0;i--){      // this loop is same for moving 1 element

                a[i] = a[i-1];
            }

            a[0] = last;
        }

        System.out.println("\nRight rotation by 3 element");
        for (int x : a){                // printing array
            System.out.print(x+" ");
        }
    }
    public static void leftRotateBy3(int[] a){
        int size = a.length;
        int n = 3;  // number of rotation


        for (int j = 0; j<n;j++){       // outer loop is just for the number of time rotating left, inner loop is same for 1 rotation as previously

            int first= a[0];
            for (int i = 0; i<size-1;i++){
                a[i] = a[i+1];
            }
            a[a.length-1] = first;
        }


        System.out.println("\nLeft rotation by 3: "+ Arrays.toString(a));
    }
}
