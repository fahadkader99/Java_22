package november_22;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

    // check if given 2 string are same or not
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 String ");
        String a = sc.nextLine().trim().toLowerCase();
        String b = sc.nextLine().trim().toLowerCase();

        String c = a.replace(" ", "");
        String d = b.replace(" ", "");

        AnagramString ana = new AnagramString();
        //ana.anagram1(c,d);
        ana.anagram2(c,d);


    }

    void anagram1(String a , String b){
        char[] c = a.toCharArray();
        char[] d = b.toCharArray();
        boolean flag = true;

        Arrays.sort(c);
        Arrays.sort(d);

        if (c.length!=d.length){
            flag = false;
        }

        for (int i=0; i<c.length; i++){
            if (c[i] != d[i]){
                flag = false;
            }
        }

        if (flag){
            System.out.println("Anagram");
        }else {
            System.out.println("Not Anagram");
        }


    }


    void anagram2(String a, String b){
        char[] c = a.toCharArray();
        char[]d = b.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);

        if (c.length==d.length){
            if (Arrays.equals(c,d)){
                System.out.println("Anagram");
            }else {
                System.out.println("Not anagram");
            }

        }else {
            System.out.println("Not anagram");
        }
    }
}
