package jan_23;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListToLinkedList {
    // convert an arrayList to Linked List & vice versa
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<Integer>();

        for (int i = 0; i<5; i++){
            arrayList.add(i);
        }
        System.out.println(arrayList);

        // Convert to LinkedList

        LinkedList<Integer > linkedList = new LinkedList<>(arrayList);
        System.out.println("\nLinked List: " + linkedList);

        // Now convert back to array list

        List<Integer> arrayList2 = new ArrayList<>(linkedList);
        System.out.println("\nArray List: " + linkedList);

    }
}
