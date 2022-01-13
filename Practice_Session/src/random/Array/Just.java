package random.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Just {
    public static void main(String[] args) {

//        int [] a = new int[10];
//
//        System.out.println(a.length);
//        System.out.println(a);
//        for (int i = 0 ; i < a.length; i++){
//            System.out.println(a[i]);
//        }
//
//        System.out.println(Arrays.toString(a));

        //test1();
        //stringTimes();
       // sum1();
        //userDefined();
       // deepStr();
        Just j = new Just();
       // j.reversArray();
        //j.searching();
        //j.multiD();
        //j.matrix1();
        j.printJagged();
    }
    public static void test1(){
        String[] name1 = {"Fahad", "Ashikul", "Baha", "Bakai", "Fenton", "Jahan", "Mariya"};
        String[] name2 = {"Ashikul", "Jahan", "Sagar", "Dell", "Lenovo", "Apple", "Sony"};

        // find the common elements

        for (int i = 0; i < name1.length; i++){
            for (int j = 0; j < name2.length; j++){
                if (name1[i]==name2[j]){
                    System.out.println("Common elements "+ name1[i]);
                   continue;
                }
            }
        }

    }

    static void stringTimes(){
        /**
         * Given a string and a non-negative int n, return a larger string that is n copies of the original string.
         *
         *
         * stringTimes("Hi", 2) → "HiHi"
         * stringTimes("Hi", 3) → "HiHiHi"
         * stringTimes("Hi", 1) → "Hi"
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        System.out.println();
        System.out.println("Enter no of addition: ");
        Integer num = input.nextInt();


      char[] copy = new char[num * str.length()];
      int index = 0;

      for (int i = 0; i < num; i++){
          for(int j = 0; j < str.length(); j++){
              copy[index] = str.charAt(j);
              index++;
          }

      }
        System.out.println("New String: ="+ Arrays.toString(copy));

    }
    public static void sum1(){
        int []  a = {1,2,3,4,5,6,7,8,9};
        int[] b = new int[5];

        int sum=0;
        for (int i = 0; i < a.length; i++){
            sum = sum+a[i];
        }
        System.out.println("Sum ="+sum);


    }
    static void userDefined(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int a[] = new int[scan.nextInt()];

        for (int i = 0; i < a.length;i++){
            a[i] = scan.nextInt();
        }

        for (int i = 0; i < a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
    static void deepStr(){
        int[][] c = {{1, 2, 3, 4, 5, 6, 7, 8, 9}, {9, 8, 7, 6, 5, 4, 3, 2, 1}};

        for (int i = 0; i < c.length; i++){
            for (int j = 0; j < c[0].length; j++){
                System.out.print(c[i][j]+" ");
            }
        }
        System.out.println("\n"+Arrays.deepToString(c));
    }
    void reversArray(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size ");

        int [] a = new int[scan.nextInt()];

        for (int i = 0; i < a.length; i++){
            a[i] = scan.nextInt();

        }
        System.out.println("\nBefore reverse");
        for (int i = 0; i <a.length; i++){
            System.out.print(a[i]+" ");
        }

        System.out.println("\nAfter reverse");
        for (int i=a.length-1; i >=0; i--){
            System.out.print(a[i]+" ");
        }


    }
    void searching(){
        int[] a = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
        Arrays.sort(a);

        Scanner scan = new Scanner(System.in);
        System.out.println(Arrays.toString(a));
        System.out.println("Enter the element your are looking for: ");
        int key = scan.nextInt();

        System.out.println("At index "+ Arrays.binarySearch(a,key));
    }

    void multiD(){
        int a [][] = new int[2][3];
        int b [][] = new int[2][3];

        a[0][0]=10;
        a[0][1]=20;
        a[0][2]=30;
        a[1][0]=40;
        a[1][1]=50;
        a[1][2]=60;

        b[0][0]=11;
        b[0][1]=12;
        b[0][2]=13;
        b[1][0]=14;
        b[1][1]=15;
        b[1][2]=16;

        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[0].length; j++){
                System.out.print(a[i][j]+" ");
            }
        }
        for (int i = 0; i < b.length; i++){
            for (int j = 0; j< b[0].length;j++){
                System.out.print(b[i][j]+" ");
            }
        }


    }

    void matrix1(){

        Scanner scan = new Scanner(System.in);
       int a[][] = new int[2][3];
       int b[][] = new int[2][3];

        System.out.println("Input element: ");
       for (int i =0; i < a.length;i++){            // taking input for a
           for (int j =0; j<a[0].length; j++){
               System.out.printf("A[%d][%d]=",i,j);
               a[i][j]= scan.nextInt();
           }
       }
        System.out.println("");
       for (int i =0; i < b.length;i++){        // input is done
           for (int j=0; j <b[0].length;j++){
               System.out.printf("B[%d][%d]=",i,j);
               b[i][j]= scan.nextInt();
           }
       }

        System.out.println("\nA= ");
       for (int i =0; i <a.length; i++){
           for (int j =0; j<a[0].length;j++){
               System.out.print(a[i][j]+" ");
           }
       }
        System.out.println("\nB= ");
       for (int i =0; i<b.length;i++){
           for (int j=0; j<b[0].length;j++){
               System.out.print(b[i][j]+" ");
           }
       }

        System.out.println("\nA+B=");
       for (int i =0; i<a.length;i++){
           for (int j =0; j<a[0].length;j++){
               System.out.print(a[i][j]+b[i][j]+" ");
           }
       }

        System.out.println("\nA*B=");
       for (int i=0; i<a.length; i++){
           for (int j =0; j<a[0].length;j++){
               System.out.print(a[i][j] * b[i][j]+" ");
           }
       }

    }
    void printJagged(){
        /** Print the following way using 2D array
         *
         * 0
         * 1 2
         * 3 4 5
         * 6 7 8 9
         *
         */

        int count = 0;
        int a[] []= new int[4][];
        a[0] = new int[1];
        a[1] = new int[2];
        a[2] = new int[3];
        a[3]= new int[4];

        for (int i =0; i<a.length;i++){
            for (int j=0; j<i+1;j++){
                a[i][j]=count;
                count++;

            }
        }

        for (int i =0; i<a.length;i++){
            for (int j =0; j<i+1; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }

}
