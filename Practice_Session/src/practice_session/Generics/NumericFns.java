package practice_session.Generics;

public class NumericFns<T extends Number> {

    T num;
    NumericFns(T ob){
        this.num = ob;
    }

    boolean asEqual(NumericFns<?> ob){      // putting ? means we do not know the data type we are going to pass.
       if (Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue())){
           return true;
       }
       return false;
    }

}

class Main2{
    public static void main(String[] args) {

        NumericFns<Integer> iob = new NumericFns<>(6);
        NumericFns<Double> dob = new NumericFns<>(-6.0);

        System.out.println(iob.asEqual(dob));
    }
}