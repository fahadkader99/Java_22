package march_22;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
    // listen - silent

    // find if both of them anagram or not
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 string:");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        String s3 = s1.replace(" ","");
        String s4 = s2.replace(" ","");

        AnagramString a = new AnagramString();
        a.anagramOne(s1,s2);


    }
    public void anagramOne(String s3, String s4){

        char [] ch1 = s3.toCharArray();
        char[] ch2 = s4.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean ana = false;

        if (ch1.length==ch2.length){
            for (int i = 0; i<ch1.length;i++){
                if (ch1[i]==ch2[i]);
                ana = true;
            }
        }

        if (ana==true){
            System.out.println("Both are anagram");
        }else {
            System.out.println("Not Anagram");
        }
    }
}
