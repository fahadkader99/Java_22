package march_22;

public class RemoveSpaces {
    public static void main(String[] args) {
        // remove white spaces
        String s = "1     bc    x    i";
        String str  = s.replaceAll("\\s","");
        System.out.println(str);




    }
}
