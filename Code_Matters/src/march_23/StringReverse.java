package march_23;

public class StringReverse {
    public static void main(String[] args) {
        String a = "12345";
        String rev = "";
        for (int i = a.length()-1; i>=0; i--){
            rev+= a.charAt(i);
        }
        System.out.println(rev);
    }
}
