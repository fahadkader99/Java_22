package practice2022.january.jan1;

import java.util.Scanner;

public class TaxCalculation {
    /*
    if salary < 10,000 no tax
    salary > 10,000  & less than <= 100,000 --- 10% tax
    salary >100,000 & less than <= 10,00,000 ----- 20% tax
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name =input.nextLine();
        System.out.println("Enter Salary: ");
        int salary = input.nextInt();



        Person p1 = new Person(name,salary);
        p1.printInfo();

    }

}

class Person{

    private String name;
    private int salary;
    private int tax;

    public Person(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public void printInfo(){
        System.out.println("Name: "+ name);
        System.out.println("Salary: "+ salary);
        findTax();
    }

    public int findTax(){
        if (salary > 0 && salary <10000){
            System.out.println("No Tax needed..!");
        }else if (salary >10000 & salary <=100000){
            tax = (salary / 100) * 10;
            salary = (salary-tax);
            System.out.println("Tax applied 10% : "+ tax);
            System.out.println("After Tax: "+ salary);
        }else {
           tax = (salary / 100)*20;
            System.out.println("Tax applied 20 % : "+ tax);
            salary = (salary-tax);
            System.out.println("After Tax: "+ salary);
        }
        return tax;

    }

}
