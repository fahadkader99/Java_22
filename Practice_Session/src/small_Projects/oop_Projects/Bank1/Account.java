package small_Projects.oop_Projects.Bank1;

public class Account {
    private String AccNum;
    private double Balance;
    private String Name;
    private String Email;
    private String PhoneNum;

    public Account(String Number, double balance, String Name, String Email, String PhoneNum){  //constructor is done for .....
        this.AccNum = Number;
        this.Balance = balance;
        this.Name = Name;
        this.Email = Email;
        this.PhoneNum = PhoneNum;

    }

    public void depositMoney(double DepositedMoney){
        this.Balance = Balance + DepositedMoney;
        System.out.println("Deposit is Successful, New Balance = "+ this.Balance);
    }

    public void withDraw(double WithDrawMoney){
        if (this.Balance-WithDrawMoney <0){
            System.out.println("Unsuccessful only-> "+ this.Balance+ " is left!");
        }else {
            this.Balance =Balance- WithDrawMoney;
            System.out.println("WithDraw Successful, current Balance = "+ this.Balance);
        }
    }


    public String getAccNum() {         // getter & setter is used to access privet variable from outside
        return AccNum;
    }

    public void setAccNum(String accNum) {
        AccNum = accNum;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhoneNum() {
        return PhoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        PhoneNum = phoneNum;
    }
}
