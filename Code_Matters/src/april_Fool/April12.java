package april_Fool;

import java.util.*;

public class April12 {

    public static void main(String[] args) {

        //reverseString();
        //string_Reverse_Words();
       // rotateString_by1();
        //rightRotateStringBy1();
        //leftRotateArrayBy3();
        //swapArray();
       // Reverse_Array();
       // Fibonacci();
        //findWord_Occurrence();
        //find_char_occurrence();
        //find_prime();
       // prime_in_Range();
        find_duplicate_string();



    }
    public static void reverseString(){
        String str = "Fahad ";
        String s = "";


        for (int i = str.length()-1; i>=0; i--){
            s += str.charAt(i);
        }
        System.out.println(s);




    }

    public static void string_Reverse_Words(){

        String str = "Ashikul Kader Fahad";

        String []arr = str.split("\\s+");
        System.out.println(Arrays.toString(arr));

        String s = "";

        for (int i = arr.length-1; i>=0;i--){
            s+= arr[i]+" ";
        }

        System.out.println(s);


    }
    public static void rotateString_by1(){
        String a = "Fahad";

        char[]arr=a.toCharArray();

        char left = arr[0];
        for (int i = 0; i< arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = left;

        StringBuilder sb = new StringBuilder();
        for (Character c: arr){
            sb.append(c);
        }
        System.out.println(sb);

    }

    public static void rightRotateStringBy1(){
        String a = "Fahad";
        char[]ch = a.toCharArray();
        char right = ch[ch.length-1];

        for (int i = ch.length-1; i>0;i--){
            ch[i] = ch[i-1];
        }

        ch[0] = right;

        StringBuilder sb= new StringBuilder();
        for (Character c : ch){
            sb.append(c);
        }
        System.out.println(sb);


    }
    public static void leftRotateArrayBy3(){
        int[] arr = {1,2,3,4,5};

        for (int i = 0; i<3;i++){
            int left = arr[0];

            for (int j = 0; j< arr.length-1;j++){
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = left;

        }
        System.out.println(Arrays.toString(arr));

    }
    public static void swapArray(){
        int[] arr = {1,2,3,4,5};

        int temp = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = temp;


        System.out.println(Arrays.toString(arr));


    }

    public static void Reverse_Array(){
        int[] arr = {1,2,3,4,5};


        for (int i = 0; i< arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i -1];
            arr[arr.length-i -1] = temp;

        }
        System.out.println(Arrays.toString(arr));


    }
    public static void Fibonacci(){
        // i will always need a range;

        int range = 20;
        int a = 0;
        int b = 1;
        int temp = 0;
        System.out.print(a+" "+b+" ");

        while (temp<=range){
            temp = a+b;

            if (temp>range) break;

            System.out.print(temp+" ");
            a = b;
            b =temp;
        }

    }

    public static void findWord_Occurrence(){
        String str = "My name is Fahad, My name is Ashikul";

        String[]arr = str.split("\\s+");
        Map<String, Integer> map = new LinkedHashMap<>();
        int count = 1;

        for (int i = 0; i< arr.length;i++){

            if (!map.containsKey(arr[i])){
                map.put(arr[i],count);
            }
            else {
                map.put(arr[i],map.get(arr[i])+1);
            }

        }

        // print
        for (String s : map.keySet()){
            System.out.println(s+" = "+ map.get(s));
        }

    }

    public static void find_char_occurrence(){
        String s = "Ashikul Fahad Kader";

        char[] chars = s.toCharArray();
        int count = 1;

        Map<Character,Integer> map = new LinkedHashMap<>();

        for (int i = 0; i<chars.length;i++){

            if (!map.containsKey(chars[i])){
                map.put(chars[i],count);
            }
            else {
                map.put(chars[i], map.get(chars[i])+1);
            }
        }
        // print
        for (Character c : map.keySet()){
            System.out.println(c+" = "+ map.get(c));
        }

    }

    public static void find_prime(){
        int num = 5;

        int count = 0;
        for (int i = 1; i<=5;i++) {
            if (num%i==0){
                count++;
            }
        }

        if (count==2){
            System.out.println("P");
        }else {
            System.out.println("NP");
        }
    }


    public static void prime_in_Range(){

        for (int i = 1;i<=50;i++){

            boolean isPrime = true;

            if (i>1){

                for (int j = 2; j<i; j++){
                    if (i%j==0){
                        isPrime = false;
                    }
                }
            }else {
                isPrime = false;
            }

            if (isPrime){
                System.out.print(i+" ");
            }

        }


    }

    public static void find_duplicate_string(){
        String s = "Fahad Kader";

        // 1st approach with set
        Set<Character> set = new LinkedHashSet<>();

//        for (int i = 0; i<s.length();i++){
//            if (set.add(s.charAt(i))==false){
//                System.out.println(s.charAt(i));
//            }
//        }

        // 2nd approach with Map
        Map<Character, Integer> map = new LinkedHashMap<>();
        int count = 1;
        char[] ch = s.toCharArray();

        for (int i = 0; i<ch.length;i++){
            if (!map.containsKey(ch[i])){
                map.put(ch[i],count);
            }
            else {
                map.put(ch[i],map.get(ch[i])+1);
            }
        }

        // print
        for (Character c: map.keySet()){
            if (map.get(c)>1){                              // anything more than 1 is repeats
                System.out.println(c+" = "+map.get(c));
            }
        }


    }

}
