package practice_session.Generics;


class Data<T>{
    private T obj;

    public void setData(T value){
        obj = value;
    }

    public T getData(){
        return obj;
    }
}




public class GenericDemo2  {
    public static void main(String[] args) {

        Data<Integer> d = new Data<>();
        d.setData(10);

        System.out.println(d.getData());



    }
}
