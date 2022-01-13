package practice_session.Array_Sorting;

import java.util.Arrays;

public class SortIntro {
    public static void main(String[] args) {

        int[] marksArray = new int[]{44,88,22,77,99};
        System.out.println("Before sorting: " + Arrays.toString(marksArray));

        Arrays.sort(marksArray);
        System.out.println("After sorting: " + Arrays.toString(marksArray));

        String[] school = {"Devx", "IUB", "NSU", "AIUB", "ABU", "Kader", "Urmy"};
        char[] c = {'a', 'c', 'e', 'A', 'Q', 'p', 'q', 'z', 'o', 'Z'};

        System.out.println("Before sorting: "+ Arrays.toString(school));
        System.out.println("Before sorting: "+ Arrays.toString(c));

        Arrays.sort(school);
        Arrays.sort(c);

        System.out.println(Arrays.toString(school));
        System.out.println(Arrays.toString(c));



    }
}
