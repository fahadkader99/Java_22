package qA_Fox_3;

import java.net.InetAddress;
import java.util.Scanner;

public class FindIPWebsite {
    // find the ip address of a given website
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the website");
        String website = sc.nextLine();


       try {
           InetAddress ip = InetAddress.getByName(website);
           System.out.println("The IP of the Website: "+ ip);
       }catch (Exception e){
           System.out.println("THe website is not found");
       }
       sc.close();

    }
}
