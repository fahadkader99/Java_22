package random;

import java.util.HashSet;
import java.util.Set;

public class SetWarmup {
    public static void main(String[] args) {

        whatIsSet();

    }
    static void whatIsSet(){

        Set<String> name = new HashSet<>();
        name.add("Ashikul");
        name.add("Kader");
        name.add("Fahad");

        System.out.println(name);


        Set<Integer> n = Set.of(1,2,3,4,5,6,67,7,8,9);

        System.out.println(n);

    }


}
