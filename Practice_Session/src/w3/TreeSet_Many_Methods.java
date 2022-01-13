package w3;

import java.util.*;

public class TreeSet_Many_Methods {

    public static void main(String[] args) {

        //tree();
        //treeTough();
       //treeScan();
        //strictlyGreaterOrSmaller();
        removeElement();

    }
    static void tree(){
        TreeSet<String> color = new TreeSet<>();
        color.add("Red");
        color.add("White");
        color.add("Pink");
        System.out.println(color);

        //Write a Java program to iterate through all elements in a tree set

        for (String x : color){
            System.out.print(x+" ");
        }

        //Write a Java program to create a reverse order view of the elements contained in a given tree set

        TreeSet<Integer> num = new TreeSet<>(Set.of(1,2,3,4,5,6,7,8,9));
        System.out.println("Before reversing: "+ num);

        Iterator it = num.descendingIterator();         // <<<<< Descending Set >>>>
        System.out.println("Num is descending order:");
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }

        //Write a Java program to get the first and last elements in a tree set.

        System.out.println("\nThe 1st element in tree: "+ num.first());
        System.out.println("\nThe last element is the tree: "+ num.last() );

        //Write a Java program to clone a tree set list to another tree set

       TreeSet<Integer> num2 = (TreeSet<Integer>) num.clone(); // <<<<< clone set >>>>

        System.out.println("After cloning num to num2: "+ num2);

        // Write a Java program to get the number of elements in a tree set.
        System.out.println("The number of elements are: "+ num2.size());

        //Write a Java program to compare two tree sets
        System.out.println("IS num contain in num2: "+ num.containsAll(num2) );
        System.out.println("Is num equal to num2 "+ num.equals(num2));


    }
    static void treeTough(){

        //Write a Java program to find the numbers less than 7 in a tree set
        TreeSet<Integer> num = new TreeSet<>(Set.of(4,5,6,7,8,9,10));

      for (Integer x : num){
          if (x <=7){
              System.out.print(x+ " ");
          }
      }



    }
    static void treeScan(){
        // Write a Java program to get the element in a tree set which is greater than or equal to the given element

        Scanner scan = new Scanner(System.in);

        TreeSet<Integer> num = new TreeSet<>(Set.of(1,2,3,4,5,6,7,8,9,10,11,12));
        System.out.println("The elements are: "+ num);
        System.out.println("Enter the num you are looking for: ");
        Integer key = scan.nextInt();

        System.out.println("\nThe elements greater then or equal to given number are: ");
        for (Integer x : num){
            if (x >= key ){
                System.out.print(x+" ");
            }
        }

        // Write a Java program to get the element in a tree set which is less than or equal to the given element.
        System.out.println("\n The elements less than or equal to the given number ");

        for (Integer x :num){
            if (x <= key){
                System.out.print(x+ " ");
            }
        }



    }

    static void strictlyGreaterOrSmaller(){     // shows one num greater or smaller
        //Write a Java program to get the element in a tree set which is strictly greater than or equal to the given element.

        TreeSet<Integer>num = new TreeSet<>(Set.of(1,2,3,4,5,6,7,8,9));
        num.add(10);
        num.add(11);
        num.add(12);
        num.add(13);

        System.out.println("Number strictly greater or equal: "+ num.higher(6));
        System.out.println("Number strictly greater or equal: "+ num.higher(10));
        System.out.println("\n");
        System.out.println("Number strictly lower : "+ num.lower(10));
        System.out.println("Number strictly lower : "+ num.lower(1));

        //  Write a Java program to retrieve and remove the first element of a tree set

        System.out.println("1st element of the tree: "+ num.first());
        System.out.println("remove 1st : "+ num.remove(num.first()));
        System.out.println(num);

        //Write a Java program to retrieve and remove the last element of a tree set

        System.out.println("The last element is:"+ num.last());
        System.out.println("Remove last element "+ num.remove(num.last()));
        System.out.println("After removing last element: "+ num);

    }
    static void removeElement(){
        TreeSet<Integer> num = new TreeSet<>(Set.of(1,2,3,4,5,6,7,8,9,0));
        Scanner scan = new Scanner(System.in);
        System.out.println("The element are : "+ num);
        System.out.println("Enter the elements want to remove: ");
        Integer key = scan.nextInt();
        num.remove(key);
        System.out.println("After removing key: "+ num);


    }



}
