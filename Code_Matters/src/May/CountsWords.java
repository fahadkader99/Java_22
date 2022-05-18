package May;

public class CountsWords {

    // count words in a string

    public static void main(String[] args) {
        String str = "I love Java";
        one(str);
        two(str);


    }
    public static void one(String str){

        String a[] = str.split("\\s+");
        System.out.println(a.length);
    }

    public static void two(String str){

        int count = 1;

        for (int i = 0; i<str.length();i++){
            if((str.charAt(i) ==' ') && (str.charAt(i+1) != ' ')){
                count++;
            }
        }
        System.out.println("Num of words "+ count);
    }
}
