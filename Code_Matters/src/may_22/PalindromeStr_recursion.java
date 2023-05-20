package may_22;

public class PalindromeStr_recursion {
    public static void main(String[] args) {

        // find Palindrome string using Recursion
            // Recursion-means: a method calling itself

        String str = "madam";
        boolean result = isPalindrome(str);

        System.out.println(str+" is Palindrome = "+ result);



    }
    public static boolean isPalindrome(String str){
        // 1st check the edge cases

        if (str==null){
            return false;
        }

        if (str.length()<=1){
            return true;
        }

        String first = str.substring(0,1);
        String last = str.substring(str.length()-1, str.length());

        if (!first.equals(last)){
            return false;
        }else {
            return isPalindrome(str.substring(1, str.length()-1));
        }

    }
}
