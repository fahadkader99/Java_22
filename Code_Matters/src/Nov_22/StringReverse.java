package Nov_22;

public class StringReverse {
    // reverse a string
    public static void main(String[] args) {
        String a = "12345";
        String b = "";

        for (int i=a.length()-1; i>=0; i-- ){
            b+=a.charAt(i);
        }
        System.out.println(b);

    }
}
