//package small_projects.oop.bankApplication;
//
//public class SavingsAccount extends Account {
//   // has an interest rate
//    // method to apply interest - profit
//
//    private double interestRate;
//
//
//    public SavingsAccount(){
//        super();
//    }
//    public SavingsAccount(int accountNumber, double interestRate){
//        super(accountNumber);
//        this.interestRate = interestRate;
//
//    }
//    // getter
//    public double getInterestRate(){
//        return this.interestRate;
//    }
//    public void setInterestRate(double interestRate){
//        this.interestRate = interestRate;
//    }
//    public double calculateInterest(){
//        return balance * interestRate;
//    }
//    public void applyInterest(){
//        double interest = calculateInterest();
//        System.out.printf("Interest amount %.2f added to balance%n", interest);
//        deposit(interest);
//    }
//
//
//
//
//    // Abstract method
//    /*
//    function to deposit funds into the account as long as the amount parameter is > 0
//
//    Apply transaction fee for the checking Account
//     */
//    public void deposit(double amount){
//
//        // first check amount
//        if (amount>0){
//            balance += amount;
//            System.out.printf("Amount %.2f deposited%n",amount);
//
//
//            System.out.printf("Fee %.2f Applied%n",Fee);
//            System.out.printf("Current Balance is:  %.2f%n",balance);
//
//        }else {
//            System.out.println("A negative can't be deposited. ");
//        }
//
//    }
//
//    /*
//     * Function to withdraw funds fromm the Account as long as
//     * 1. Amount withdraw must be >0
//     * 2. Amount to withdraw must be <= balance */
//    public void withdraw(double amount){
//        // check first
//
//        if (amount> 0){
//            // check sufficient balance:
//            if (amount <=balance){
//                System.out.printf("Amount of %.2f withdrawn from Account%n", amount);
//                balance -= amount;
//                System.out.printf("Current Balance is: %.2f%n", balance);
//
//
//            }
//        }
//        else {
//            System.out.println("A negative can't be withdrawn !");
//        }
//    }
//
//
//}
