package June;

public class RemoveSpaces {
    // remove spaces from the sting

    public static void main(String[] args) {
        String a = "   f   a   h   a  d  ";

        System.out.println(a.trim());

        String b = a.trim();
        String c = "";

        for (int i = 0; i<b.length()-1; i++){
            if (b.charAt(i)!= ' ' && b.charAt(i+1) == ' '){
                c+= b.charAt(i);
            }
        }

        System.out.println(c);


        // 2nd Method
        String d = a.replaceAll("\\s+", "");

        System.out.println(d);
    }
}
