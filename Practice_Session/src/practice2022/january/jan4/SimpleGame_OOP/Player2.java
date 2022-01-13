package practice2022.january.jan4.SimpleGame_OOP;

public class Player2 extends Player1 {

    private int health;
    private boolean armour;

    public Player2(String name, String weapon, int health, boolean armour){
        super(name, weapon, health);
        this.health = health;
        this.armour = armour;

    }
    @Override
    public void damageByGun1() {
        if (armour){
            this.health -= 20;
            if (this.health <=0) this.health = 0;
            System.out.println("Armour is On. Hit by Gun1. Health reduced by 20 New health "+ this.health);
        }
        if (!armour){
            this.health -=30;
            if (this.health <= 0)this.health = 0;
            System.out.println("Armour is Off. Hit by gun1. Health is reduced by 30. New Health "+ this.health);
        }

        if (this.health==0){
            System.out.println(getName()+ " is dead!!!");
        }
    }

    @Override
    public void damageByGun2() {
        if (armour){
            this.health -= 40;
            if (this.health <=0) this.health = 0;
            System.out.println("Armour is On. Hit by Gun1. Health reduced by 40 New health "+ this.health);
        }
        if (!armour){
            this.health -=50;
            if (this.health <= 0)this.health = 0;
            System.out.println("Armour is Off. Hit by gun1. Health is reduced by 50. New Health "+ this.health);
        }

        if (this.health==0){
            System.out.println(getName()+ " is dead!!!");
        }
    }

//    @Override
//    public void heal() {
//        super.heal();
//    }
}

