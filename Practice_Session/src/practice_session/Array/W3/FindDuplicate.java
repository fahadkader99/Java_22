package practice_session.Array.W3;

public class FindDuplicate {
    //Write a Java program to find the duplicate values of an array of integer values
    public static void main(String[] args) {

        int[] a ={1,2,3,4,5,6,7,8,9,0,2,3,4};

        int duplicate = 0;

        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                if ((a[i] == a[j]) && (i !=j)){
                    System.out.println("Duplicate element: "+ a[j]);
                }

            }
        }


    }
}
