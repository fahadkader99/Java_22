package Nov_22;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateWord {

    // remove duplicate words from a given string

    public static void main(String[] args) {
        String a = "I am am Fahad Kader Fahad";

        String [] arr = a.split("\\s+");
        System.out.println(Arrays.toString(arr));

        Set<String > set = new LinkedHashSet<String>();

        for (int i=0; i< arr.length; i++){
            set.add(arr[i]);
        }

        StringBuilder sb = new StringBuilder();
        for (String s : set){
            sb.append(s+" ");
        }
        System.out.println(sb);
    }
}
