package small_projects.emailApp;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private String companySuffix = "abc.com";
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private int passwordLength = 6;
    static int count=1;

    // Constructor to receive the first and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("\n---- Email Created: "+count++ +" ---- ");

        // Call a method asking for the dept & return the Dept.
        this.department = setDepartment();
        //System.out.println("\nDepartment: " + this.department);

        // Call a method that return a random password
        this.password = randomPassword(passwordLength);
        //System.out.println("Password is: " + this.password);

        // Combine elements to generate email
        this.email = firstName.toLowerCase()+"."+ lastName.toLowerCase()+"@"+department+"."+companySuffix;
        //System.out.println("Email: " + this.email);

    }

    // Ask for department
    private String setDepartment(){
        System.out.print("Departments Code\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\nEnter Dept Code: ");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();

        if (deptChoice ==1){
            return "Sales";
        }else if (deptChoice==2){
            return "Dev";
        }else if (deptChoice==3){
            return "Accounting";
        }else {
            return "None";
        }
    }

    // Genarate a random pass
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*";    // set of chars to use for pass
        char[] password = new char[length];
        for (int i=0; i<length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);        // converting char array into String & returning
    }

    // Set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    // Set the alternateEmail
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
        return "\nDisplay Name: " + firstName +" " + lastName +" "+
                "\nCompany email: " + email+
                "\nPassword: " + password +
                "\nMailbox capacity: " + mailboxCapacity+" mb";
    }


}
