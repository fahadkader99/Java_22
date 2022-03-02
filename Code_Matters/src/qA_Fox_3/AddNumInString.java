package qA_Fox_3;

public class AddNumInString {
    // add all the digits in a string:

    public static void main(String[] args) {

        String s = "Fa1h2ad9"; // out - 12;


        numberOfDigit(s);
        digitSum(s);



    }
    public static void digitSum(String s){
        int sum = 0;

        for (int i = 0 ; i<s.length();i++){
            char ch = s.charAt(i);

            if (Character.isDigit(ch)){
                int a = Integer.parseInt(String.valueOf(ch));
                sum = sum+a;
            }
        }

        System.out.println("Sum of digits: "+ sum);
    }
    public static void numberOfDigit(String  s){

        int count = 0;

        for (int i = 0; i <s.length();i++){
            char ch = s.charAt(i);

            if (Character.isDigit(ch)){
                count++;
            }
        }

        System.out.println("Number of digit in the string: "+ count);

    }
}
