package talent_LMS;

import java.util.Scanner;

public class CountVowelsDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        int vCount = 0;
        int nCount = 0;
        for (int i = 0; i<str.length();i++){
            if (str.charAt(i)=='a'|| str.charAt(i)=='e' || str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u'){
                vCount++;
            }
        }
        System.out.println("No. of vowel "+ vCount);

        for (int i = 0; i <str.length();i++){
            if ( str.charAt(i)=='0'||str.charAt(i)=='1' ||str.charAt(i)=='2'||str.charAt(i)=='3'||str.charAt(i)=='4'||str.charAt(i)=='5'||str.charAt(i)=='6'||
                    str.charAt(i)=='7'||str.charAt(i)=='8'||str.charAt(i)=='9'){
                nCount++;

            }
        }

        System.out.println("No. of digits: "+ nCount);

    }
}
