package march_22;

public class Conversion {
    public static void main(String[] args) {

        int a = 123;
        // convert to string
        String s = String.valueOf(a);
        System.out.println(s);

        // convert that string back to integer

        int c = Integer.parseInt(s);
        System.out.println(c);

    }
}
