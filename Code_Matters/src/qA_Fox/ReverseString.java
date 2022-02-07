package qA_Fox;

public class ReverseString {

    public static void main(String[] args) {
        String str = "Fahad";

        String r = "";

        for (int i = 0; i<str.length();i++){
            r = str.charAt(i)+r;
        }
        System.out.println(r);




    }
}
