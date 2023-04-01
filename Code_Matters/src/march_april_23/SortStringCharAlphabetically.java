package march_april_23;

import java.util.Arrays;
import java.util.Scanner;

public class SortStringCharAlphabetically {
    // sort string character alphabetically
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine().trim();
        sc.close();

        charSort(str);
        bubbleSort1(str);
        bubbleSort2(str);

    }

    static void charSort(String str){
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ch.length; i++){
            sb.append(ch[i]);
        }

        System.out.println("\nAfter sorting: " + sb);

    }

    static void bubbleSort1(String str){
        char[] ch = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ch.length -1; i++){
            for (int j = 0; j < ch.length -1; j++){
                if (ch[j] > ch[j+1]){
                    char temp = ch[j];
                    ch[j] = ch[j+1];
                    ch[j+1] = temp;
                }
            }
        }


        //System.out.println("Using Bubble sort 1 : " + Arrays.toString(ch));
        System.out.println("Using Bubble sort 1 : " + new String(ch));          // new string will convert the array to string on the fly - like String.valueOf


    }

    static void bubbleSort2(String str){
        char[] ch = str.toCharArray();
        for (int i = 0; i<ch.length; i++){
            for (int j = i+1; j<ch.length; j++){
                if (ch[i] > ch[j]){
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
        System.out.println("Using Bubble sort 2 : " + Arrays.toString(ch));
    }
}
