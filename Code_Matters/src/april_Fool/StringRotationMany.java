package april_Fool;

import java.util.Arrays;
import java.util.Scanner;

public class StringRotationMany {
    // left rotate a string by 1 position

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();                       // Fahad  -- solve it just like array left rotaation


        //leftRotate1(s);
        leftRotate3(s);

    }

    public static void leftRotate1(String s) {
        char[] arr = s.toCharArray();

        System.out.println(Arrays.toString(arr));

        char left = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = left;

        StringBuilder sb = new StringBuilder();
        for (Character c : arr) {
            sb.append(c);
        }
        System.out.println(sb);
    }

    public static void leftRotate3(String s) {
        char[] arr = s.toCharArray();

        for (int j = 0; j < 3; j++) {
            char left = arr[0];
            for (int i = 0; i < arr.length-1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = left;
        }

        StringBuilder sb = new StringBuilder();
        for (Character c : arr){
            sb.append(c);
        }
        System.out.println(sb);

    }
}
