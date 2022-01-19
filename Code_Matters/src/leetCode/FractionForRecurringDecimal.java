package leetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FractionForRecurringDecimal {
    /*
    Given two integers representing the numerator and denominator of a fraction, return the fraction in string format
    If the fractional part is repeating, enclose the repeating part in paranthesis.

    In: numerator = 1, denominator = 2
    out: "0.5"

    int: numerator = 2, denominator = 3
    out: "0.(6)"

     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter numerator: ");
        int numerator = s.nextInt();
        System.out.println("Enter denominator: ");
        int denominator = s.nextInt();

        if (numerator ==0 ){
            System.out.println("0");
        }
        StringBuilder sb = new StringBuilder();

        if ((numerator <0 && denominator >0) || (numerator > 0 && denominator <0)){
            sb.append("-");
        }

        long divisor = Math.abs((long) numerator);
        long dividend = Math.abs((long) denominator);
        long remainder = divisor % dividend;
        sb.append(divisor/dividend);

        if (remainder==0){
            System.out.println(sb.toString());
        }

        sb.append('.');
        Map<Long,Integer> map = new HashMap<>();
        while (remainder !=0){
            if (map.containsKey(remainder)){
                sb.insert(map.get(remainder),"(");
                sb.append(")");
                break;
            }
        }
        System.out.println(map);

    }
}
