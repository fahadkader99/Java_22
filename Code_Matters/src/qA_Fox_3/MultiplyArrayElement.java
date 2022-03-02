package qA_Fox_3;

public class MultiplyArrayElement {
    // multiply the 2 array elements
    public static void main(String[] args) {
        int []a = {1,2,3,4,5};      // two multiply two array both of them have to be on the same length
        int [] b = {5,4,3,2,1};

        for (int i = 0; i<a.length;i++){
            System.out.print(a[i] * b[i]+" ");
        }
    }
}
