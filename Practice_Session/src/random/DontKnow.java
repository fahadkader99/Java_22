package random;

public class DontKnow {
    public static void main(String[] args) {

        int num [] = new int[3];
        System.out.println(num);
        System.out.println(num.length);

//        for (int i = 0; i < num.length; i++){
//            System.out.print(num[i]+ " ");
//        }

        num[0] = 1;
        num[1] = 2;
        num[2] = 3;

        for (int i = 0; i < num.length; i++){
            System.out.print(num[i]+ " ");
        }
        System.out.println();
        System.out.println(num.length);

    }
}
