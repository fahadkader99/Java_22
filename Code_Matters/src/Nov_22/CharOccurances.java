package Nov_22;

public class CharOccurances {

    // find the occurances of a given char

    public static void main(String[] args) {
        String  a = " Fahad Kader";

        int before = a.length();

        int after = a.replace("a", "").length();

        System.out.println("Char a occurred: " +(before - after));
    }
}
