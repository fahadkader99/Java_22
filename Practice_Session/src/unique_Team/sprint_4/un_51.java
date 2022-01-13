package unique_Team.Sprint_4;

import java.util.*;

public class un_51 {
    /**
     * Write a method contains 3 that accepts a List of strings as a parameter and returns true if any single
     * string occurs at least 3 times in the list, and  false otherwise. Use a map as auxiliary storage.
     *
     * Example:
     *
     * Input:       [“a”, “a”, “b”, “a”, “c”]
     *
     * Output:      true
     */
    public static void main(String[] args) {

//       Scanner input = new Scanner(System.in);
//       System.out.println("How many string would you like to input: ");
//       int length = input.nextInt();
//       Map<Integer, String > map = new HashMap<>();
//       input.nextLine();
//
//       for (int i = 0; i <length;i++){
//           map.put(i, input.nextLine());
//       }
//
//       List<String> list = new ArrayList<>(map.values());
//       Collections.sort(list);
//       boolean result = false;
//
//       for (int i = 0; i< list.size()-2; i++){
//           if (list.get(i).equals(list.get(i+1)) && list.get(i).equals(list.get(i+2))){
//               result = true;
//               break;
//           }else {
//               result = false;
//           }
//       }
//        System.out.println(result);


        Scanner input = new Scanner(System.in);
        int length;
        System.out.println("How many Strings would you like to input?");
        try {
            length = input.nextInt();
            Map<Integer, String> map = new HashMap<>();
            input.nextLine();
            for (int i = 0; i < length; i++) {
                map.put(i, input.nextLine());
            }
            List<String> list = new ArrayList<>(map.values());
            Collections.sort(list);
            boolean result = false;
            for (int i = 0; i < list.size()-2; i++) {
                if (list.get(i).equals(list.get(i + 1)) && list.get(i + 1).equals(list.get(i + 2))) {
                    result = true;
                    break;
                } else {
                    result = false;
                }
            }
            System.out.println(result);
        }
        catch (InputMismatchException e){
            System.out.println("Please enter valid number.");
        }


    }
}
