package april_Fool;

public class StringPalindrome {
    public static void main(String[] args) {
        String a = "Madam";
        String b = a;
        String c = "";

        for (int i = b.length()-1; i>=0; i--){
            c+= b.charAt(i);
        }
        if (b.equalsIgnoreCase(c)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Planindrome");
        }
    }
}
