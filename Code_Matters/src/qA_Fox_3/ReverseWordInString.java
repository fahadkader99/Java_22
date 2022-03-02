package qA_Fox_3;

public class ReverseWordInString {
    // reverse all the word in a string.

    public static void main(String[] args) {
        String s = "My name is Fahad Kader";
        String[]str = s.split(" ");

        String r = "";
        for (int i =str.length-1; i>=0; i--){
            r+=str[i]+" ";
        }
        System.out.println(r);

    }
}
