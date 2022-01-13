package small_Projects.oop_Projects.Game1;

public class Player1 {          // properties of player 1
    private String name;
    private  String weapon;
    private int health;

    public Player1(String name, String weapon, int health) {    // constructor of Player 1
        this.name = name;       // this keyword refers to the current object in a method / constructor.
        this.weapon = weapon;
        //this.health = health;  > we need to limit the health so using if on the next line

        if (health < 0 || health >100){     // this is encapsulation where it is limiting the user to stay with in the given limit
            this.health = 100;
        }else {
            this.health = health;
        }

    }

     public void damageByGun1(){        // method for Hit by Gun 1
        this.health = health-30;
        if (this.health <=0){
            this.health = 0;
        }
         System.out.println("Hit by Gun-1. Health is reduced by 30 "+
                 ". New health is "+ this.health);

        if (this.health ==0){
            System.out.println(getName()+" is Dead! ");
        }

     }
     public void damagedByGun2(){
        this.health = health-50;
        if (this.health <=0){
            this.health = 0;
        }
         System.out.println("Hit by Gun-2. Health is reduced by 50 "+ ". New health is "+ this.health);

        if (this.health==0){
            System.out.println( getName()+" is Dead! ");
        }
     }

     public void heal(){
        if (this.health <= 0) System.out.println(getName()+" is Dead. Heal not possible");
        else {
            this.health =100;
            System.out.println("Health is "+this.health);
        }
     }

     // Getter and Setter: they are used to protect your data.
    // A setter update the value of a variable while Getter read the value of a variable.


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
