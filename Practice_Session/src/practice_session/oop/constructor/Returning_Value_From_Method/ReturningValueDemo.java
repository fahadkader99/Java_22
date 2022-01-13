package practice_session.oop.constructor.Returning_Value_From_Method;

public class ReturningValueDemo {

    int value;

//    ReturningValueDemo(int v){        // we don't need to use constructor because we are taking input from user and using scanner class.
//        value = v;                        // so default constructor will be used by java when i will create an object
//    }

    int square(int value){
        return value*value;
    }
}
