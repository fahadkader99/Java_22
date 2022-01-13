package practice_session.Generics;

public class MyClass<T, O>{

    T obj;
    O my;

    MyClass(T obj, O my){
        this.obj = obj;
        this.my = my;
    }

    public void showType(){
        //System.out.println(obj.getClass().getName());       // shows you the class and package
        System.out.println(obj);
        System.out.println(my);
    }
}


class Main{
    public static void main(String[] args) {
        MyClass<Integer, String> obj1 = new MyClass<>(10, "Fahad");
        MyClass<Double, Character> obj2 = new MyClass<>(10.11, 'A');
        MyClass<String, String> obj3 = new MyClass<>("Fahad", "Jahan");


        obj1.showType();
        obj2.showType();
        obj3.showType();



    }
}