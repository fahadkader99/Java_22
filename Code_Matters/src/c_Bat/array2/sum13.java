package c_Bat.array2;

import java.util.*;

public class sum13 {
    /*
    Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky,
    so it does not count and numbers that come immediately after a 13 also do not count.


sum13([1, 2, 2, 1]) → 6
sum13([1, 1]) → 2
sum13([1, 2, 2, 1, 13]) → 6
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();

        Integer[] num = new Integer[size];

        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter element: " + (i + 1));
            num[i] = sc.nextInt();
        }

//        List<Integer> list = new ArrayList<>(Arrays.asList(num));
        //Collections.addAll(list,num);
//
//        for (int i = 0; i<list.size();i++){
//            sum= sum+ list.get(i);
//            if (list.get(i).equals(13)){
//                list.remove(i);
//                list.remove(i+1);
//
//            }
//        }
//
//        System.out.println(sum);
        int sum = 0;
        int i = 0;
        while (i<num.length){
            if (num[i]==13){
                i = i+2;
            }else {
                sum = sum+num[i];
                i++;
            }
        }
        System.out.println(sum);

    }
}
