//package small_projects.oop.bankApplication;
//
//import java.util.Scanner;
//
//public class AccountDriver {
//
//    public static void main(String[] args){
//
//        Scanner keyboard = new Scanner(System.in);
//
//        // Create array of accounts:
//        Account[] account = new Account[10];
//
//
//
//    }
//    public static int accountMenu(Scanner keyboard){
//        System.out.println("Select Account Type:");
//        System.out.println("1. Checking Acc");
//        System.out.println("2. Savings Acc");
//
//        int choice;
//
//        do {
//            System.out.println("Enter choice");
//            choice = keyboard.nextInt();
//        }while (choice <1 || choice >2);
//        return choice;
//    }
//    public int searchAccount(Account account[], int count, int accountNumber){
//        for (int i = 0; i< count;i++){
//            if (account[i].getAccountNumber()== accountNumber){
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    /*
//    Function to perform on a selected account
//     */
//    public void doDeposit(Account account[], int count, Scanner keyboard){
//
//        System.out.print("\nPlease enter account number: ");
//        int accountNumber = keyboard.nextInt();
//
//        // search for account
//        int index = searchAccount(account,accountNumber);
//    }
//
//
//    public static Account createAccount(Scanner keyboard){
//        // Function to create new Account
//        Account account = null;
//
//        int choice = accountMenu(keyboard);
//
//        int accountNumber;
//        System.out.print("Enter Acc Num: ");
//        accountNumber = keyboard.nextInt();
//
//        if (choice ==1){
//            System.out.print("Enter Transaction Fee: ");
//            double fee = keyboard.nextDouble();
//            account = new CheckingAccount(accountNumber, fee);
//        }else {
//            System.out.print("Please enter Interest Rate: ");
//            double rate = keyboard.nextDouble();
//
//            account = new SavingsAccount(accountNumber, rate);
//        }
//        return account;
//
//
//    }
//
//
//
//
//
//
//    public int menu(Scanner keyboard){                  // Menu function
//        System.out.println("Bank Account Menu: ");
//        System.out.println("1. Create New Account");
//        System.out.println("2. Deposit Funds");
//        System.out.println("3. Withdraw Funds");
//        System.out.println("4. Quit");
//
//        int choice;
//
//        do {
//            System.out.print("Enter choice: ");
//            choice = keyboard.nextInt();
//        }while (choice <1 || choice>4);
//        return choice;
//
//
//
//    }
//
//}
