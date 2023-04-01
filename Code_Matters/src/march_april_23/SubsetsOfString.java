package march_april_23;

public class SubsetsOfString {
    // find subsets of a given sting

    /**
     * How to find all subset of a string ?
     * If the num of char in  a given string in N, then the possible subsets will be = N(N+1)/2
     * String TOY has 3(3+1)/2 = 6. > [T, O, Y, TO, OY, TOY]
     */

    public static void main(String[] args) {
        /**
         * find the length of the str
         * create a subset array with the size of the subset
         * inside a nested loop use substring method to find all the possible subsets & store them in the array
         * loop the array & print all the subsets.
         */


        String a = "TEXT";
        int temp = 0;
        int length = a.length();

        String [] array = new String[length * (length+1)/2];

        for (int i = 0; i < a.length(); i++){
            for (int j = i; j < a.length(); j++){
                array[temp] = a.substring(i, j+1);
                temp++;
            }
        }

        // display the results
        System.out.println("\nPossible Subsets of the String: ");
        for (int i = 0; i < array.length; i++ ){
            System.out.println(array[i]);
        }

    }
}
