package april_Fool;

import java.util.Arrays;

public class findTheMaxNumberOfStringFromArray {

    public static void main(String[] args) {
        String[] arr = {"Fahad", "Vipra","Karishma"};
        String longest = longestString(arr);

        System.out.println("Longest String: "+ longest);
        findLongestNumberOfString();

    }
    public static String longestString(String[] arr){

        int max = arr[0].length();
        int index = 0;

        for (int i = 0; i<arr.length;i++){

            if (arr[i].length()>max){
                index = i;
                max = arr[i].length();
            }
        }

        return arr[index];

    }

    public static void findLongestNumberOfString(){
        String[] arr = {"Fahad", "Vipra","Karishma"};

        int max = arr[0].length();
        int index = 0;

        for (int i = 0; i<arr.length;i++){

            if (arr[i].length()>max){
                index = i;
                max = arr[i].length();
            }
        }

        String [] words = arr[index].split(" ");
        System.out.println(Arrays.toString(words));

    }
}
