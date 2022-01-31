package small_projects.oop.emailApp;

import java.util.Scanner;

// the whole app is working through the constructor:
    // the power of constructor is huge.

public class Emails {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity=500;
    private String alternateEmail;
    private int passwordLength = 8;
    private String email;
    private String company = "entertainment.com";
    static int count = 1;


    // constructor to receive the firstname and last
    public Emails(){}
    public Emails(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("\n\nEmail "+count+++" Generated # "+this.firstName+" "+ this.lastName);

        // calling the method asking for department and returning the department
        this.department = setDepartment();
//        System.out.println("Department: "+ this.department);

        // Call a method to generate random Password
        this.password = randomPassword(passwordLength);
        System.out.println("Your temp. password is: "+ this.password);

        // combine elements to generate email
        email = this.firstName+"."+this.lastName+"@"+department+"."+company;
        System.out.println("New email: "+ email);

    }



    // ask for the department.
    private String setDepartment(){
        System.out.println("\nDepartment Code:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter the department code: ");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();

        if (deptChoice==1){
            return "sales";
        }else if(deptChoice==2){
            return "dev";
        }else if (deptChoice==3){
            return "acc";
        }else {
            return "null";
        }


    }


    // generate random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*1234567890";
        char[] password = new char[length];
        for (int i = 0; i<length;i++){
           int rand = (int)(Math.random() * passwordSet.length());
           password[i] = passwordSet.charAt(rand);
        }
        return new String(password);

    }


    // set mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    // set alternate email
    public void setAlternateEmail(String mail){
        this.alternateEmail = mail;
    }

    // change the password
    public void changePassword(String pass){
        this.password = pass;
    }




    // getters
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
        return "Display Name: "+firstName+" "+lastName+
                "\nCompany email: "+email+
                "\nMailbox capacity: "+mailboxCapacity+" mb";
    }


}
