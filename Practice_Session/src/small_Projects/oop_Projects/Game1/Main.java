package small_Projects.oop_Projects.Game1;


public class Main {

    public static void main(String[] args) {

       Player1 fahad = new Player1("Fahad","Sword", 100);
//        System.out.println(player.getName());
//        System.out.println(player.getHealth());
//        System.out.println(player.getWeapon());

        System.out.println("\tPlayer Fahad >");
        fahad.damageByGun1();
        fahad.damagedByGun2();
        fahad.heal();





        System.out.println("\n\tPlayer Jahan >");
        Player2 jahan = new Player2("Jahan","Gun", 100, false);

        jahan.damagedByGun2();
        jahan.damageByGun1();
        jahan.damagedByGun2();

    }
}
