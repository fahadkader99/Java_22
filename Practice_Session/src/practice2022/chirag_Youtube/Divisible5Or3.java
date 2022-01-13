package practice2022.chirag_Youtube;

import java.util.Scanner;

public class Divisible5Or3 {
    // print num 1-n which are divisible by 5 / 3

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("ENter a No. ");
        int n = s.nextInt();
        s.close();

        for (int i =0; i<=n; i++){
            if(i % 5==0 || i % 3==0 ){
                System.out.println(i+" ");
            }
//            if (i % 3==0){
//                System.out.println(i+" ");
//            }
        }



    }
}
