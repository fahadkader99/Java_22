package november_22;

public class RemoveUnknowCharJunk {
    // remove junk chars from a given string

    public static void main(String[] args) {
        String a = "123456789!@#$%&*F%%$$3-A##@HA#$D";

        String b = a.replaceAll("[^a-zA-Z]", "");
        System.out.println(b);
    }
}
