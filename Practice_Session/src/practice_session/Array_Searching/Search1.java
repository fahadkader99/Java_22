package practice_session.Array_Searching;

import java.util.Arrays;

public class Search1 {
    public static void main(String[] args) {

        int[] num = {1,2,3,4,5,6,7,8,9,0};

        System.out.println(Arrays.binarySearch(num, 9));
        System.out.println(Arrays.binarySearch(num, 19));   // why -11 ?

        int[] n = {9,8,7,6,5,4,3,2,1};
        System.out.println("Before sort " + Arrays.binarySearch(n, 1));

        Arrays.sort(n);

        System.out.println("After sort " + Arrays.binarySearch(n, 1));

        binarySearchString();

    }

    static void binarySearchString(){

        String[] name = {"Fahad", "Ashikul", "Kader", "Urmy"};

        Arrays.sort(name);

        System.out.println(Arrays.binarySearch(name, "F"));
        System.out.println(Arrays.binarySearch(name, "Fahad"));
        System.out.println(Arrays.binarySearch(name, "Urmy"));


    }

}
