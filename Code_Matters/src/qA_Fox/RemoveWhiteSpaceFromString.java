package qA_Fox;

public class RemoveWhiteSpaceFromString {
    // remove the white spaces from the string


    public static void main(String[] args) {
        String s = "A  B        C    D";
        System.out.println("Before length "+s.length());

        String str = s.replaceAll("\\s","");
        System.out.println("After lenght "+str.length());
        System.out.println(str);


    }
}
