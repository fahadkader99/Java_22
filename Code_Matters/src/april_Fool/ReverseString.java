package april_Fool;

public class ReverseString {
    // reverse a given string

    public static void main(String[] args) {
        String a = "I love Java";

        //reverse1(a);
        //reverse2(a);
        rev3(a);

    }
    public static void reverse1(String a){

        String b = "";

        for (int i = a.length()-1; i>=0; i--){
            b += a.charAt(i);
        }

        System.out.println(b);
    }
    public static void reverse2(String a){

        String [] arr =a.split(" ");
        String b = "";

        for (int i = arr.length-1; i>=0; i--){
            b += arr[i]+" ";
        }

        System.out.println(b);

    }

    public static void rev3(String a){
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        System.out.println(sb.reverse());
    }

}