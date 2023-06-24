package march_april_23;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveElementList {
    // remove an element from a list by element
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the list: ");
        int size = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++){
            System.out.println("Enter element: " + (i+1));
            list.add(sc.nextInt());
        }
        System.out.println(list);
        System.out.println("Element to Remove: ");
        int remove = sc.nextInt();
        sc.close();
        boolean flag = false;

        for (int i = 0; i<list.size(); i++){
            if (list.get(i).equals(remove)){
                list.remove(list.get(i));
                flag = true;
            }
        }

        if (flag){
            System.out.println("After removed: " + list);
        }else {
            System.out.println("Element not found in the List. . . ");
        }












    }
}
