package small_Projects.oop_Projects.Game1;

public class Player2 extends Player1{       // extends all the properties of Player 1
    private int health;
    private boolean armor;

    public Player2(String name, String weapon, int health, boolean armor) {     // variable imported from player 1
        super(name, weapon, health);
        this.health = health;
        this.armor = armor;

    }

    @Override
    public void damageByGun1() {    // overriding method for hit by Gun1
        if (armor){     // armor is on
            this.health = health-20;
            if (this.health <=0) this.health =0;
            System.out.println("Armor is on. Hit by Gun-1. Health is reduced by 20."+ " New health "+ this.health);
        }
        if (!armor){        // armor is off
            this.health = health-30;
            if (this.health <=0) this.health = 0;
            System.out.println("Armor is not on . Hit by Gun-1. Health is reduced by 30. "+ " New Health "+ this.health);
        }
        if (this.health ==0){
            System.out.println(getName()+ " is Dead!");
        }
    }

    @Override
    public void damagedByGun2() {
        if (armor){     // armor is on
            this.health = health-40;
            if (this.health <=0) this.health = 0;
            System.out.println("Armor is on. Hit by Gun-2. Health is reduced by 40."+ " New health "+ this.health);
        }
        if(!armor){     // armor is off
            this.health = health-50;
            if (this.health <=0) this.health = 0;
            System.out.println("Armor is not on. Hit by Gun-2. Health is reduced by 50."+" New health "+ this.health);
        }
        if (this.health==0){
            System.out.println(getName()+" is Dead! ");
        }
    }

    @Override               // heal() method override from player 1
    public void heal() {
       if (this.health <=0) System.out.println(getName()+" is Dead. Heal will not work! ");
       else {
           this.health=100;
           System.out.println("Health is "+ this.health);
       }
    }
}
