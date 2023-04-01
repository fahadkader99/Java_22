package march_april_23;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateArrayList {
    // remove duplicate elements from array List - dynamically
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Num of elements to add: ");
        int num = sc.nextInt();

        ArrayList<String > list = new ArrayList<>(num);
        for (int i = 0; i< num; i++){
            System.out.println("Element - " +(i+1));
            list.add(scanner.nextLine());
        }
        sc.close();
        System.out.println("Inputted List - "+list);

        // remove the duplicate & return the list
        ArrayList<String> duplicate = new ArrayList<>();
        Set<String > set = new LinkedHashSet<>();
        boolean flag = true;

        for (int i = 0; i<list.size(); i++){
            if (set.add(list.get(i))==false){
                duplicate.add(list.get(i));
                flag = false;
            }
        }

        if (flag){
            System.out.println("\nNo Duplicate element found. ");
            System.out.println(list);
        }else {
            System.out.println("\nDuplicate found - " + duplicate);
            System.out.println("\nRefined List - " + set);
        }




    }
}
