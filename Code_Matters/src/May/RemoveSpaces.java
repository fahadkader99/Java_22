package May;

public class RemoveSpaces {
    // remove all white spaces from a string

    public static void main(String[] args) {
        String a = "  F  ah  a  d   ";
        String b = a.replaceAll("\\s+","").trim();

        System.out.println(b);
    }
}
