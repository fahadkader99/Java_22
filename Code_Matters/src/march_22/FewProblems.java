package march_22;

import java.util.*;

public class FewProblems {
    // Write code to filter duplicate elements from an array and print as a list?

    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,1,2,3,4,6};

        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        //removeDup(arr,set);
        //removeListDup();
        //reverseNum();
        //findPrime();
        //first2MaxArray();
        //removeSpacesFromString();
        //Palindrome();
        //swapNumbers();
        //StringReverse1();
        //reverseWordsOfString();
        longestStringFromString();

     }
     public static void removeDup(Integer[] arr, Set<Integer> set){

        for (int i = 0; i< arr.length;i++){
            if (set.add(arr[i])==false){
                set.add(arr[i]);
            }
        }

         //System.out.println(set);
        List<Integer> list = new ArrayList<>();
        list.addAll(set);
         System.out.println(list);


     }

     public static void removeListDup(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);

         Collections.sort(list);
         System.out.println(list);

         for (int i = 0; i<list.size()-1;i++){
             for (int j = i+1; j<list.size();j++){
                if (list.get(i).equals(list.get(j))){
                    list.remove(list.get(j));
                }
             }
         }
         System.out.println(list);


     }

     public static void reverseNum(){
        //Write a function to reverse a number in Java

         int num = 12345;

         int n = 0;

         while (num != 0){
             int remainder = num % 10;
             n = (n * 10)+remainder;
             num = num / 10;
         }

         System.out.println(n);
     }
     public static void findPrime(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num: ");
        int num = sc.nextInt();

        int count = 0;

        for (int i = 1; i<= num; i++){
            if (num % i ==0){
                count++;
            }
        }

        if (count==2){
            System.out.println("Prime");
        }else {
            System.out.println("Not Prime");
        }


     }
     public static void first2MaxArray(){
        int[] nums = {1,2,3,4,5,6,7,8};

        int m1 = nums[0];
        int m2 = nums[0];

        for (int i = 0; i< nums.length;i++){
            if (nums[i] > m2){
                m2 = m1;
                m1  = nums[i];
            }
        }
         System.out.println(m1);
         System.out.println(m2);

     }
     public static void removeSpacesFromString(){
        String s = "   1 I      am    Fahad   ";
        String str = s.replaceAll("\\s{2,}", " ").trim();
         System.out.println(str);


     }
     public static void Palindrome(){
        // Write Java code to identify a number as Palindrome?

        int a = 545;
        int c = a;

        int b = 0;

        while (a != 0){
            int remainder = a % 10;
            b = (b * 10)+ remainder;
            a = a/10;
        }
         System.out.println(b);
        if (c==b){
            System.out.println("Palindrome");
        }else System.out.println("Not Pal");
     }

     public static void swapNumbers(){
        int a = 10;
        int b = 20;

//        a = a*b;
//        b = a / b;
//        a = a/b;

         a = a+b;
         b = a-b;
         a = a-b;
        System.out.println(a+" "+ b);
     }
     public static void StringReverse1(){
        String s = "Fahad Kader";

        String a = "";

        for (int i = s.length()-1; i>=0; i--){
            a += s.charAt(i);
        }

         System.out.println(a);

        StringBuilder builder = new StringBuilder();
        builder.append("Fahad");
        builder.append(" ");
        builder.append("Kader");
         System.out.println(builder);
         String n = builder.reverse().toString();
         System.out.println(n);

     }

     public static void reverseWordsOfString(){
        String s = "     Name Is      Fahad     Kader     ";
        String a = s.replaceAll("\\s{2,}"," ").trim();
         System.out.println(a);

         String [] str = a.split(" ");

         String result = "";

         for (int i = str.length-1; i>=0; i--){
            result+= str[i]+" ";
         }

         System.out.println(result);
     }

     public static void longestStringFromString(){

        // Write a Java program to find the longest substring from a given string which doesn’t contain any duplicate characters?

     }


}
