package march_april_23;

public class Variables {

    public String name;                     // Instance variable (outside of method but inside of class)
    public int ID;
    public double height;

    public void setDetails(String name, int ID, double height){              //
        this.name = name;
        this.ID = ID;
        this.height = height;
    }

    public void printDetails(){
        name = "Fahad";                             // Local variable - belongs || inside the method & other method don't have access of it
        ID = 100;
        height = 5.6;

        System.out.println(name +" "+ ID +" "+ height);

    }

    // creating object of the class to access those Methods
    public static void main(String[] args) {
        Variables ver = new Variables();
        ver.printDetails();
    }
}
