package april_Fool;

import java.util.Scanner;

public class LeftRotateStringBy3 {

    public static void main(String[] args) {
        // left rotate a string by 3 position
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String s = sc.nextLine();
        System.out.println("Enter the Number to left rotate?");
        int num = sc.nextInt();
        sc.close();


        char[] ch = s.toCharArray();
        //          Fahad

        for (int j = 0; j<num;j++) {
            char left = ch[0];
            for (int i = 0; i < ch.length - 1; i++) {
                ch[i] = ch[i + 1];
            }
            ch[ch.length - 1] = left;
        }
        //System.out.println(Arrays.toString(ch));

        StringBuilder sb = new StringBuilder();
        for (Character c: ch){
            sb.append(c);
        }
        System.out.println(sb);


    }
}
