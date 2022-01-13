package practice_session.iterator_Demo;

import java.util.Iterator;
import java.util.LinkedList;

public class Iterator_Demo {

    public static void main(String[] args) {
        LinkedList<String> name = new LinkedList<String>();
        name.add("Ashikul");
        name.add("Kader");
        name.add("Fahad");
        name.add("10");
        name.add("10");
        name.add("10");

// iterating using for each and Iterator method, both gives us the same result but sometime for each loop is not accepted in set!

        Iterator<String> it = name.iterator();  // using iterator
        while (it.hasNext()){
            System.out.println(it.next());
        }
        for (String x: name){       // using for each loop
            System.out.println(x);
        }

    }
}
