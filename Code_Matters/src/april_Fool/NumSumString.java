package april_Fool;

public class NumSumString {

    public static void main(String[] args) {

        String a = "My 2 name4 Fahad4 Kad2er";          // find the sum of the numbers
        int sum = 0;

        for (int i = 0; i<a.length();i++){

            char ch = a.charAt(i);

            if (Character.isDigit(ch)){

                int num =Integer.parseInt(String.valueOf(ch));
                sum += num;
            }
        }

        System.out.println(sum);

    }
}
