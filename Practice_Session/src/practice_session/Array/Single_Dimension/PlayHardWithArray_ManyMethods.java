package practice_session.Array.Single_Dimension;

import java.util.Arrays;
import java.util.Scanner;

public class PlayHardWithArray_ManyMethods {
    /**
     * Rotating an Array
     * Inserting an Element
     * Deleting an Element
     * Inserting Element
     * Split Method
     * Binary search
     * Copying an Array
     * Reverse copying an Array
     * Increasing size of Array
     */
    public static void main(String[] args) {
        int[] A = {5,9,6,10,12,7,3,5,4,2};

        for (int x : A){
            System.out.print(x+ ",");
        }
        System.out.println("");


        rotatingLeftElement(A);
        rotateRightElement(A);
        insertElement();
        deleteElement();
        sortAndBinarySearchMethod();
        splitMethod();
        binarySearchWithStrings();
        copyElement();
        reverseCopyElement();
        increaseSizeOfArray();
        userInput();



    }
    static void rotatingLeftElement(int[] A){

        int first = A[0];

        for (int i = 1; i <A.length; i++){
          A[i-1] = A[i];
        }
        A[A.length-1] =first;
        for (int x : A){
            System.out.print(x+ ",");
        }
        System.out.println("");


    }
    static void rotateRightElement(int[] A){
        int last = A[A.length-1];

        for (int i = A.length-1; i > 0; i-- ){
            A[i] = A[i-1];
        }
        A[0] = last;
        for (int x : A){
            System.out.print(x + ",");
        }
        System.out.println(" ");

    }
    static void insertElement(){    // to insert empty space for elements have to be there.

        int n = 6;  // number of elements

        int[] a = new int[10];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;
        a[5] = 60;

        for (int i = 0; i < n; i++){
            System.out.print(a[i]+ ",");
        }
        System.out.println("");

        ////////////////// >>>>>>>>>>>>>>>>> Inserting part

        int insertX = 15;
        int index = 3;

        for (int i = n; i > index; i--)
            a[i] = a[i-1];
        a[index] = insertX;

        for (int i = 0; i < a.length; i++){
            System.out.print(a[i]+ ",");
        }
        System.out.println("");

    }
    static void deleteElement(){                    // deleting String Mary

      String[] name = {"John", "Mary", "Nancy", "Bob"};
      String[] newName = new String[name.length-1];
      name[1] = name[name.length-1];                    // on index 1, we are replacing with last index, which is replacing Mary with Bob
      System.out.println(Arrays.toString(name));

      for (int i = 0; i < newName.length; i++){
          newName[i] = name[i];                      //copying old name array to newName array
      }
      System.out.println(Arrays.toString(newName));

    }

    static void sortAndBinarySearchMethod(){

        int[] num = {1,2,3,4,5,6,7,8,9,0};

        System.out.println(Arrays.binarySearch(num, 9));
        System.out.println(Arrays.binarySearch(num, 19));   // why -11 ?

        int[] n = {9,8,7,6,5,4,3,2,1};
        System.out.println("Before sort " + Arrays.binarySearch(n, 1));

        Arrays.sort(n);

        System.out.println("After sort " + Arrays.binarySearch(n, 1));


    }

    static void splitMethod(){

        String str = " Split this sentence into char Arr";

        char[] splitStringArr = str.toCharArray();
        System.out.println(Arrays.toString(splitStringArr));       // by this way we can put the string into array ref.

        for (int i = 0; i < splitStringArr.length; i++){    // this is how string can be put into char reference.
            System.out.println(splitStringArr[i]);
        }

        //===================================================   ===============================================//

        String str1 = "Split this sentence into char Arr";

        String[] secondArr = str1.split(" ");        // each word will be indexed into array.
        System.out.println(Arrays.toString(secondArr));

        for (int i = 0; i < secondArr.length; i++){
            System.out.println(secondArr[i]);
        }

    }

    static void binarySearchWithStrings(){

        String[] schools = new String[]{"Devx", "NSU", "IIT", "IUB"};
        System.out.println("the Arrays are: " + Arrays.toString(schools));

        System.out.println("Before sorting IIT : "+ Arrays.binarySearch(schools,"IUB"));

        Arrays.sort(schools);
        System.out.println("AFTER SORTING IIT : "+ Arrays.binarySearch(schools,"IUB"));

    }

    static void userInput(){
        Scanner scan = new Scanner(System.in);

        String[] zooAnimal = new String[5];

        for (int i = 0; i < zooAnimal.length; i++){
            System.out.println("Enter an animal " + (zooAnimal.length-i) + " animal more");
            zooAnimal[i] = scan.nextLine();
        }
        System.out.println("Here are the animal in our zoo " + Arrays.toString(zooAnimal));
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
