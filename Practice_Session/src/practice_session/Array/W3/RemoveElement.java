package practice_session.Array.W3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RemoveElement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [] a = {1,2,3,4,5,6,7,8,9,0};

        List<Integer> arr = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,0));

        System.out.println("THe elements are: "+ arr);
        System.out.println("Enter the index no to remove: ");
        int key = input.nextInt();


        System.out.println("Remove Index= "+ arr.remove(key));
        System.out.println("after removing: "+ arr);





    }

}
