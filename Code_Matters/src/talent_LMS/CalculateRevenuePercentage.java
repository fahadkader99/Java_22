package talent_LMS;

import java.util.Scanner;

public class CalculateRevenuePercentage {
    /*
    The discount rate is 10% for the quantity purchased between 100 and 120 units,
    and 15% for the quantity purchased greater than 120 units. If the quantity purchased is less than 100 units,
     the discount rate is 0%. See the example output as shown below:
Enter unit price: 25

Enter quantity: 110

The revenue from sale: 2475.0$

After discount: 275.0$(10.0%)
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter unit price ");
        double unitPrice = sc.nextInt();
        System.out.println("Enter the quantity to purchase: ");
        double quantity = sc.nextInt();


        double percentage = 0;

        if(quantity >=100 && quantity <=120){
            percentage = (10 * (unitPrice*quantity))/100;
            System.out.println("The revenue from sale: "+ ((quantity*unitPrice)-percentage)+"$");
            System.out.println("After discount: "+ percentage+"$ - 10%");

        }
        if(quantity >120){
            percentage = (15 * (unitPrice*quantity))/100;
            System.out.println("The revenue from sale: "+ ((quantity*unitPrice)-percentage)+"$");
            System.out.println("After discount: "+ percentage+"$ - 15%");

        }
        if(quantity>0 && quantity <100){
            percentage = (0 * (unitPrice*quantity))/100;
            System.out.println("The revenue from sale: "+ ((quantity*unitPrice)-percentage)+"$");
            System.out.println("After discount: "+ percentage+"$ - 0%");

        }



    }
}
