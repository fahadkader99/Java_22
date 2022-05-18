package april_Fool;

public class CheckEqualArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int [] b = {1,2,3,4,5};

//        boolean even = a.equals(b);
//        System.out.println(even);

        boolean same = false;               // both way works!

        if (a.length == b.length){

            for (int i = 0; i<a.length; i++){
                if (a[i]==b[i]){
                    same = true;
                }
            }
        }else {
            same = false;
        }
        System.out.println(same);
    }
}

