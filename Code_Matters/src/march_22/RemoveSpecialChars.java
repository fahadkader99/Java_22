package march_22;

public class RemoveSpecialChars {
    // remove special character from string using regex

    public static void main(String[] args) {
        String s = "!@#$39ab&*ohahai9";
        String str = s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(str);

    }

}
