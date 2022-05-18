package May;

import april_Fool.CharCount;

public class CountCharInString {
    // count the number of char in a sting

    public static void main(String[] args) {

        String a = "Fahad kader";

        easyWay(a);
        anotherWay(a);

    }
    public static void easyWay(String a){
        char[] ch = a.toCharArray();
        System.out.println(ch.length);

        System.out.println(a.length());
    }

    public static void anotherWay(String a){        // not accurate;

        int count = 1;

        for (int i = 0; i<a.length();i++){
            if (a.charAt(i) != ' ');
            count++;
        }
        System.out.println("No of CHar "+ count );
    }
}
