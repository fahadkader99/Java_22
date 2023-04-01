package march_april_23;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 for String.\n2 for Integer");
        int choice = sc.nextInt();
        Palindrome pal = new Palindrome();

        switch (choice){
            case 1: Scanner scanner = new Scanner(System.in);
                System.out.println("Enter String");
                String s = scanner.nextLine().trim();
                pal.str(s);
                scanner.close();
                break;

            case 2:
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Enter a Integer: ");
                int num = scanner1.nextInt();
                pal.numPal(num);
                scanner1.close();
                break;

            default:
                System.out.println("Try Again | Not a valid Input..");
        }
        sc.close();


    }

    void str(String str){

        String rev = "";
        for (int i = str.length()-1; i>=0; i--){
            rev+= str.charAt(i);
        }

        if (str.equalsIgnoreCase(rev)){
            System.out.println("Palindrome String");
        }else {
            System.out.println("Not Palindrome");
        }
    }


     void numPal(int arr){
        int num = arr;
        int rev = 0;
        while (arr > 0){
            int rem = num % 10;
            rev = (rev * 10) + rem;
            arr =  arr/10;
        }

        System.out.println("Rev - "+ rev);
        System.out.println("Original - "+ num);

        if (rev == num){
            System.out.println("Palindrome Num");
        }else {
            System.out.println("Not a Palindrome");
        }
    }
}
