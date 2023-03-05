package jan_23;

public class LastFourCharStr {
    // extract last four char from a string
    public static void main(String[] args) {
        String a = "123";
        String b = "";
        boolean flag = false;

        if (a.length() >= 4){

            b = a.substring(a.length()-4);
            flag = true;
        }
        else {
            flag = false;
        }

        if (flag){
            System.out.println("Last 4: " + b);
        }else {
            System.out.println("Try Again | Not enough chars.");
        }
    }
}
