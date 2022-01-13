package lets_Catch_Up;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {


        int[] num = new int[3];
        num[0] = 2;
        num[1] = 3;
        num[2] = 4;
        System.out.println(Arrays.toString(num));

        forLoop();

    }
    static int[] sortNum(int[] num){

        if (num[0] > num[1] && num[0] > num[2]){
            if (num[1] > num[2]){
                return new int[] {num[2], num[1], num[0]};
            }
            else return new int[]{num[1], num[2],num[0]};
        }

        if (num[1] > num[0] && num[1] > num[0]){
            if (num[0] > num[2]){
                return new int[] {num[2], num[0], num[1]};
            }
            else return new int[]{num[0], num[2], num[1]};
        }

        else {
            if (num[0] > num[1]){
                return new int[]{num[1], num[0], num[2]};
            }
            else return new int[]{num[0], num[2], num[1] };
        }
    }

    static void forLoop(){
        int[] num = new int[3];
        num[0] = 2;
        num[1] = 3;
        num[2] = 4;
        System.out.println(Arrays.toString(num));

        int lengthOfNum = num.length;
        int[] reversedArray = new int[lengthOfNum];
        int nameCount = 0;

        System.out.println("-----------------------------");
        for (int i=0; i < num.length; i ++){
            System.out.print(nameCount++ +" ");
        }

        System.out.println("\nArray is reversed in Descending order: ");
        for (int i = 0; i < num.length; i++){
            reversedArray[i] = num[lengthOfNum-(i+1)];
        }
        System.out.println(Arrays.toString(reversedArray));

    }

}
