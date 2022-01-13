package practice_session.Array.Single_Dimension;

import java.util.Arrays;

public class CopyReverseCopyIncreaseArraySize {
    /*
    1. Copying an Array
    2. Reverse copying an Array
    3. Increasing size of Array
     */

    public static void main(String[] args) {

    //copyElement();
        //reverseCopyElement();
        increaseSizeOfArray();

    }
    static void copyElement(){

        int[] A = {8,6,10,9,2,15,7,13,14,11};
        int[] B = new int[10];
        System.out.println("Length of Array A = "+ A.length);
        System.out.println("Array A = "+ Arrays.toString(A));

        for (int i = 0; i <A.length; i++){
            B[i] = A[i];

        }
        System.out.println("Array B = " + Arrays.toString(B));

    }

    static void reverseCopyElement(){
        int[] A = {8,6,10,9,2,15,7,13,14,11};
        int[] B = new int[10];
        System.out.println("Array A = "+ Arrays.toString(A));

        for (int i = A.length-1, j =0; i >= 0; i--, j++){
            B[j] = A[i];
        }
        for (int x : B){
            System.out.print(x + " ");
        }

    }
    static void increaseSizeOfArray(){
        int [] a = {8,6,10,9,2};
        int [] b = new int[2 * a.length ];

        System.out.println("Elements at a are: " + Arrays.toString(a));
        System.out.println("Size of a : " + a.length);

        for (int i = 0; i < a.length; i++){
            b[i] = a[i];

        }
        for (int x : b){
            System.out.print(x + " ");
        }

//        System.out.println("Elements at b after copying a: " + Arrays.toString(b));
//        System.out.println("Elements at a after copying : " + Arrays.toString(a));


    }


}
