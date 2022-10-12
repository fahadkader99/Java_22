package June;

import java.util.Scanner;

public class FindCharOcurrance {

    // find specific char how many times it is repeated.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence");
        String line = sc.nextLine();
        System.out.println("Enter a work you are looking for !!! ");
        char ch = sc.next().charAt(0);
        sc.close();

        boolean flag = false;
        int count = 0;

        for (int i = 0; i<line.length(); i++){
            if (line.charAt(i)== ch){
                count++;
                flag = true;
            }
        }

        if (flag==true){
            System.out.println(ch+" = " + count);
        }else {
            System.out.println("Character not found in the String.... ");
        }

    }
}
