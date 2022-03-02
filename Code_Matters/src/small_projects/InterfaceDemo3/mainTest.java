package small_projects.InterfaceDemo3;

public class mainTest {

    public static void main(String[] args) {
//        DeskPhone d = new DeskPhone("12345");
//        d.powerOn();
//        d.callPhone("12345");
//        d.answer();

        MobilePhone mobilePhone = new MobilePhone("12345");
        mobilePhone.powerOn();
        mobilePhone.callPhone("12345");
        mobilePhone.answer();
    }

}
