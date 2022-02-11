package qA_Fox;

public class OddEvenArray {
    // separately print the odd and even in the array

    public static void main(String[] args) {
        int []num = {1,2,3,4,5,6,7,8,9,0};

        System.out.println("Even");
        for (int i = 0; i<num.length;i++){
            if (num[i]%2==0){
                System.out.println(num[i]);
            }
        }

        System.out.println("Odd");
        for (int i = 0; i< num.length;i++){
            if(num[i]%2!=0){
                System.out.println(num[i]);
            }
        }
    }

}
