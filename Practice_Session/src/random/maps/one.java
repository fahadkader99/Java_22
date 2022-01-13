package random.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class one {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter the key you are looking for: ");
        int key = input.nextInt();



        map1(key);

    }
    public static Map<Integer, String >  map1(int key){

        Map<Integer, String > map = new HashMap<>();
        map.put(1, "Fahad");
        map.put(2,"Aysha");
        System.out.println(map.containsKey(key));
        return map;

    }



}
