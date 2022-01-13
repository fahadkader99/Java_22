package unique_Team.Sprint_3;

import java.util.*;


public class RemoveEvenLength {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("\nNumber of strings you want to input: ");

        String[] s = new String[input.nextInt()];
        input.nextLine();

        for (int i = 0; i < s.length;i++){
            System.out.println("Enter string # "+ (i+1));
            s[i] = input.nextLine();
        }


        Set<String> set = new HashSet<>(Arrays.asList(s));
        Iterator<String> i = set.iterator();
        while (i.hasNext()){
            final String word = i.next();
            if (word.length()%2==0){
                i.remove();
            }
        }
        System.out.println("After removing even string: "+set);
    }

}
