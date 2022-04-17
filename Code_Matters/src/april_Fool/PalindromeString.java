package april_Fool;

public class PalindromeString {

    public static void main(String[] args) {

        String a = "MADAM";
        String b = a;

        String c = "";
        for (int i = a.length()-1; i>=0; i--){
            c += a.charAt(i);
        }
        System.out.println(c);

        if (b.equalsIgnoreCase(c)){
            System.out.println("palindrome");
        }else {
            System.out.println("Not palindrome");
        }
    }
}
