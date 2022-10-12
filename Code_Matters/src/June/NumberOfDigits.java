package June;

public class NumberOfDigits {

    public static void main(String[] args) {
        // count the number of digits in a number

        int num = 145678;
        int counter = 0;


        while(num !=0){
            num = num/10;
            counter++;
        }
        System.out.println(counter);
    }
}
