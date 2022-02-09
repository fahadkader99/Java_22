package talent_LMS;

import java.util.Scanner;

public class PasswordChecker {
    /*
    Write a password checker program that will check passwords and username from Scanner,
    or the user will put the passwords and username in there).


The program will check these things for each password and username
1. a password must have at least characters 15 and username must be minimum 8.

2. If it is entered correct then you found the password otherwise it should say it is incorrect password.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password:");
        String pass = sc.nextLine();
        System.out.println("Enter your userName");
        String name = sc.nextLine();
        sc.close();


        if (pass.length()>=15){
            System.out.println("Your Password: "+ pass);
        }else System.out.println("Incorrect Password");

        if (name.length()>=8){
            System.out.println("Username: "+ name);
        }else System.out.println("Incorrect User name");
    }
}
