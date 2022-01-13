package practice2022.january.jan5;

public class Enemy {
    int health;

    public void talk(){
        System.out.println("I am an enemy");
    }
    public void fight(){
        System.out.println("Lets fight Enemy");
    }

}

class Vampire extends Enemy{

    @Override
    public void talk(){
        System.out.println("I am vampire not enemy");
    }

    @Override
    public void fight() {
        System.out.println("Lets fight Vampire");
    }
}

class wolf extends Enemy{
    @Override
    public void talk(){
        System.out.println("This is wolf");
    }
}


class Main{
    public static void main(String[] args) {
        Enemy w = new wolf();
        w.talk();
        Enemy v = new Vampire();
        v.fight();

    }
}
