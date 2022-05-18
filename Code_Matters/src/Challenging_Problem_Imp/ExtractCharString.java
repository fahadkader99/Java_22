package Challenging_Problem_Imp;

public class ExtractCharString {
    // extract the last 4 char of a string

    public static void main(String[] args) {
        String s = "www.fahad.com";

        String first = s.substring(0,4);
        String  last = s.substring(s.length()-4,s.length());
        System.out.println(first);
        System.out.println(last);
    }
}
