package april_Fool;

public class ABC_Random {


/*Write a program to print all the combination of the same length for a given string.


Given input = "ABC"
Expected output = "ABC, BAC, BCA, CAB, CBA"

Assumptions- String contains unique characters which means it doesn't contain any duplicates.*/

    public static void main(String[] args) {
        String s = "ABC";
        int n = s.length();
        ABC_Random random = new ABC_Random();
        random.calculate(s, 0, n-1);
    }

    // recursive method
    private void calculate(String str, int left, int right){

        if (left==right){
            System.out.println(str);
        }else {
            for (int i = left; i<= right; i++){
                String swapped = this.swap(str, left, i);
                this.calculate(swapped, left+1, right);
            }
        }

    }

    // swapping
    private String swap(String str, int i, int j){
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;

        return String.valueOf(charArray);       // String.valueOf convert anything to String.
    }



}
