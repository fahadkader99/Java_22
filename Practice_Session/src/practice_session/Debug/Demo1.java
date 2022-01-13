package practice_session.Debug;

public class Demo1 {
    public static void main(String[] args) {

        int houseSqFt = 0;
        int livingRoom = 20 * 18;
        houseSqFt = livingRoom;


        int bedroom1 = 14 * 15;
        houseSqFt = houseSqFt + bedroom1;


        int bedroom2 = 20 * 22;
        houseSqFt = houseSqFt + bedroom2;


        int bathroom = 10 * 14;
        houseSqFt = houseSqFt + bathroom;


        int kitchen = 15 * 15;
        houseSqFt = houseSqFt + kitchen;

        System.out.println("House SqFt: "+ houseSqFt);


    }
}
