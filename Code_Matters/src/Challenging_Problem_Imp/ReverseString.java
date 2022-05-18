package Challenging_Problem_Imp;

public class ReverseString {
    public static void main(String[] args) {
        // reverse a string

        String s = "12345";
        char[]ch = s.toCharArray();

        String a = "";

        for (int i = ch.length-1; i>=0; i--){
            a+= ch[i];
        }
        System.out.println(a);

        StringBuilder sb = new StringBuilder();
        sb.append(s);
        System.out.println(sb.reverse());


    }
}
