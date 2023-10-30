package november_22;

public class Conversion {
    public static void main(String[] args) {

        String a = "123";
        int b = Integer.parseInt(a);        // ParseInt return > Primitive Data Type
        System.out.println(b);

        String c = String.valueOf(b);       // ValueOf return > Wrapper | Objects
        System.out.println(c);
    }
}
