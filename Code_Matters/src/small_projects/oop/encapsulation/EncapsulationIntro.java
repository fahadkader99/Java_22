package small_projects.oop.encapsulation;

public class EncapsulationIntro {

    public static void main(String[] args) {

        Laptop l1 = new Laptop();
        l1.setPrice(31);


    }
     void do_work(){
        System.out.println("Working from other class.");
    }

}

class Laptop{

    private int ram;
    int price;


    public void setPrice(int price){        // we can also do validation here.!
        this.price = price;
        boolean isAdmin = true;

        if(!isAdmin){
            System.out.println("Price is fixed");
        }else {
            this.price = price;
            System.out.println("Price is "+ price);
        }
    }


    public void setRam(int ram){
        this.ram = ram;
    }

    public int getRam() {
        return ram;
    }

    public int getPrice() {
        return price;
    }
}