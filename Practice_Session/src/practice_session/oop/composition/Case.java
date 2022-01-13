package practice_session.oop.composition;

public class Case {

    private String ModelName;
    private String Manufacture;
    private Dimension theDimension;

    public Case(String modelName, String manufacture, Dimension theDimension) {
        ModelName = modelName;
        Manufacture = manufacture;
        this.theDimension = theDimension;
    }

    public void pressPowerButton(){
        System.out.println("Power Button is Pressed ! ");
    }


    public String getModelName() {
        return ModelName;
    }

    public String getManufacture() {
        return Manufacture;
    }

    public Dimension getTheDimension() {
        return theDimension;
    }
}
