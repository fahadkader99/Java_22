package small_projects.interface2;

public class MobilePhone implements Telephone{
    private String myNumber;
    private boolean isRinging;
    private boolean ispPowerOn;

    public MobilePhone(String myNumber){
        this.myNumber=myNumber;
    }
    @Override
    public void powerOn() {
        ispPowerOn = true;
        System.out.println("Phone powered on");
    }

    @Override
    public void dial(String phoneNumber) {
        System.out.println("Now ringing "+ phoneNumber+" on deskPhone");
    }

    @Override
    public void answer() {
        if(isRinging && ispPowerOn){
            System.out.println("Answering the Mobile Phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if (phoneNumber == myNumber && ispPowerOn){
            isRinging = true;
            System.out.println("Phone is ringing");
        }else {
            System.out.println("Either wrong number entered or phone is off");
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

}
