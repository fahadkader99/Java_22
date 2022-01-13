package random;

//import com.sun.media.jfxmediaimpl.HostUtils;
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

public class Array1DWarmUp {
    public static void main(String[] args) {

        // whatIsArray();
        //userDefined();
        //toStringMethod();
        toStringMethod();
        //reverseOrder();
        //userSum();
        //sorting();
        //compareArray();
        //soringOrder();
        //equalsMethod();
        //copyofMethod();
//        findMax();
//        findMin();
       // searchIssue();

    }

    static void whatIsArray() {

        int a[] = new int[10];
        System.out.println(a.length);
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }

    static void userDefined() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of array");

        int a[] = new int[scan.nextInt()];

        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }

    static void toStringMethod() {
        String a[] = {"Learn", "Coding", "Good", "For", "Education"};

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.asList(a));

        int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.asList(b));

        int[][] c = {{1, 2, 3, 4, 5, 6, 7, 8, 9}, {9, 8, 7, 6, 5, 4, 3, 2, 1}};

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                System.out.print(c[i][j] + " ");
            }
        }

        //System.out.println(Arrays.deepToString(c));

    }

    static void reverseOrder() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Elements");

        int n[] = new int[4];

        for (int i = 0; i < n.length; i++) {     // user input
            n[i] = scan.nextInt();
        }
        System.out.println();
        for (int i = 0; i < n.length; i++) {    // for iterating over regularly
            System.out.print(n[i] + " ");
        }
        System.out.println();
        for (int i = n.length - 1; i >= 0; i--) {
            System.out.print(n[i] + " ");
        }

    }

    static void userSum() {
        int n[] = new int[4];
        System.out.println("Enter elements");
        Scanner scan = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < n.length; i++) {
            n[i] = scan.nextInt();
        }
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        for (int x : n) {
            sum = sum + x;
        }
        System.out.println("THe sum = " + sum);

    }

    static void sorting() {
        int a[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.binarySearch(a, 5));       // return  index

    }

    static void compareArray() {
        String[] name1 = {"Fahad", "Ashikul", "Baha", "Bakai", "Fenton", "Jahan", "Mariya"};
        String[] name2 = {"Ashikul", "Jahan", "Sagar", "Dell", "Lenovo", "Apple", "Sony"};

        boolean isEqual = false;

        for (int i = 0; i < name1.length; i++) {
            for (int j = 0; j < name1.length; j++) {
                if (name1[i] == name2[j]) {
                    System.out.println("The common elements are: " + name1[i]);
                    break;
                }

            }
        }


    }

    static void soringOrder() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Size and elements: ");

        int a[] = new int[scan.nextInt()];

        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        Arrays.sort(a);
        System.out.println("After sorting: " + Arrays.toString(a));

        System.out.println();
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }

    }

    static void equalsMethod() {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int b[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        boolean bool = Arrays.equals(a, b);

        System.out.println("Is a and b elements are same: " + bool);

    }

    static void copyofMethod() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Size and elements: ");
        int[] a = new int[scan.nextInt()];

        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println("\nCopy of B from A");
        int b[] = Arrays.copyOf(a, a.length);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }


    }

    static void findMax() {
        int[] a = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
        int max = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Max=" + max);


    }

    static void findMin() {
        int[] a = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
        int min = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Minimum is " + min);

    }

    static void searchIssue() {
        int[] a = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
        Arrays.sort(a);
        System.out.println("Elements are: " + Arrays.toString(a));

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter element to look for ");
        int find = scan.nextInt();

        System.out.println("At index: "+ Arrays.binarySearch(a,find));

//        for (int i = 0; i < a.length; i++) {
//            if (a[i] == find) {
//                System.out.println("The element at index: " + i);
//                break;
//            }
//
//        }
//        System.out.println("Not found");
    }


}





