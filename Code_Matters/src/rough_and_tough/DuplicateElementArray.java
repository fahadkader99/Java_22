package rough_and_tough;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DuplicateElementArray {
    // find duplicate elements in array

    public static void main(String[] args) {

    method2();
    }
    public static void method1(){
        int [] arr = {1,2,4,5,6,4,1,2,3,5,6,7};

        List<Integer> list = new ArrayList<>();


        for (int i = 0; i<arr.length;i++){
            for (int j = i+1; j<arr.length;j++){
                if (arr[i]==arr[j]){
                    list.add(arr[j]);
                }
            }
        }
        System.out.println("Duplicate: "+ list);

    }
    public static void method2(){                   // using Hash Set

        boolean equal = false;
        String[]str = {"java", "c","c++","c","java","python"};
        HashSet<String> set = new HashSet<>();

        for (String s : str){

            if (set.add(s)==false){
                System.out.println("Duplicate> "+ s);
                equal = true;
            }
        }
        if (equal==false){
            System.out.println("No duplicate fond");
        }

    }
}
