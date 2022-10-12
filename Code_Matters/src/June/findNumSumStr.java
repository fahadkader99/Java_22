package June;

public class findNumSumStr {
    // find the sum of the string from the
    public static void main(String[] args) {

        findSum();
    }
    public static void findSum(){
        String str = "F2ah2ad2";
        int sum = 0;

        for (int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);

             if(Character.isDigit(ch)){
                 int a = Integer.parseInt(String.valueOf(ch));
                 sum += a;
             }


        }
        System.out.println(sum);

    }
}
