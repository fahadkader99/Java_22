package practice_session.Array.Single_Dimension;

import java.util.Arrays;

public class ArrayIntro2 {
    public static void main(String[] args) {

        String[]  name = {"Ashikul", "Kader", "Fahad"};

        System.out.println("THe element on index 2 is: " + name[2]);
        System.out.println("All the elements are: "+ Arrays.toString(name));

        splitArray();

    }
    public static void splitArray(){
        String str = "My name is Fahad";

        String[] s = str.split(" ");
        System.out.println(Arrays.toString(s));

        for (int i = 0; i < s.length; i ++){
            System.out.println(s[i]);
        }

    }

}
