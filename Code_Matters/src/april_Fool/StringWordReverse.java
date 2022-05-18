package april_Fool;

public class StringWordReverse {
    // reverse the words of a string

    public static void main(String[] args) {
        String s = "My name is Fahad";
        System.out.println(s);

        string_reverse(s);
        words_reversed(s);
    }

    public static void string_reverse(String s){
        String a ="";
        for (int i = s.length()-1; i>=0;i--){
            a+= s.charAt(i);
        }
        System.out.println(a);
    }

    public static void words_reversed(String s){

        String[] arr = s.split("\\s+");
        String a = "";

        for (int i = arr.length-1; i>=0; i--){
            a+= arr[i]+" ";
        }
        System.out.println(a);
    }
}
