package march_april_23;

public class CharToStr {
    // convert a char into string & string into char

    public static void main(String[] args) {

        char ch = 'a';

        // using Character
        String a = Character.toString(ch);
        System.out.println("String is: " + a);

        //  using Value of
        String b = String.valueOf(ch);
        System.out.println(b);

        // convert the string into char
        String str = "Fahad";
//        char ch1 = str.charAt(0);
//        System.out.println(ch1);
        for (int i = 0; i<str.length(); i++){
            System.out.println(str.charAt(i) +" in position: " + i);
        }



    }

}
