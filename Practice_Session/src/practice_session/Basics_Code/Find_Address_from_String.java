package practice_session.Basics_Code;

import java.util.Scanner;

public class Find_Address_from_String {

    Scanner input = new Scanner(System.in);
    static String address= "";
    static String city = "";
    static String state = "";
    static int zip = 0;

    public static void main(String[] args) {
        //String address = "2400 E Devon Ave #215, Des Plaines, IL 60018";

        /**
         * Write a program that provides more specific information about address
         * Any address can be inserted instead of a given address
         * get street address, city, state, and zipcode in separate variables and print them out
         */
        Find_Address_from_String add = new Find_Address_from_String();
        System.out.println("The address is: \n\n" + add.getStreetAddress(address) +" \n"+ add.getCity(city) + " \n" + add.getState(state)+ " \n"+add.getZipcode(zip));




    }
    public String getStreetAddress(String address){
        System.out.println("Enter street address : ");
        address = input.nextLine();
        return address;
    }
    public String getCity(String city) {
        System.out.println("Enter City : ");
        city = input.nextLine();
        return city;
    }

    public String getState(String state){
            System.out.println("Enter State: ");
            state = input.nextLine();

            return state;
    }
    public int getZipcode(int zip){
            System.out.println("Enter zipcode: ");
            zip = input.nextInt();
            return zip;
        }


}
