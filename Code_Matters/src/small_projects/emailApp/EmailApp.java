package small_projects.emailApp;

public class EmailApp {

    public static void main(String[] args) {

        Email em1 = new Email("Fahad", "Kader");

//        em1.setAlternateEmail("fahad111@gmail.com");
//        System.out.println(em1.getAlternateEmail());
        System.out.println(em1.showInfo());

        Email em2 = new Email("Esrat", "Jahan");
        System.out.println(em2.showInfo());



    }
}
