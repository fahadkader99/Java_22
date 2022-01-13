package practice_session.Generics;

public class GenericDemo<T> {

    T data[] = (T[]) new Object[3];

    public static void main(String[] args) {

        GenericDemo<String> gd = new GenericDemo<>();
        gd.data[0] = "hi";
        gd.data[1] = "bye";
        gd.data[2] = "hello";

//        String str = gd.data[0];
//        System.out.println(str);

        System.out.println(gd);


    }
}
