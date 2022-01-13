package unique_Team.Sprint_3;

import java.util.*;

public class Union_Operation_Set {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("\nNumber of integers to input for Set-1:");
        Integer[]a = new Integer[input.nextInt()];
        input.nextLine();

        for (int i = 0; i < a.length;i++){
            System.out.println("Enter integer # "+ (i+1));
            a[i]= input.nextInt();
        }

        System.out.println("\nNumber of integers to input for Set-2:");
        Integer[] b = new Integer[input.nextInt()];
        input.nextLine();
        for (int i = 0; i < b.length;i++){
            System.out.println("Enter integer # "+ (i+1));
            b[i] = input.nextInt();
        }

        // transferring the elements of Array into set.
        Set<Integer> set1 = new TreeSet<>();
        set1.addAll(Arrays.asList(a));

        Set<Integer> set2 = new TreeSet<>();
        set2.addAll(Arrays.asList(b));

        // Finding union of set1 & set2
        Set<Integer> unionData = new TreeSet<>(set2);
        unionData.addAll(set1);

        System.out.println("\nAfter adding set1 & set2: "+ unionData);


    }
}
