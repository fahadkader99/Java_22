package may_23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IterateList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,10,120));

        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
