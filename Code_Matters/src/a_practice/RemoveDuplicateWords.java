package a_practice;

import java.util.*;

public class RemoveDuplicateWords {
    // remove duplicate words from a sentence

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Line with duplicate word");
        String line = sc.nextLine().trim();
        sc.close();

        String[] arr = line.split("\\s+");
        Set<String > set = new LinkedHashSet<>();

        for (int i=0; i< arr.length; i++){
            set.add(arr[i]);
        }
        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }


    }
}
