package march_23;

public class Print1to100 {
    // print 1 0 100 without using any loop

    public static void main(String[] args) {

        printInfo(20);

    }
    public static void printInfo(int num){

        if (num <= 100){
            num++;
            System.out.println(num);
            printInfo(num);
        }
    }

}
