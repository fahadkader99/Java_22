package small_Projects.oop_Projects.telecommunication_Interface;

public class Android implements Telephone{
    private String myNum;
    private boolean isRinging;
    private boolean isPowerOn;

    public Android(String myNum){
        this.myNum = myNum;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Android is always on. ! ");
    }

    @Override
    public void dialNumber(String phoneNum) {
        System.out.println("Now dialing: "+ phoneNum+ " on Android ");
    }

    @Override
    public void answerCall() {
        if (isRinging && isPowerOn){
            System.out.println("Answering the phone");
            isRinging = false;
        }else {

        }
    }

    @Override
    public boolean callPhone(String phoneNum) {
        if (phoneNum == myNum){
            isRinging = true;
            System.out.println("Phone is ringing");
        }else {
            System.out.println("Wrong num entered or Phone is off");
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

    @Override
    public void sendTest(String text) {
        System.out.println("If phone not picked, leave a massage : "+ text);
    }

}
