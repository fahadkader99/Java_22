package practice_session.Basics_Code;

import java.util.Scanner;

public class Converter_With_Method_Unfinished_Complex {
    public static void main(String[] args) {
        /**
         *
         * Write a java program that calculates to metric system
         * if incorrect input print result as -1
         *
         * 1 lb = 0.45359237 kg
         * 1 oz = 28.34952 g
         *
         * 1 ft = 0.3048 m
         * 1 ft = 30.48 cm
         * 1 in = 2.54cm
         *
         * C = (F - 32) × 5/9
         *
         *
         * Example output:
         * Enter amount:
         * 1
         * Enter type:
         * in

         * To:
         * cm
         * Result: 2.54
         *
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount: ");
        int amount = input.nextInt();

        System.out.println("Enter type: ");
        String type1 = input.nextLine();

        System.out.println("To:");
        String type2 = input.nextLine();

        double result = 0;

        Converter_With_Method_Unfinished_Complex converter = new Converter_With_Method_Unfinished_Complex();

        if (converter.isWeight(type1)){
            result = converter.calculateWeight(type1, type2, amount);
        }
        else if(converter.isLength(type1)){
            result = converter.calculateLength(type1,type2,amount);
        }else if (converter.isTemperature(type1)){
            result = converter.calculateTemperature(type1, type2, amount);
        }

        converter.printResult(result);


    }
    public boolean isWeight(String type){
        switch (type){
            case"lb":
            case"oz":
            case"kg":
            case"g":
                return true;

        }
        return false;

    }
    public boolean isLength(String type){
        switch (type){
            case"ft":
            case"in":
            case"cm":
            case"m":
                return true;
        }
        return false;
    }

    public boolean isTemperature(String type){
        switch (type){
            case"F":
            case"C":
                return true;
        }
        return false;
    }

    public double calculateWeight(String type, String to, double amount){
        if (isWeight(type) && isWeight(to)){
            if (type.equals("lb") && type.equals("kg")){
                return  0.45359237 * amount;
            }else if(type.equals("oz") && type.equals("g")){
                return 28.34952 * amount;
            }
        }
        return -1;
    }
    public double calculateTemperature(String type, String to, double amount){
        if (isTemperature(type) && isTemperature(to)){
            if (type.equals("F") && type.equals("C")){
                return (amount-32) * 5/9;
            }
        }
        return -1;
    }

    public double calculateLength(String type, String to, double amount){
        if (isLength(type) && isLength(to)){
            if (type.equals("ft") && type.equals("cm")){
                return 0.3048 * amount;
            }else if(type.equals("ft") && type.equals("m")){
                return 30.48 * amount;
            }else if(type.equals("in") && type.equals("cm")){
                return 2.54 * amount;
            }
        }
        return -1;

    }
    public void printResult(double result){
        System.out.println("Result is: " + result);
    }


}
