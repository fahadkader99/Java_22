package march_22;

public class ReverseOrderString {
    //Create a method that takes a string as its argument and returns the string in reversed order.

    public static void main(String[] args) {
        String str = ".xof nworb kciuq ehT";

        String s = "";

        for (int i = str.length()-1;i>=0;i--){
            s += str.charAt(i);
        }
        System.out.println(s);
    }
}
