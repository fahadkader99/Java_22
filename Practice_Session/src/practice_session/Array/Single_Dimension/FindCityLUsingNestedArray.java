package practice_session.Array.Single_Dimension;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class FindCityLUsingNestedArray {
    // write a method that returns an int array which has the same length as the cities array
    // and each index it should have the number of times letter 'l' or 'L' appears

    public static void main(String[] args) {

        String[] cities = { "Los Angeles", "San Francisco", "Chicago", "New York", "Boston", "London"};


        System.out.println(Arrays.toString(cities));

        System.out.println(Arrays.toString(countNumberOfChar(cities)));

    }
    public static int[] countNumberOfChar(String[] arr){

        int[] numOfChars = new int[arr.length];

        for (int i =0; i < numOfChars.length-1; i++){
            int counter = 0;

            for (int j = 0; j <arr[i].length(); j++){
                if (arr[i].charAt(j) == 'l' || arr[i].charAt(j) == 'L'){
                    counter++;
                }
            }
            numOfChars[i] = counter;

        }
        return numOfChars;


    }
}
