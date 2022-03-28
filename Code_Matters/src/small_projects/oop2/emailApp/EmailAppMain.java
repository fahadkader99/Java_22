package small_projects.oop2.emailApp;

public class EmailAppMain {

    public static void main(String[] args) {

        Email mail = new Email("Josh","Smith");
        mail.setMailboxCapacity(1000);
        //mail.setAlternateEmail("kader@gmail.com");
        System.out.println(mail.showInfo());
        System.out.println(mail.getAlternateEmail());
    }
}
