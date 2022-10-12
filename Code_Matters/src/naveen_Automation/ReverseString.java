package naveen_Automation;

import c_Bat.warmUp2.StringTimes;
import org.testng.annotations.Test;

public class ReverseString {
    // reverse string

    @Test
    void first(){
        String a = "Fahad";
        String b = "";
        for (int i=a.length()-1; i>=0; i--){
            b+= a.charAt(i);
        }
        System.out.println("Rev " + b);
    }

    @Test
    void two() {
        String a = "Fahad";
        StringBuilder sb = new StringBuilder(a.length());
        sb.append(a);
        System.out.println(sb.reverse());
    }
}
