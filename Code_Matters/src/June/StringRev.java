package June;

public class StringRev {
    public static void main(String[] args) {
        // reverse a string

        String  a = "Fahad";
        String b = "";
        for (int i = a.length()-1; i>=0; i--){
            b+= a.charAt(i);
        }
        System.out.println(b);



    }
}
