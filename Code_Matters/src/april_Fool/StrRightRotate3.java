package april_Fool;

public class StrRightRotate3 {
    public static void main(String[] args) {
        // right rotate string by 3 position

        String s = "12345";

        char[] ch = s.toCharArray();



        // first loop if for outer loop of 3 times
        // second loop is for iterating and changing the words for 1 time and outer loop will make it happen for multiple time

        for (int k = 0; k<3; k++){
            char last = ch[ch.length-1];

            for (int i = ch.length-1; i>0; i--){
                ch[i] = ch[i-1];
            }
            ch[0] = last;
        }

        StringBuilder sb = new StringBuilder();
        for (char c : ch){
            sb.append(c);
        }
        System.out.println(sb);

    }
}
