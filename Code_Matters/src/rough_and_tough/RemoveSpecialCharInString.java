package rough_and_tough;

public class RemoveSpecialCharInString {
    // how to remove junk / special char from string:
    // we are going to do this using regular expression and with replace all method

    public static void main(String[] args) {

        String s = "@#%&$^@(#* latin string 12345678";

        String str = s.replaceAll("[^a-zA-Z0-9]","");     // it will replace any char other than given with whitespace

        System.out.println("After Remove: "+str);

        String str1 = "!&^*&&^%&%$^$# Testing (&*)(*&*&^%&^ JAVA *&^&%^%$%$# Selenium &*^%&*^%&";

        str1 = str1.replaceAll("[^a-zA-Z0-9]","");
        System.out.println("After removing: "+str1);

    }
}
