package qA_Fox_3;

public class RemoveCharFromString {
    // remove special char from the string
    public static void main(String[] args) {
        String s = "%$##%$#%@$KJHKJHKJ$%#%$#*()*)(*";
        String str = s.replaceAll("[^a-zA-Z]","");
        System.out.println(str);
    }
}
