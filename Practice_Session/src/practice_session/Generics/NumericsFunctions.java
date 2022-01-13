package practice_session.Generics;
//https://www.youtube.com/watch?v=h7piyWnQbZA

public class NumericsFunctions<T extends Number> {      // all the numeric value are child of Number class.

    T ob;
    NumericsFunctions(T ob){
        this.ob = ob;

    }
    double square(){
        return ob.intValue() * ob.byteValue();
    }

}

class Main1{
    public static void main(String[] args) {

        NumericsFunctions<Integer> iob = new NumericsFunctions<>(4);
        System.out.println(iob.square());


    }
}