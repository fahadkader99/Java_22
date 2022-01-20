package practice_session.string;

import java.io.OutputStream;

public class StringBuilderDemo {
// try different methods

    public static void main(String[] args) {


//        StringBuilder s = new StringBuilder(name);
//        System.out.println(s);
//
//        StringBuilder sb = new StringBuilder("Fahad");
//        System.out.println(sb);
//
//        if (s.equals(sb)){
//            System.out.println("Equal");
//        }else {
//            System.out.println("Not equal");
//        }

        String a = "Fahad";
        String b = "Fahad";

        String c = new String("Fahad");

        System.out.println(a==b);
        System.out.println(a.equals(b));

        System.out.println(a==c);
        System.out.println(a.equals(c));


    }


}
