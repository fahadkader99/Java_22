package april_Fool;

public class DiceGame {

    /*Let's create a game where we roll a die, and move a player around a game board.
The board has 40 spaces, arranged in a circle

The player starts at position 0.  Loop 30 times.  Each time through the loop, do this:
- roll the die (each die has a random value, 1-6) - 1die
- print player start position, die value, and ending position

sample output:

    //     start=0, roll=3, end=3
    //     start=3, roll=2, end=5
    //     ...
//     start=38, roll=6, en

*/
    public static void main(String[] args) {

        int start = ((int) (Math.random()*6)+1);
        int roll = ((int) (Math.random()*6)+1);
        int end  = start+ roll;

        for (int i = 0; i<=40; i++){
            System.out.println("start = "+ start);
            System.out.println("roll = "+ roll);
            System.out.println("end = "+end );
            break;
        }

    }
}
