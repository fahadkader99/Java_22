package march_april_23;

public class LongNum {
    public static void main(String[] args) {
        long longNumberWithoutL = 1000 * 60 * 60 * 24 * 365;
        long longNumberWithL = 1000 * 60 * 60 * 24 * 365L;

        System.out.println(longNumberWithoutL);
        System.out.println(longNumberWithL);
    }
}
