package talent_LMS;

public class Substring {
    /*
    public class TestSubstring{
 public static void main(String args[]){
   String s="WelcomeToDevXSchool";
   System.out.println(???????????????);//DevX
   System.out.println(???????????????);//School
 }
}
     */

    public static void main(String[] args) {

        String s="WelcomeToDevXSchool";

        System.out.println(s.substring(0,7));
        System.out.println(s.substring(7,9));
        System.out.println(s.substring(9,13));
        System.out.println(s.substring(13, s.length()));

    }
}
