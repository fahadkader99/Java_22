package small_Projects.oop_Projects.bank2;
//https://www.youtube.com/watch?v=hNBUBbSMRfE&list=PLH4J8-mrXarEW2LuvRX_rOrVFnWdZA8NB&index=4
public class Main {
    /*
    Project of Bank application:
    user can create acc, deposit money and withdraw money.

    Properties: customer name, Acc number, email, balance, phone number
    Function: Deposit & withdraw money
     */

    public static void main(String[] args) {

        Acc a = new Acc("Fahad", "101", 500, "ash@gmail.com", "302");
        a.setBalance(1000);
        a.depositMoney(500);
        a.withdrawMoney(500);
        System.out.println(a.getBalance());
        a.withdrawMoney(2000);
        a.depositMoney(5000);
        a.withdrawMoney(2000);








    }

}
