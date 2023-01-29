package Nov_22;

public class RemoveSpaces {
    // remove white spaces in a given string

    public static void main(String[] args) {
        String a = "   F     Aha               d   ";

        String b = a.replaceAll("[\\s+]", "").trim();

        System.out.println(b);


    }
}
