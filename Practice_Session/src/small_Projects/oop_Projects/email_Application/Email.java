package small_Projects.oop_Projects.email_Application;

//https://www.youtube.com/watch?v=U3Ibvu0htNs

import java.util.Map;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 200;
    private int defaultPasswordLength = 8;
    private String alternateEmail;
    private String companySuffix = "Devx.com";
    static int count = 1;

    // constructor to receive the first and last name;
    public Email(String firstName, String lastName){    // is mainly used to initialize variable
        System.out.println("\nEmail acc # "+ count++);
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Current User: "+ this.firstName+ " "+ this.lastName);


        // Call a method asking for the department - return the department.
        this.department = setDepartment();
        System.out.println("\nDepartment: "+ this.department);

        // call a method that returns random password.
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your temp. password is: "+ this.password);

        // Combine elements to generate email.
        email = firstName.toLowerCase() +"."+ lastName.toLowerCase()+ "@" + department +"."+ companySuffix;
        System.out.println("Your email ID: "+ email);


    }



    // Ask for the department
    private String setDepartment(){
        System.out.print("\nDEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\nEnter Dept. code: ");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();

        if (deptChoice == 1){
            return "Sales";
        }else if (deptChoice ==2){
            return "Development";
        }else if (deptChoice ==3){
            return "Accounting";
        }else{
            return "null";  // returning nothing fo none
        }

    }

    // generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&*";
        char[] password = new char[length];
        for (int i = 0; i < length; i++){
           int rand =  (int)(Math.random() * passwordSet.length());
           password[i]= passwordSet.charAt(rand);
        }
        return new String(password);


    }

                                    // Setters & Getters

    // set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    // set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    // Change the password
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailboxCapacity(){
        return mailboxCapacity;
    }

    public String getAlternateEmail(){
        return alternateEmail;
    }
    public String getPassword(){
        return password;
    }

    public String showInfo(){
        return "\n\nName: "+ firstName +" "+ lastName +
                "\nEmail: "+ email +
                "\nMailbox capacity: "+ mailboxCapacity + "mb " +
                "\nTemp. password: "+ password;

    }



}
