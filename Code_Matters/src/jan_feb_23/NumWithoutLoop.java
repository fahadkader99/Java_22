package jan_feb_23;

public class NumWithoutLoop {
    // print 1-100 without using loop - mean I have to use recursion 20
    public static void main(String[] args) {

       one(1);
    }

    static void one(int count ){


        if (count <=100){
            System.out.println(count);
            count++;

            one(count);
        }

    }
}
