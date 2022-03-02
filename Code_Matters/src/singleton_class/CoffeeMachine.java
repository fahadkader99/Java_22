package singleton_class;

public class CoffeeMachine {
    private float coffeeQty;
    private float milkQty;
    private float waterQty;
    private float sugarQty;

    static private CoffeeMachine my = null;

    private CoffeeMachine(){
        coffeeQty = 1;
        milkQty = 1;
        waterQty = 1;
        sugarQty = 1;
    }

    public void fillWater(float qty){
        waterQty = qty;
    }
    public void fillSugar(float qty){
        sugarQty = qty;
    }
    public float getCoffee(){
        return 0.23f;                            // just returning value instead of glass of coffee, just for test
    }

    static CoffeeMachine getInstance(){
        if (my == null){
            my = new CoffeeMachine();
        }
        return my;
    }



/*	Ø Singleton is the class where it is allowed to create only single object. More then one object of that class is not allowed

	- One single object of the class will be used all over the project || framework
	- In singleton class we need to restrict the Parameterised construct Privet, so that object can't be created of the class
		○ So if constructor is privet, how can we create 1st object / instance without leaving the chance to create multiple object? ----> Using Static method
	- Static public method will be used to return the instance of the class by calling the privet constructor
*/

}

class Singleton{
    public static void main(String[] args) {
        CoffeeMachine m1 = CoffeeMachine.getInstance();
        CoffeeMachine m2 = CoffeeMachine.getInstance();
        CoffeeMachine m3 = CoffeeMachine.getInstance();

        //CoffeeMachine coffeeMachine = new CoffeeMachine(); ------> Can't even create object like this...!

        System.out.println(m1+" "+m2+" "+m3);
        if (m1 == m2 && m1 == m3){                              // if different objects are created objects is not going to be equal
            System.out.println("All same object...!");
        }
    }
}
