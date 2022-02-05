//package small_projects.oop.bankApplication;
//
//public abstract class Account {
//
//    // Base class
//    // abstract class
//
//    private int accountNumber;
//    protected double balance;
//
//    public Account(){
//        // default constructor
//    }
//    public Account(int accountNumber){
//        this.accountNumber=accountNumber;
//        balance = 0;
//    }
//
//    // getters
//    public double getBalance(){
//        return this.balance;
//    }
//
//    public int getAccountNumber(){
//        return this.accountNumber;
//    }
//
//    // Abstract method
//    /*
//    function to deposit funds into the account as long as the amount parameter is > 0
//
//    Apply transaction fee for the checking Account
//     */
//    public abstract void deposit(double amount);
//
//    /*
//    * Function to withdraw funds fromm the Account as long as
//    * 1. Amount withdraw must be >0
//    * 2. Amount to withdraw must be <= balance */
//    public abstract void withdraw(double amount);
//
//
//
//
//}
