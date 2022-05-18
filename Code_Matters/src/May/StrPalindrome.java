package May;

public class StrPalindrome {

    // check the given string is palindrome or not

    public static void main(String[] args) {

        String s = "fasam";

        String  t = "";

        for (int i = s.length()-1; i>=0; i--){
            t+= s.charAt(i);
        }
        System.out.println(t);

        if (s.equalsIgnoreCase(t)){
            System.out.println("Pal");
        }else {
            System.out.println("Not pal");
        }
    }
}
