package small_Projects.oop_Projects.oopIsFun2.encapsule;

public class Encapsulation {

    public static void main(String[] args) {


        Laptop l1 = new Laptop();
        l1.setPrice(2000);
        l1.getPrice();





    }

}


 class Encapsulation1{

    private void setName(String name){
        System.out.println("Protected name: "+ name);
    }

    public void getName(){
        setName("Kader");
    }
}

class ABC extends Encapsulation1{

    private void doWork(){
        System.out.println("Working");
    }

    public void getDoWork(){
        doWork();
    }
}

class Laptop{
    int ram;
    private int price;

    public void setPrice(int price){
        // is the user Admin?
        boolean isAdmin = false;
        if (!isAdmin){
            System.out.println("You can't set the price");
        }else {
            this.price = price;
        }
    }
    public void getPrice(){
        System.out.println("Price: "+ price);
    }
}
