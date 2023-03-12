package march_23;

public class PrintNoSemiColon {
    // print HELLO WORLD without semi colon
    public static void main(String[] args) {

        one();
        two();
        three();
        four();

    }

    static void one(){
        if (System.out.printf("Hello World" + "\n") == null){            // it will print since the condition is false

        }
    }
    static void two(){
        if (System.out.append("Hello World" +"\n") == null){

        }
    }
    static void three(){
        if (System.out.append("Hello World" +"\n").equals("")){

        }
    }
    static void four(){
        for (int i = 0; i < 1; System.out.println("Hello World")){
            i++;
        }
    }

}
