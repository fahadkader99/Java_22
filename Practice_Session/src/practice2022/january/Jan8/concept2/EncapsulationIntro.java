package practice2022.january.Jan8.concept2;

public class EncapsulationIntro {
    public static void main(String[] args) {

        Laptop l1 = new Laptop();
        l1.ram = 16;
        l1.setPrice(100);
        System.out.println(l1.ram+ " "+ l1.getPrice());



    }
}

class Laptop{
    protected int ram;
    private int price;

    public void setPrice(int price){
        boolean admin = true;

        if (admin){
            this.price = price;
        }else {
            this.price = 500;
        }

    }
    public int getPrice(){
        return price;
    }

}
