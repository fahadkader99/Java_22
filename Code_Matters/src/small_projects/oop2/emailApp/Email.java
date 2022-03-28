package small_projects.oop2.emailApp;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private int passwordLength = 6;
    private String email;
    private String companySuffix = "abxcompany.com";

     // constructor to  receive first and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        //System.out.println("\nEmail Created: "+ this.firstName+" "+this.lastName);

        // call the method that returns the password
        this.department = setDepartment();
        //System.out.println("Department: "+ this.department);

        // call the method that returns a random password
        this.password = randomPassword(passwordLength);
        //System.out.println("Your password: "+ this.password);

        // generate the new Email:
         email = firstName.toLowerCase()+"."+lastName+"@"+department+"."+companySuffix;
        //System.out.println("Your emil: "+email );

    }

    // ask for department
    private String setDepartment(){
        System.out.println("\nDept. Codes:\n1 Sales\n2 Development\n3 Accounting\n0 None\nEnter code: ");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();

        if (deptChoice==1){
            return "Sales";
        }else if (deptChoice==2){
            return "Dev";
        }else if (deptChoice==3){
            return "Accounting";
        }else {
            return "No Department";
        }

    }

    // generate random password
    private String randomPassword(int length){
        String passwordSet= "abcdefghihklmnopqestuvwxyz1234567890!@#$%";
        char[] password = new char[length];

        for (int i= 0; i<length;i++){
            int rand = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);

        }
        return new String(password);

    }

    // set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }


    // set the alternate email
    public void setAlternateEmail(String email){
        this.alternateEmail = email;
    }

    // change the password
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailboxCapacity(){
        return mailboxCapacity;
    }
    public String getAlternateEmail(){
        return "Alternate email: "+alternateEmail;
    }
    public String getPassword(){
        return password;
    }

    public String showInfo(){
        return "\nName: "+ firstName+" "+ lastName+
                "\nCompany Email: "+ email+
                "\nMailbox capacity: "+ mailboxCapacity+"mb"+
                "\nDepartment: "+ department+
                "\nTemp. pass: "+ password;
    }


}
// This program show the power of "Constructor" ...>!!!