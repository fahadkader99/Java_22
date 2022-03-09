package march_22;

public class AddNumInString {
    public static void main(String[] args) {
        // add the numbers in the string:
        String str = "Fa2ha5";

        int sum = 0;
        for (int i = 0; i<str.length();i++){
            char ch = str.charAt(i);

            if (Character.isDigit(ch)){
                int num = Integer.parseInt(String.valueOf(ch));
                sum = sum+num;
            }
        }
        System.out.println(sum);
    }
}
