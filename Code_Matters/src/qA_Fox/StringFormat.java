package qA_Fox;

public class StringFormat {
    public static void main(String[] args) {
        // change/ replace string in the runtime

        String hel = "Hello XXX";
        System.out.println(hel.replace("XXX", "Ash"));

        ////================================

        String name = "Ash";
        String a = String.format("name is %s",name);
        String b = String.format("value is %f",3.222);

        System.out.println(a);
        System.out.println(b);

        /////==================================

        String s = "Hello %s %s";
        String n = String.format(s,"Kader","bye");
        System.out.println(n);

    }
}
