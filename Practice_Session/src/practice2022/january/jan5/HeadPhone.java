package practice2022.january.jan5;

import java.util.Arrays;

public class HeadPhone {
    String charge = "Micro USB";
    String[] controls = {"Power", "Volume", "Skip", "Play/pause"};
    String color = "Blue";

    static boolean power = false;
    static int volume = 0;

    public static void powerOn(){
        power = true;
    }
    public static void powerOff(){
        power = false;
    }
    public static void volumeUp(){
        volume++;
    }
    public static void volumeDown(){
        volume--;
    }

}

class HeadphoneDemo{
    public static void main(String[] args) {
        HeadPhone h = new HeadPhone();
        System.out.println(h.charge);
        System.out.println(Arrays.toString(h.controls));
        System.out.println(h.color);
    }
}