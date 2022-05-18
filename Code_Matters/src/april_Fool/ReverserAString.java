package april_Fool;

public class ReverserAString {
    // reverse a string
    public static void main(String[] args) {
        String  fahad = "Fahad Kader";
        String a = "";

        for (int i = fahad.length()-1; i>=0; i--){
            a+= fahad.charAt(i);
        }
        System.out.println(a);

    }
}
