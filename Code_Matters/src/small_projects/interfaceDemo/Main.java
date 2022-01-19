package small_projects.interfaceDemo;

public class Main {

    public static void main(String[] args) {

//        DeskPhone myPhone = new DeskPhone("3025109096");           // this is static
//        myPhone.powerOn();
//        myPhone.callPhone("3025109896");
//        myPhone.answer();

        MobilePhone mobile = new MobilePhone("12345");
        mobile.powerOn();
        mobile.callPhone("12345");
        mobile.answer();

    }
}
