package July;

import org.w3c.dom.ls.LSOutput;

public class LastTwo {

    // given a string of any length swap last 2
    public static void main(String[] args) {
        String str = "Coding";

        String first = str.substring(0,str.length()-2);

        System.out.println(first);

        String last = str.substring(str.indexOf(str.length()-2), str.indexOf(str.length()-1));

        System.out.println(first+last);
    }
}
