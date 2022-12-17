package Nov_22;

import java.util.Arrays;

public class CompareArray {
    // compare 2 array
    public static void main(String[] args) {
        int [] a = new int[]{1,2,3,4,5};
        int [] b = new int[]{1,2,3,4,0};

        CompareArray arr = new CompareArray();
        //arr.one(a, b);
        arr.two(a, b);

    }
    void one(int[] a, int[] b){
        if (a.length==b.length){
            if (Arrays.equals(a, b)){
                System.out.println("\nBoth arrays are Equal");
            }else {
                System.out.println("Not Equal");
            }
        }else {
            System.out.println("Not Equal");
        }
    }

    void two(int[] a, int[] b){
        boolean flag = true;

        if (a.length==b.length){

            for (int i=0; i<a.length; i++){
                if (a[i] != b[i]){
                    flag = false;
                    break;
                }
            }

        }else {
            flag = false;
        }

        if (flag){
            System.out.println("Equal Arrays");
        }else {
            System.out.println("Not equal Arrays");
        }

    }
}
