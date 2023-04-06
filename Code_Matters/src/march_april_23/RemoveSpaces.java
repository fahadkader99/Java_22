package march_april_23;

import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String with spaces: ");
        String a = sc.nextLine();
        sc.close();

        replace(a);
        charLoop(a);
        strBuilder(a);
        strLoop(a);
    }

    static void replace(String str){
        str = str.replaceAll("\\s+", "");
        System.out.println("After removal: " + str);
    }

    static void charLoop(String str){
        String replace = "";
        char[] ch = str.toCharArray();

        for (int i = 0; i< ch.length; i++){
            if (ch[i] != 32 && ch[i] != 9){
                replace+= ch[i];
            }
        }
        System.out.println("/nWith Char replace using loop: "+replace);

    }

    static void strBuilder(String str){
        StringBuilder sb = new StringBuilder();
        String replace = "";

        for (int i = 0; i<str.length(); i++){
            if (!Character.isWhitespace(str.charAt(i))){
               replace+= str.charAt(i);
            }
        }
        System.out.println("With StringBuilder replace : "+replace);
    }

    static void strLoop(String str){
        String replace = "";
        for (int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch != 9 && ch != 32){
                replace+=ch;
            }
        }
        System.out.println("using loop: "+replace);
    }
}
