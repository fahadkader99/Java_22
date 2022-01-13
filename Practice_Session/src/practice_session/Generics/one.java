package practice_session.Generics;

import java.util.Arrays;

public class one {
    public static void main(String[] args) {

//        Object obj = new String("Hello");
//        System.out.println(obj);
//
//        obj = new Integer(10);
//
//        String str = (String) obj;  // have to type cast
//
//

        Object obj[] = new Object[3];

        obj[0] = "hi";
        obj[1] = "Bye";
        obj[2] = new Integer(10);

        System.out.println(Arrays.toString(obj));

        String str;

        for (int i = 0; i < obj.length; i++){
            str = (String) obj[i];              // now it will give error since integer can't be converted to string here
            System.out.println(str);

        }

    }
}
