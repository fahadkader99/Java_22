package random;

import java.util.Scanner;

public class Password_Checker {
    /**
     * Write a Java method to check whether a string is a valid password.
     * Password rules:
     *
     * A password must have at least six characters.
     * A password consists of only letters and digits.
     * A password must contain at least two digits.
     *
     *
     * Input a password: devx2021
     * PW is Valid: devx2021
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your password : ");
        String password = input.nextLine();

        if (checkPassword(password)){
            System.out.println("Valid Password");
        }else {
            System.out.println("Invalid Password ! ");
        }


    }

    public static boolean checkPassword(String password){
        if (password.length() < 6){
            return false;
        }else {
            char c;
            int count = 0;
            for (int i = 0; i < password.length(); i++){
                c = password.charAt(i);
                if (Character.isDigit(c)){
                    count++;
                }else if (!Character.isLetterOrDigit(c)){
                    return false;
                }
            }
            if (count < 2){
                return false;
            }

        }
        return true;
    }

}
