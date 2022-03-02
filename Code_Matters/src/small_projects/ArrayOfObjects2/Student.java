package small_projects.ArrayOfObjects2;

import small_projects.ArrayOfObjects.Subject;

import java.util.Arrays;

public class Student {
    private int rollNum;
    private String name;
    private String department;
    private String subjects;
    private int m1,m2,m3;

    public Student(int rollNum, String name, String department){
        this.rollNum = rollNum;
        this.name = name;
        this.department = department;
    }

//    public String [] setSubjects(String subjects){
//        String [] sub = new String[subjects.length()];
//        return sub;
//    }
    public int getRollNum(){
        return this.rollNum;
    }
    public String getName(){
        return this.name;
    }
    public String getDepartment(){
        return this.department;
    }
    public int total(){
        return m1+m2+m3;
    }
    public float average(){
        return (float) total()/3;
    }
//    public String getSubjects(){
//        return Arrays.toString(setSubjects(subjects));
//    }

    public String toString(){
        return "\nRoll: "+ rollNum+"\nName: "+name+"\nDept: "+department;
    }

}

class Test{
    public static void main(String[] args) {
        Student[] s = new Student[2];
        s[0] = new Student(10, "Ash","Math");
        s[1] = new Student(20,"Kaker","English");



        for (Student st : s){
            System.out.println(st);
        }



    }
}
