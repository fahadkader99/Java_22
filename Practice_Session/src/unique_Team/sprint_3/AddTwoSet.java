package unique_Team.Sprint_3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

public class AddTwoSet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers for Set-1:");
        Set<Integer> s1 = new HashSet<>(Set.of(input.nextInt()));
        //Integer set1 = input.nextInt();
        input.nextLine();
        System.out.println("Enter numbers for Set-2: ");
        Set<Integer> s2 = new HashSet<>(Set.of(input.nextInt()));
        //Integer set2 = input.nextInt();

        //Set<Integer> s3 = new HashSet<>();

       // s1.addAll(s2);


        Stream.of(s1,s2).forEach(s1::addAll);
        System.out.println(s1);

//        s3.addAll(s1);
//        s3.addAll(s2);
        //System.out.println(s3);

//        System.out.println("The union of Set-1 & Set-2\n" +
//                s.addAll(s2));

        // 1st 2 arraylist a , b with int
        // set 1 and set 2 of int
        // set1.adall Arrays.aslist (a)
        //set 2 . adll Arrays.aslist of (B
        // another set of union



    }
}
