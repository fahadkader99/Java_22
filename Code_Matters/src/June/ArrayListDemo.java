package June;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();

        for (Integer i = 0; i<= 5; i++){
            str.add(String.valueOf(i));
        }

        System.out.println(str);
    }
}
