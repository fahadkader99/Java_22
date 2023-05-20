package may_22;

public class ReverseWordsString {
    // reverse every word in a sentence

    public static void main(String[] args) {
       // rev1();
        rev2();

    }
    public static void rev1(){
        String word = "How are you";

        String a ="";

        for (int i = word.length()-1; i>=0; i--){
            a+= word.charAt(i);
        }
        System.out.println(a);
    }

    public static void rev2(){
        String w = "How are you";
        String[] str = w.split("\\s+");
        String a = "";

        for (String word: str ){

            String reverse = "";
            int j = word.length()-1;

            while (j>=0){

                char ch = word.charAt(j);
                reverse += ch;
                j--;

            }

            a = a+reverse+" ";
        }

        System.out.println("Reversed words: "+ a);
    }

}
