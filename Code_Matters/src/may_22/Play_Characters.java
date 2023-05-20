package may_22;

import java.util.Scanner;

public class Play_Characters {

    // print numbers of letter, digits, spaces and others

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line");
        String str = sc.nextLine();

        char[] ch = str.toCharArray();
        int letter = 0;
        int digit = 0;
        int space = 0;
        int other = 0;



//        for (int i = 0; i<ch.length;i++){
//
//            Character c = ch[i];
//
//            if (Character.isLetter(c)){
//                letter++;
//            }
//
//            if (Character.isDigit(c)){
//                digit++;
//            }
//
//            if (Character.isSpaceChar(c)){
//                space++;
//            }
//            else {
//                other++;
//            }
//        }

        for (Character c : ch){
            if (Character.isLetter(c)){
                letter++;
            }

            else if (Character.isDigit(c)){
                digit++;
            }

            else if (Character.isSpaceChar(c)){
                space++;
            }
            else {
                other++;
            }
        }

        System.out.println("Num of digits "+ digit);
        System.out.println("Num of letter "+ letter);
        System.out.println("Num of space "+ space);
        System.out.println("Num of other char "+ other);
        sc.close();


    }
}
