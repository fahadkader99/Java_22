package Challenging_Problem_Imp;

public class PangramString {
    // A pangram is a sentence containing every letter in the English Alphabet (a-z)
    // so a Pangram is a string which has all the alphabets of english language.
    // ex: the quick brown fox jumps over the lazy dog.
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter line of string: ");
//        String str = sc.nextLine();

        String s = "The quick brown fox jumps over the lazy dog";
        //String s = "abc";

        System.out.println(isPanagram(s.toLowerCase()));

    }
    public static boolean isPanagram(String s){
        if (s.length()<26){
            return false;
        }
        else {

            for (char ch = 'a'; ch <= 'z';ch++){
                if (s.indexOf(ch)<0){
                    return false;
                }
            }
        }
        return true;
    }

}
