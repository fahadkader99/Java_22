package small_Projects.oop_Projects.telecommunication_Interface;

public interface Telephone {
    // powerOn
    // dialNumber
    // answerCall
    // callAnotherPhone
    // isRinging
    // sendText

    void powerOn();
    void dialNumber(String phoneNum);
    void answerCall();
    boolean callPhone(String phoneNum);
    boolean isRinging();
    void sendTest(String text);

}
