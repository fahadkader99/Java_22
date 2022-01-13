package small_Projects.oop_Projects.oopIsFun1.encapsulation;

// Encapsulation is all about Data security and hiding the data.

    // Private -> only give access to the same class, not outside the class not even in the package.
    // Protected -> Only child will have access of Parent's Protected method. Even though the children is in another package, don't matter. As long as it is a children from the same class Parent.
    //                > so Protected Parent is public for its children.

public class EncapsulationIntro {
    public static void main(String[] args) {
        EncapsulationIntro a = new EncapsulationIntro();
        a.doWork();
        Laptop l1 = new Laptop();

        l1.setPrice(20);
        System.out.println(l1.getPrice());


    }

    private void doWork(){
        System.out.println("Working Publicly");
    }
}

class Laptop{

    int ram;
    private int price;

   public void setPrice(int price){
       boolean isAdmin = true;
       if (!isAdmin){
           System.out.println("Can't set the price");
       }else {
           this.price = price;
       }

   }

    public int getPrice() {
        return price;
    }
}
