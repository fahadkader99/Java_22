package practice_session.Array.Single_Dimension;

public class ForEachLoop {      // it is an enhanced loop used for array
    public static void main(String[] args) {


         String[] name = {"Fahad", "Kader", "Urmy", "Jahan"};

        System.out.println("The size of array: " + name.length);

//         for (int i = 0; i < name.length; i ++){
//             System.out.println(name[i]);
//         }

         for (String x : name){         // using for each loop instead of for.
             System.out.println(x);
         }

    }
}
