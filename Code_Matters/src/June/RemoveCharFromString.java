package June;

public class RemoveCharFromString {
    // remove unnecessary char from a string

    public static void main(String[] args) {

        String a = "#@!%&*Fa)(Ha++__D)(*0@1";

        String b = a.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(b);
    }

}
