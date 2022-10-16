package naveen_Automation;

import org.testng.annotations.Test;

import java.util.Arrays;

public class StringManipulation {

    @Test
    void manupulation(){
        String str = "The rains have started here schools";
        String str1 = "The rains have started here schools";

        System.out.println(str.length());

        System.out.println(str.charAt(5));

        System.out.println(str.indexOf('s'));       // picking the char at the given index

        System.out.println(str.indexOf('s', 9));    // 1st occurance of S

        System.out.println(str.indexOf('s', str.indexOf('s')+1));   // 2nd occurance of s

        System.out.println(str.indexOf("have"));    // index of string

        System.out.println(str.indexOf("hi"));      // if not available it will give -1

        System.out.println("\n");

        System.out.println(str.equals(str1));
        System.out.println(str==str1);          // is it not for strings, it is for values

        System.out.println(str.equalsIgnoreCase(str1));

        System.out.println(str.substring(0,9));

        //====================================
        String a = "   Fahad     Kader     ";       // Trim is only used for before & after space
        //System.out.println(a.trim());
        //System.out.println(a.replaceAll("\\s+", " "));
        String b = a.replaceAll("\\s+", " ");
        System.out.println(b.trim());

        String date= "10-10-2022";
        System.out.println(date.replace("-","/"));

        String c = "Hello_World_Test_Seleneium";
//        System.out.println(c.split("_"));
        String  [] ch = c.split("_");
        System.out.println(Arrays.toString(ch));

        String d = "Fahad ";
        String e = "Kader";
        System.out.println(d.concat(e));

        //============================
        int f = 100;
        int g = 200;
        System.out.println(d+e+f+g);
        System.out.println(f+g+d+e);
        System.out.println(d+e+(f+g));      // execution is done based of priority or left to right



        }
}
