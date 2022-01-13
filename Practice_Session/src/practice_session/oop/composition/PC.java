package practice_session.oop.composition;
//https://www.youtube.com/watch?v=HrhbGaNggrw&list=PLH4J8-mrXarEW2LuvRX_rOrVFnWdZA8NB&index=6
/*
Composition: when one class contains another class information. Exam pc has motherboard, Monitor, Keyboard
 */
public class PC{

    private Case theCase;
    private Monitor theMonitor;
    private MotherBoard theMotherBoard;

    public PC(Case theCase, Monitor theMonitor, MotherBoard theMotherBoard){
        this.theCase = theCase;
        this.theMonitor = theMonitor;
        this.theMotherBoard = theMotherBoard;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getTheMonitor() {
        return theMonitor;
    }

    public MotherBoard getTheMotherBoard() {
        return theMotherBoard;
    }
}
