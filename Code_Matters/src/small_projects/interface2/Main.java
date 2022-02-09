package small_projects.interface2;

public class Main {
    public static void main(String[] args) {
/*        DeskPhone phone  = new DeskPhone("123456");
        phone.powerOn();
        phone.callPhone("123456");
        phone.answer();*/

        MobilePhone mobile = new MobilePhone("12345");
        mobile.powerOn();
        mobile.callPhone("12345");
        mobile.answer();

    }
}
