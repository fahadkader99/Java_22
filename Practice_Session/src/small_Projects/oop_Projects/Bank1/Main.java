package small_Projects.oop_Projects.Bank1;

public class Main {

    public static void main(String[] args) {

        Account fahad = new Account("101", 0, "Fahad", "Kader@Gmail.com", "3025109896");  // constructor is helping to pass parameter

        System.out.println();
        fahad.depositMoney(100);
        fahad.depositMoney(150);
        fahad.withDraw(200);
    }
}



/*                  Project Structure.

Variable:

customer name;  AccNum; eMail; Balance; phoneNum;

Functions:

Deposit Money, Withdraw Money


 */