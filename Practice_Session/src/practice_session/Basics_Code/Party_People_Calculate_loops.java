package practice_session.Basics_Code;

import java.util.Scanner;

public class Party_People_Calculate_loops {
    public static void main(String[] args) {
        /**
         * You have a party and need to form the list of the guests.
         * 1) You will have at least one guest.
         * 2) Ask for the guest name
         * 3) Do you want to add more guests
         *      a) if yes add again and so on
         *      b) if not pint the guest list
         *
         * ex:
         * Please, enter a guest name:
         * Kanat
         * Do you want to add more guests?
         * yes
         * Please, enter a guest name:
         * Anna
         * Do you want to add more guests?
         * no
         * Guest List: Kanat, Anna
         */

        Scanner scanner = new Scanner(System.in);

        Party_People_Calculate_loops party = new Party_People_Calculate_loops();
        System.out.println(party.getList(scanner));


    }
    public String getList(Scanner scanner){
        String yesOrNo = "";
        String name = "";
        do {
            System.out.println("Enter a guest name: ");
            String guest = scanner.nextLine();
            name = name + "," + guest;
            System.out.println("Do you want to add more guests?");
            yesOrNo = scanner.nextLine();


        } while (yesOrNo.equals("yes"));
        return name.substring(1);

    }
}
