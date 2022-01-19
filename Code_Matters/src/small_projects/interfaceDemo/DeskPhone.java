package small_projects.interfaceDemo;

public class DeskPhone implements Telephone{
    private String myNum;
    private boolean isRinging;

    public DeskPhone(){}

    public DeskPhone(String myNum){
        this.myNum = myNum;
    }

    @Override
    public void powerOn() {
        System.out.println("Desk phone is always powered on!");
    }

    @Override
    public void dial(String phoneNum) {
        System.out.println("Now ringing "+ phoneNum+ " on desk phone");
    }

    @Override
    public void answer() {
        if (isRinging){
            System.out.println("Answering the desk phone");
            isRinging = false;
        }else {
            System.out.println("Phone is not ringing");
        }
    }

    @Override
    public boolean callPhone(String phoneNum) {
        if (phoneNum==myNum){
            isRinging=true;
            System.out.println("Phone ringing");
        }else {
            System.out.println("");
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
