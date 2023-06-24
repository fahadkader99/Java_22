package march_april_23;

public class RemoveSpecialChars {

    public static void main(String[] args) {
        // remove special chars from a string
        String str = "F!@#A()H##%%**A))))(((__++D";

        String a = str.replaceAll("[^a-zA-Z]", "");
        System.out.println(a);

    }
}
