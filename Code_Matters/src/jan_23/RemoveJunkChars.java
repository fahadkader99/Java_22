package jan_23;

public class RemoveJunkChars {
    // remove junk chars from a string
    public static void main(String[] args) {
        String a = "!@#$&*(())__Fa##@@&&123";
        String b = a.replaceAll("[^a-zA-Z]","");

        System.out.println(b);
    }
}
