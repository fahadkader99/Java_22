package random;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayWarmup {

    public static void main(String[] args) {

        //array1();

        ArrayWarmup a = new ArrayWarmup();
//        a.compareArray();

       // manyMethod();
//        doSearch();
//        matrix1();
        jaggedArray();

    }
    public static void array1(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your elements with size");
        int n[] = new int[input.nextInt()];


        for (int i = 0; i < n.length; i++){
            n[i] = input.nextInt();

        }
        for (int i = 0; i < n.length; i++){
            System.out.print(n[i]+ " ");
        }

        int sum = 0;
        System.out.println("\nSum of the elements are: ");
        for (int i = 0; i <n.length; i++){
            sum = sum+n[i];
        }
        System.out.println("The sum = "+ sum);


    }
    public boolean compareArray(){
        String[] a = {"Fahad", "Ashikul", "Baha", "Bakai", "Fenton", "Jahan", "Mariya"};
        String[] b = {"Ashikul", "Jahan", "Sagar", "Dell", "Lenovo", "Apple", "Sony"};

        boolean duplicate = false;

        for (int i = 0; i < a.length;i++){
            for (int j = 0; j < b.length; j++){
                if (a[i]==(b[j])){
                    System.out.println("THere is "+ a[i]+ " common element");
                    duplicate = true;
                }
            }
        }
        return duplicate;

    }
    public static void manyMethod(){
        Scanner scan = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];


        System.out.println("Enter elements for A [3]");
        for (int i = 0; i < a.length; i++){
            a[i] = scan.nextInt();
        }

        System.out.println("A = ");
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }

        System.out.println("\nEnter elements for B [3] ");

        for (int i = 0; i < b.length; i++){
            b[i] = scan.nextInt();
        }

        System.out.println("B= ");
        for (int i = 0; i < b.length; i++){
            System.out.print(b[i]+" ");
        }

        boolean isEqual = Arrays.equals(a,b);
        System.out.println("\nIs a and b elements are same: "+ isEqual);

        int [] c = Arrays.copyOf(a,5);
        System.out.println("\nAfter copying a to c, c = ");
        for (int i = 0; i <c.length;i++){
            System.out.print(c[i]+" ");
        }
        System.out.println(Arrays.toString(c));



    }
    static void doSearch(){
        int [] a = {1,2,3,5,7,1,9,11,7,8,9,0};
        Arrays.sort(a);
        System.out.println("The elements are "+ Arrays.toString(a));
        System.out.println("\nEnter the element you are looking for ");
        Scanner scan = new Scanner(System.in);
        int find = scan.nextInt();
        System.out.println("The element is at index "+ Arrays.binarySearch(a,find));



//        for (int i = 0; i< a.length;i++){
//            if (a[i] == find){
//                System.out.println("The element is at index "+ i);
//                break;
//            }
//        }
    }



    public static void matrix1(){
        Scanner scan = new Scanner(System.in);
        int[][] a = new int[2][3];
        int[][] b = new int[2][3];

        System.out.println("Enter elements for A [6]");
        for (int i = 0; i < a.length;i++){
            for (int j = 0; j < a[0].length;j++){
                System.out.printf("A[%d][%d]=",i,j);
                a[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter elements for B [6]");
        for (int i = 0; i < b.length;i++){
            for (int j = 0; j < b[0].length;j++){
                System.out.printf("B[%d][%d]=",i,j);
                b[i][j] = scan.nextInt();
            }
        }

        System.out.println("\nA= ");
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j <a[0].length; j++){
                System.out.print(a[i][j]+ " ");
            }
        }

        System.out.println("\nB= ");
        for (int i = 0; i < b.length; i++){
            for (int j = 0; j < b[0].length; j++){
                System.out.print(b[i][j]+" ");
            }
        }

        System.out.println("\n A + B = ");
        for (int i = 0; i < a.length;i++){
            for (int j = 0; j <a[0].length; j++){
                System.out.print(" "+ a[i][j] + b[i][j]);
            }
            System.out.println();
        }

        System.out.println("\n A / B = ");
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[0].length; j++){
                System.out.print(" "+ a[i][j] / b[i][j]);
            }
            System.out.println();
        }



    }
    static void jaggedArray(){
        /** Print the following way using 2D array
         *
         * 0
         * 1 2
         * 3 4 5
         * 6 7 8 9
         *
         */

        int k = 0;
        int [][] a = new int[4][];

        a[0] = new int[1];
        a[1] = new int[2];
        a[2] = new int[3];
        a[3] = new int[4];

        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < i+1; j++){
                a[i][j] = k;
                k++;
            }
        }

        for (int i = 0; i < a.length; i++){
            for (int  j = 0; j < i+1; j++){
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }














    }

}
