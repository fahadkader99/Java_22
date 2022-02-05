//package small_projects.oop.bankApplication;
//
//public class CheckingAccount extends Account{
//
//    // default transaction fee
//    private static double Fee = 2.5;
//
//    public CheckingAccount(){
//        // default constructor
//        super();
//    }
//
//    /*Parameter constructor to initialize Acc Num
//    * with a custom Acc Num and custom Transaction Fee*/
//
//    public CheckingAccount(int accountNumber, double fee){
//        super(accountNumber);
//        this.Fee = fee;
//    }
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
//            // apply transaction fee
//            balance -= Fee;
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
//            if (amount+Fee <=balance){
//                System.out.printf("Amount of %.2f withdrawn from Account%n", amount);
//                balance -= amount;
//                balance -= Fee;
//                System.out.printf("Fee of %.2f applied%n", Fee);
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
//}
