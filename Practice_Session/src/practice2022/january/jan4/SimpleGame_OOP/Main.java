package practice2022.january.jan4.SimpleGame_OOP;

public class Main {
    public static void main(String[] args) {

        Player1 p1 = new Player1("Ash", "Gun", 100);
        p1.damageByGun1();
        p1.heal();

        Player2 p2 = new Player2("Kader", "Sword", 50, true);
        p2.damageByGun1();
        p2.heal();
//        p2.damageByGun1();
//        p1.heal();



    }
}
 