package practice_session.Array.Single_Dimension;

public class ArrayTest {
    public static void main(String[] args) {

        int a[] = {1,2,3,4,5};
        int b[] = new int[10];

        for (int i = 0; i < a.length; i++){
            b[i] = a[i];
        }
        a =b;               // copying data and calleing the new array A, so this is how we can increase the size of A array
        b = null;

        for (int i = 0; i < a.length; i++){
            System.out.print(a[i]+ " ");
        }

        // System.out.println(b.length);
    }
}
