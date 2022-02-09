package lambda;

public class Greeter {

    public void greet(Greeting greeting){

        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        greeter.greet(helloWorldGreeting);

       MyLambda myLambdaFunction = ()-> System.out.print("Hello KAder");

       MyAdd addFunction = (int a, int b)-> a+b;

       MyDivide divideFunction = (double a, double b)-> a/b;

       MySub subFunction = (int a, int b) -> a-b;


    }
}

interface MyLambda{
    void print();

}

interface MyAdd{
    int add(int a, int b);
}

interface MyDivide{
    double divide(double a, double b);
}

interface MySub{
    int sub(int a, int b);
}