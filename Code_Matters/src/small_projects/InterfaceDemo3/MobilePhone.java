package small_projects.InterfaceDemo3;

public class MobilePhone implements Telephone{
    private String myNumber;
    private boolean isRinging;
    private boolean isPowerOn;

    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Mobile phone is powered on");
    }

    @Override
    public void dial(String phoneNumber) {
        System.out.println("Now ringing: "+ phoneNumber+ " on Mobile");
    }

    @Override
    public void answer() {
        if(isRinging && isPowerOn){
            System.out.println("Answering the Mobile");
            isRinging = false;
        }else {

        }
    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if(phoneNumber==myNumber && isPowerOn){
            isRinging = true;
            System.out.println("Mobile is ringing");
        }else {
            System.out.println("Wrong num entered || phone is off");
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
