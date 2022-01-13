package practice_session.Comparable_Operator;

import java.util.Set;
import java.util.TreeSet;

class Point{
    int x;
    int y;
}


public class Demo1 {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>(Set.of(10,30,50,70,40));
        set.add(25);
        set.add(99);
    }
}
