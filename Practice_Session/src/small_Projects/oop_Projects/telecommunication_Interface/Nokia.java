package small_Projects.oop_Projects.telecommunication_Interface;

public class Nokia implements Telephone{

    private String myNum;
    private boolean isRinging;

    public Nokia(String myNum){
        this.myNum = myNum;
    }

    @Override
    public void powerOn() {
        System.out.println("Nokia is powered on");
    }

    @Override
    public void dialNumber(String phoneNum) {
        System.out.println("Now dialing: "+ phoneNum+ " on Nokia ");
    }

    @Override
    public void answerCall() {
        if (isRinging){
            System.out.println("Answering the phone");
            isRinging = false;
        }else System.out.println("Phone is not ringing");
    }

    @Override
    public boolean callPhone(String phoneNum) {
       if (phoneNum == myNum){
           isRinging = true;
           System.out.println("Phone is ringing");
       }else {
           System.out.println("Do not call yet");
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
