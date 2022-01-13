package practice_session.Array.Single_Dimension;

import java.util.Arrays;

public class PlayWithElements2 {
    /*
    1. Rotation of array ( left rotation & right rotation)
    2. Inserting an elements
    3. Deleting an elements
    4. Split array and into char
     */
    public static void main(String[] args) {

        int[] a = {3,9,7,8,12,6,15,5,4,10};


        for (int i = 0; i < a.length; i ++){
            System.out.print(a[i] + " ");           // displaying all the elements
        }
        System.out.println("");



        leftRotation(a);
        rightRotation(a);
        splitArray();
        insertingElement();
        //deletingElement();

    }
    public static void leftRotation(int[] a){     //      <-------

        int first = a[0];

        for (int i = 1; i < a.length; i ++){
            a[i-1] = a[i];      // left rotation
        }
        a[a.length-1] = first;

        for (int x : a){
            System.out.print(x + " ");
        }
        System.out.println(" ");

    }
    public static void rightRotation(int[] a){
        int last = a[a.length-1];   // last is holding the last index

        for (int i = a.length-1; i > 0; i-- ){          // ---------->
            a[i] = a[i-1];

        }
        a[0] = last;
        for (int x : a){
            System.out.print( x + " ");
        }
        System.out.println(" ");

    }

    public static void splitArray(){

        String str = "My name is Fahad Kader";
        String[] s1 = str.split(" "); // if no white space then it will split as char, if space thn as a string
        System.out.println(Arrays.toString(s1));
        System.out.println(" ");

        String s = "I am twenty years old";
        char[] c = s.toCharArray();
        System.out.println(Arrays.toString(c));


    }
    public static void insertingElement(){

        int n = 6;

        int[] A = new int[10];
        A[0] = 5;
        A[1] = 9;
        A[2] = 6;
        A[3] = 10;
        A[4] = 12;
        A[5] = 7;

        for (int i = 0; i < n; i ++)      // 1st printing all the existing elements
            System.out.print(A[i]+ " ");
        System.out.println("");

        //////////////////////// Now Inserting the new Elements ///////
        int insertX = 69;
        int index = 4;

        for (int i = n; i > index; i-- )
            A[i] = A[i-1];
        A[index] = insertX;

        for (int i = 0; i < n; i ++)            // Last we are printing the elements to see the changes were made
            System.out.print(A[i] + " ");
        System.out.println(" ");


    }
    public static void deletingElement(){

        int[] num = new int[10];
        for (int i = 1; i <= num.length; i++){      // first printing all the element
            System.out.print(i + " ");
        }
        System.out.println(" ");

        // Deleting Elements (String) > Mary was deleted.

        String[] name = {"John", "Mary", "Nancy", "Bob"};
        String[] newName = new String[name.length-1];
        name[1] = name[name.length-1];          // on index 1, we are replacing with last index, which is replacing Mary with Bob
        System.out.println(Arrays.toString(name));

        for (int i = 0; i < newName.length; i ++){
            newName[i] = name[i];       //copying old name array to newName array
        }
        System.out.println(Arrays.toString(newName));



    }


}
