package small_Projects.oop_Projects.oopIsFun1;


class Developer extends Person{

    public Developer(String name, int age){
        super(name, age);    // super is used import parent class object
    }

}




class Automation extends Developer{

    public Automation(String name, int age){
        super(name,age);
    }
    void walk(){    // this is Run Time polyMorphism
        System.out.println("QA Engineer "+ name+" is walking");
    }
}















