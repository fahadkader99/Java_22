package march_april_23;

public class AddNumString {
    public static void main(String[] args) {

        String a = "a2b2c3";    // add all the numbers in the sting

        int sum = 0;


        for (int i = 0; i < a.length(); i++){
            char c = a.charAt(i);

            if (Character.isDigit(c)){
                 int d = Integer.parseInt(String.valueOf(c));
                    sum += d;

            }

        }
        System.out.println(sum);


        // number of int char in the string
        int count = 0;

        for (int i = 0; i<a.length(); i++){
            char c = a.charAt(i);
            if (Character.isDigit(c)){
                count++;
            }
        }
        System.out.println("Num of int char: " + count);
    }
}
