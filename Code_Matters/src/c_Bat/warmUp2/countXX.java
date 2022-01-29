package c_Bat.warmUp2;

public class countXX {
    /**
     * Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
     *
     *
     * countXX("abcxx") → 1
     * countXX("xxx") → 2
     * countXX("xxxx") → 3
     */

    public static void main(String[] args) {
        String x = "xxxx";
        int count = 0;


        for(int i = 0; i < x.length()-1; i++){
            if (x.substring(i,i+2).equals("xx")){
                count++;
            }
        }
        System.out.println(count);

    }
}
