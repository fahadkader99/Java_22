package small_Projects.oop_Projects.bank2;

public class Acc {

    private String Name;
    private String Number;
    private double Balance;
    private String Email;
    private String PhoneNum;
    static int count;


    public Acc(){
        count++;
        System.out.println("\nNew Account # "+ count);
    }

    public Acc(String Name, String Number, double Balance, String Email, String PhoneNum){
        this();
        this.Name = Name;
        this.Number = Number;
        this.Balance = Balance;
        this.Email = Email;
        this.PhoneNum = PhoneNum;

    }

    public void depositMoney(double depositedMoney){

        this.Balance += depositedMoney;
        System.out.println("Deposit is done. New Balance: "+ this.Balance);

    }


    public void withdrawMoney(double withdrawalMoney){
        if (this.Balance-withdrawalMoney < 0){
            System.out.println("Cash out Unsuccessful. " + this.Balance + " is remaining balance" );
        }else {
            this.Balance -= withdrawalMoney;
            System.out.println("Cas out is done. New Balance: "+ this.Balance);
        }
    }




    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
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
