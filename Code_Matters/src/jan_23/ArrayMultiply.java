package jan_23;

public class ArrayMultiply {
    // multiply 2 array contents

    public static void main(String[] args) {
        int[] a = new int[] {1,2,3};
        int [] b = new int[] {4,5,6};

        int total = 1;
        for (int i = 1; i<a.length; i++){
            total+= a[i] * b[i];
        }
        System.out.println(total);
    }
}
