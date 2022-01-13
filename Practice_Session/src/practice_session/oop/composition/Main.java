package practice_session.oop.composition;

public class Main {
    public static void main(String[] args) {
        Case thCase= new Case("A123","Asus", new Dimension(20,24,10));
        Monitor theMonitor = new Monitor("S32", "Dell", 32, new Resolution(2400, 1440));
        MotherBoard theMotherBoard = new MotherBoard("M1", "Apple", 2, 1);

        // we have created objects for our class parameter

        // Now creating our main PC

        System.out.println("\n");
        PC myPc = new PC(thCase,theMonitor,theMotherBoard);// this is composition, where one obj hold other objects in it.
        myPc.getTheCase().pressPowerButton();
        myPc.getTheMonitor().drawPixelAt(2048, 1080, "RGB");
        myPc.getTheMotherBoard().loadProgram("Adobe LightRoom");


    }
}
