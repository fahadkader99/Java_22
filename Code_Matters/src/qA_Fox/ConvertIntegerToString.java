package qA_Fox;

public class ConvertIntegerToString {
    public static void main(String[] args) {

        // convert a integer into string

        int num = 1234;

        String ass = String.valueOf(num);   // wrong.
        System.out.println(ass);

        String str = Integer.toString(num);   // wright
        System.out.println(str);




    }
}
