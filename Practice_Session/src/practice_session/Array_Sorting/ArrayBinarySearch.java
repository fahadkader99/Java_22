package practice_session.Array_Sorting;

import java.util.Arrays;

public class ArrayBinarySearch {
    public static void main(String[] args) {

        int[] ids = {56,73,23,34,99,12};

        System.out.println(Arrays.toString(ids));
        System.out.println("Before sorting index of 12 is: "+ Arrays.binarySearch(ids, 12));

        Arrays.sort(ids);   // sorting will make change of the index in the elements, look at the result.
        System.out.println("After sorting index of 12 is : "+ Arrays.binarySearch(ids, 12));

        searchString();

    }
    static void searchString(){
        String[] name = {"Ashikul", "Kader", "Fahad","Esrat", "Jahan", "Urmy"};
        System.out.println(Arrays.toString(name));



    }
}
