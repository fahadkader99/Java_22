package practice_session.Basics_Code;

import java.util.Scanner;

public class Find_LastWord_After_Space {
    // find the length of word from a string, after the last space
    // ex a =    My name    is  Fahad.

    public static void main(String[] args) {

       // String name = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence with white spaces: ");
        String name = input.nextLine();
        Find_LastWord_After_Space f = new Find_LastWord_After_Space();
        System.out.println(f.findLastIndex(name));


    }

    public int findLastIndex(String name) {
        //name = "    I      am     Fahad    ";

        name = (name.trim());
        return name.substring(name.lastIndexOf(" ") + 1).length();
    }
}
