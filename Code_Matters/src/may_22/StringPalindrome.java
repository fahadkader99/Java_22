package may_22;

public class StringPalindrome {

    // check if the string is palindrome or not

    public static void main(String[] args) {


        palindrome1();


    }
    public static void palindrome1(){

        String a = "Madam";
        String b = "";

        for (int i = 0; i<a.length();i++){
            b +=a.charAt(i);
        }
        if (a.equals(b)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }

    }
}
