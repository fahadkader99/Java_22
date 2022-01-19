package small_projects.interfaceDemo;

public class MobilePhone implements Telephone {

    private String myNum;
    private boolean isRinging;
    private boolean isPowerOn;

    public MobilePhone(){}

    public MobilePhone(String phoneNum){
        this.myNum = phoneNum;
    }


    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Phone powered on");
    }

    @Override
    public void dial(String phoneNum) {
        System.out.println("Now ringing "+ phoneNum+ " on desk phone");
    }

    @Override
    public void answer() {
        if (isRinging && isPowerOn){
            System.out.println("Answering the Mobile phone");
            isRinging = false;
        }else {
            //System.out.println("Phone is not ringing");
        }
    }

    @Override
    public boolean callPhone(String phoneNum) {
        if (phoneNum==myNum && isPowerOn){
            isRinging=true;
            System.out.println("Phone ringing");
        }else {
            System.out.println("Wrong Num || Phone is Off");
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
