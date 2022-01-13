package practice_session.Generics;

class MyArray<T>{

    T A[] = (T[]) new Object[10];   // have to cast to create object of Generic

    int length = 0;

    public void append(T value){
        A[length++] = value;    // store the value index 0 initially and then increment

    }
    public void display(){
        for (int i = 0; i < length; i++){              // print objects using for loop
            System.out.println(A[i]);
        }
    }

}


public class GenericWithArray  {
    public static void main(String[] args) {

//        MyArray<Integer> ma = new MyArray<>();
//        ma.append(10);
//        ma.append(20);
//        ma.append(30);
//        ma.append(40);
//        ma.append(50);
//
//        ma.display();

        MyArray<String> ma = new MyArray<>();   // so just by declaring the data type we can change everything in Generics
        ma.append("Ash");
        ma.append("Kader");
        ma.append("Fahad");
        ma.display();



    }
}
