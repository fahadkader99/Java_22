package practice_session.oop.abstraction;

public abstract class Shape{

    double dim1, dim2;

    Shape(double dim1, double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public abstract void size();

    public abstract void length();

    public void Hi(){
        System.out.println("Shut Up");
    }


}



class Rectangle extends Shape{

    Rectangle(double dim1, double dim2){
        super(dim1, dim2);
    }

    @Override
    public void size(){
        double size = dim1+dim2;
        System.out.println("Size: "+size);
    }
    @Override
    public void length(){
        double length = dim1*dim2;
        System.out.println("length: "+length);
    }
}


class Circle extends Shape{

    Circle(double dim1, double dim2){
        super(dim1, dim2);
    }

    @Override
    public void size() {
        double size = dim1+dim2;
        System.out.println("Size: "+size);
    }

    @Override
    public void length() {
        double length = dim1*dim2;
        System.out.println("length: "+length);
    }
}


class Triangle extends Shape{

    Triangle(double dim1, double dim2){
        super(dim1, dim2);
    }
    @Override
    public void size() {
        double size = dim1+dim2;
        System.out.println("Size: "+size);
    }

    @Override
    public void length() {
        double length = dim1*dim2;
        System.out.println("length: "+length);
    }
}





