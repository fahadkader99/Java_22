package a_practice;

import java.util.Arrays;

public class FilterArray {

    // FIlter the array and return first 3 char of an String array

    public static void main(String[] args) {
        String [] arr = {"saturday", "sunday", "monday", "tuesday", "wednesday", "thursday", "friday"};     // return the arr with only first 3 char

        //1. iterate the whole arr

        String [] str = new String[arr.length];

        for (int i=0; i< arr.length; i++){
            str[i] = arr[i].substring(0,3);
        }

        System.out.println(Arrays.toString(str));

        for (String s : str){
            System.out.print(s+" ");
        }

    }
}
