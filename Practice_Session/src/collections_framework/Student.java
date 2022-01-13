package collections_framework;

public class Student {

    String name;
    int rollNo;

    public Student(String name, int tollNo){
        this.name = name;
        this.rollNo = tollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
}
