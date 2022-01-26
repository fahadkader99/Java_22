package common_Interview_Question;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

    public static void main(String[] args) {

        int []arr = {0,1,2,3,21,20,9};
        int target = 50;

        List<Integer>list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i <arr.length-2; i++){
            for (int j = i+1; j<arr.length-1;j++){
                for (int k = j+1; k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        set.add(arr[i]);
                        set.add(arr[j]);
                        set.add(arr[k]);

                    }
                }
            }
        }
        System.out.println(set);

    }

}
