package random;

import java.util.HashSet;
import java.util.Set;

public class DoWithSet {
    public static void main(String[] args) {

        Set<Integer> a = new HashSet<>();

        Set<String> name = new HashSet<>(Set.of("Fahad", "Urmy", "Jahan","Onu","Ayesha"));
        Set<String> name1 = new HashSet<>(Set.of("Fahad", "Urmy", "Jahan","Onu","Ayesha"));

        se1(a, name, name1);

    }
    static void se1(Set<Integer> a, Set<String> name, Set<String> name1){

        Set<Integer> b = new HashSet<>();


        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        System.out.println(a);

        a.addAll(Set.of(10,20,30,80));
        System.out.println(a);

        for (Integer x : a){
            System.out.print(x+" ");
        }

        System.out.println(a.isEmpty());
        System.out.println(a.equals(b));
        System.out.println(a.contains(10));

        //a.removeAll(a);
        System.out.println(a);
        a.retainAll(a);
        System.out.println(a);
        System.out.println("\n String: ");
        boolean issame = name.equals(name1);

        System.out.println(issame);

        name.add("A");
        System.out.println(name);

        for (String x : name1){
            System.out.print(x+" ");
        }

        boolean isRetained = name.retainAll(name1);
        System.out.println("After retain : "+ isRetained);

        System.out.println("\n|");
        Set<String> str = new HashSet<>(Set.of("Ashikul","Kader","Fahad"));

        str.add("1");
        str.add("2");
        str.add("3");
        System.out.println(str);

        boolean is1 = str.contains("1");
        boolean is3 = str.contains("3");
        System.out.println("is 1 there "+ is1);
        System.out.println("is 3 there "+ is3);

        boolean isAll = name1.containsAll(name);
        System.out.println("Is name contains name1 "+ isAll);

        System.out.println(a);

        a.addAll(Set.of(10,20,50,60,70,80,90));
        System.out.println(a);



    }
}
