package small_projects.oop.first_bank;

import java.util.Scanner;

public class Account {

    // class variable
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    // class constructor
    Account(String cname, String cid) {
        customerName = cname;
        customerId = cid;
    }


    // functions for deposits
    void deposit(int amount) {
        if (amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }


    // functions for withdrawing
    void withdraw(int amount) {
        if (balance != 0) {
            balance = balance - amount;
            previousTransaction = -amount;                  // not clear
        }
    }


    // functions showing previous transaction

    void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);

        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));

        } else {
            System.out.println("No transaction occurred");
        }


    }


    // Functions calculating interest of current fund after number of years

    void calculateInterest(int years) {

        double interestRate = .0185;
        double newBalance = (balance * interestRate * years) + balance;
        System.out.println("The current interest rate is " + (100 * interestRate));
        System.out.println("After " + years + " years, Balance will be $" + newBalance);
    }


    // Function showing the main menu

    void showMenu() {
        char option = '\0';                                                                 // this is how we give empty char
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, " + customerName + " ! ");
        System.out.println("Your ID is: " + customerId);
        System.out.println();
        System.out.println("What would you like to do ?");
        System.out.println();
        System.out.println("A. Check Balance");
        System.out.println("B. Make Deposit");
        System.out.println("C. Make Withdraw");
        System.out.println("D. View Previous Transaction");
        System.out.println("E. Calculate Interest");
        System.out.println("F. Exit");


        do {
            try {
                System.out.println();
                System.out.println("Enter option # ");
                char option1 = scanner.next().charAt(0);
                option = Character.toUpperCase(option1);

                switch (option) {

                    case 'A':
                        System.out.println("=======================================");
                        System.out.println("Balance = $" + balance);
                        System.out.println("=======================================");
                        break;

                    case 'B':
                        System.out.println("Enter deposit amount: ");
                        int amount = scanner.nextInt();
                        deposit(amount);
                        System.out.println();
                        break;

                    case 'C':
                        System.out.println("Enter withdraw amount: ");
                        int amount2 = scanner.nextInt();
                        withdraw(amount2);
                        System.out.println();
                        break;

                    case 'D':
                        System.out.println("=======================================");
                        getPreviousTransaction();
                        System.out.println("=======================================");
                        System.out.println();
                        break;

                    case 'E':
                        System.out.println("Enter how many years of accrued Interest: ");
                        int years = scanner.nextInt();
                        calculateInterest(years);
                        break;

                    case 'F':
                        System.out.println("=======================================");
                        break;

                    default:
                        System.out.println("Invalid input. Try: A | B | C | D | E | F ");
                        break;
                }

            } catch (Exception e) {
                System.out.println("Exception ....Try again");
            }

        } while (option != 'F');

        System.out.println("Thank you for banking with us...!");
        System.out.println("=======================================");


    }


}
