package May;

public class StringLeft2Rotate {
    // string left 2 rotation
    public static void main(String[] args) {
        String a = "12345";

        leftRotate(a);

    }
    public static void leftRotate(String a){
        char[] ch = a.toCharArray();


        for (int i=0; i<2;i++){

            char left = ch[0];

            for (int j = 0; j< ch.length-1;j++){
                ch[j] = ch[j+1];
            }
            ch[ch.length-1] = left;
        }

        StringBuilder sb = new StringBuilder();
        for (char c : ch){
            sb.append(c);
        }
        System.out.println(sb);
    }
}
