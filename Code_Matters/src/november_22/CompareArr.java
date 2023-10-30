package november_22;

public class CompareArr {
    // compare 2 array
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,6};
        int[] b = new int[]{1,2,3,4,5};

        boolean flag = false;

        if (a.length==b.length){

            for (int i = 0; i<a.length; i++){
                if (a[i]==b[i]){
                    flag = true;
                }else {
                    flag = false;
                }
            }

        }else {
            flag = false;
        }

        if (flag){
            System.out.println("Same Array");
        }else {
            System.out.println("Not same Array");
        }

    }
}
