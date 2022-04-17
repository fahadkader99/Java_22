package april_Fool;

public class ReverseString2 {

    public static void main(String[] args) {

        String a = "12344";

        String b = "";
        for (int i = a.length()-1; i>=0;i--){
            b+= a.charAt(i);
        }

        System.out.println(b);
    }
}
