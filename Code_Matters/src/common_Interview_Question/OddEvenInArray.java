package common_Interview_Question;

public class OddEvenInArray {
    public static void main(String[] args) {

        int []num = {1,2,3,4,5,6,7,8,9};

        for(int i = 0; i <num.length;i++){
            if (num[i]%2==0){
                System.out.println("Even "+ num[i]);
            }
        }
        System.out.println("======================");
        for (int i = 0; i <num.length;i++){
            if (num[i]%2 !=0){
                System.out.println("Odd "+ num[i]);
            }
        }
    }
}
