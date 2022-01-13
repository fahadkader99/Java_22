package practice_session.oop.abstraction;

public abstract class Vehicle {

    private String name;

    public Vehicle(String name){
        this.name = name;
    }

    public void drive(){
        System.out.println("Vehicle "+ this.name+ " is on the move. ");
    }

    public abstract void playMusic();   // abstract method ( subclass has to complete them)

    public String getName(){    // Non-abstract method
        System.out.println("the name of the car "+this.name);
        return this.name;
    }
}

class Toyota extends Vehicle{
    public Toyota(String name){
        super(name);
    }
    @Override
    public void playMusic(){
        System.out.println("Playing the music for Toyota ");
    }
}

class Honda extends Vehicle{
    public Honda(String name){
        super(name);
    }
    @Override
    public void playMusic(){
        System.out.println("Play music for Honda");
    }
}
