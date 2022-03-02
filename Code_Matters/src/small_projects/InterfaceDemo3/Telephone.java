package small_projects.InterfaceDemo3;

public interface Telephone {
    // power on
    // dial num
    // and call
    // call another phone
    // is ringing

    void powerOn();
    void dial(String phoneNumber);
    void answer();
    boolean callPhone(String phoneNumber);
    boolean isRinging();


}
