package rough_and_tough;

import java.util.Arrays;

public class RemoveWhiteSpaceFromString {
    public static void main(String[] args) {

    // remove white spaces and get actual string:

    regex();
    usingCharArray();
    stringBuilderMethod();

    }
    public static void regex(){
        String str = "Fahad Kader  SDET";

        str = str.replaceAll("[\\s]","");       // replacing using regex
        System.out.println(str);

    }
    public static void usingCharArray(){
        String str = "Fahad Kader  SDET";

        char[]arr =str.toCharArray();

        String result = "";

        for (int i = 0; i < arr.length;i++){
            int temp = arr[i];  // coz i will be using ascii value
            if (temp != 32 && temp != 9){
                result = result+arr[i];
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(result);

    }
    public static void stringBuilderMethod(){

        String str = "Fahad Kader  SDET";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i<str.length();i++){
            if (!Character.isWhitespace(str.charAt(i))){        // if i is not space then append them together
                sb=sb.append(str.charAt(i));
            }
        }

        System.out.println(sb);


    }
}
