package november_22;

public class RemoveSpecialCharacters {
    //
    public static void main(String[] args) {
        String a = "!@#$%&F%%$$#A((H&&A....123D";

        String  b = a.replaceAll("[^a-zA-Z]", "");

        System.out.println(b);
    }
}
