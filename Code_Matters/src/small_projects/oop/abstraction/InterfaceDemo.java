package small_projects.oop.abstraction;

public class InterfaceDemo implements Car1, Person, Fahad{

    public static void main(String[] args) {

    }
    @Override
    public void start1(){

    }

    @Override
    public void breaks(){

    }
}


interface Car1{

    void start1();
    void breaks();
}

interface Person extends Car1{

}

interface Fahad extends Car1{

}