package May;

public class RemoveJunkInString {
    // remove junk or special char in string

    public static void main(String[] args) {

        String a = "!@#1234Fahad)(&^% Kader";

        String b = a.replaceAll("[^a-zA-Z1-9]","");
        System.out.println(b);

    }
}
