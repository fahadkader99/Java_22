package qA_Fox;

import java.util.Arrays;

public class CompareArrays {
    // compare two arrays
    public static void main(String[] args) {
        easyWay();
        hardWay();
        otherWay();

    }
    public static void easyWay(){
        int [] num = {1,2,3,4,5,6,7,8,9,0};
        int [] num2 = {1,2,3,4,5,6,7,8,9,0};

        boolean isEqual = Arrays.equals(num,num2);

        if (isEqual ==true){
            System.out.println("Arrays are equal");
        }else System.out.println("Not equal");
    }
    public static void hardWay(){
        int [] num = {1,2,3,4,5,6,7,8,9,0};
        int [] num2 = {1,2,3,4,5,6,7,8,9,0};
        boolean flag = false;

        for (int i = 0; i< num.length;i++){
            for (int j = 0; j< num2.length;j++){
                if (num[i]==num2[j]){
                    flag = true;
                }
            }
        }
        if (flag==true){
            System.out.println("Arrays are equal");
        }else System.out.println("Not equal");

    }
    public static void otherWay(){
        int [] num = {1,2,3,4,5,6,7,8,9,0};
        int [] num2 = {1,2,3,4,5,6,7,8,9,0};

        boolean flag = true;

        if (num.length == num2.length){
            for (int i = 0; i<num.length;i++){
                if (num[i]!=num2[i]){
                    flag = false;
                    break;
                }
            }
        }else {
            flag = false;
        }
        if (flag==true){
            System.out.println("Arrays are equal");
        }else System.out.println("Not equal");

    }
}
