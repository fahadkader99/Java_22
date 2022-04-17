package april_Fool;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.*;

public class Practice_April14 {
    public static void main(String[] args) {

        //prime();
       // primeRange();
        //randomNum_String();
        //fibo();
        //sumOfArray();
        //Odd_Even_Array();
        countWord_string();



    }
    public static void prime(){
        // check the number is prime or not.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        int count = 0;
        for (int i = 1; i<=num;i++){
            if (num%i==0){
                count++;

            }
        }
        if (count==2){
            System.out.println("prime");
        }else {
            System.out.println("Not prime");
        }
    }
    public static void primeRange(){

        for (int i = 0; i<=100; i++){

            boolean isPrime = true;

            if (i>1){

                for (int j = 2; j<i; j++){
                    if (i%j==0){
                        isPrime = false;
                    }
                }


            }
            else {
                isPrime = false;
            }

            if (isPrime){
                System.out.print(i+" ");
            }
        }

    }
    public static void randomNum_String(){

        //Approach 1 - Random
        Random random = new Random();
        int num = random.nextInt(12);
        double d = random.nextDouble();
        System.out.println(num);
        System.out.println("Double value "+ (d*10));

        // Approach 2 - Match with random
        System.out.println( Math.random());

        // Apache common lang API (create number and strings)

        String number = RandomStringUtils.randomNumeric(5);
        System.out.println(number);

        String name = RandomStringUtils.randomAlphabetic(5);
        System.out.println(name);








    }
    public static void fibo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        int a = 0;
        int b = 1;
        int temp = 0;
        System.out.print(a+" "+b+" ");


        while (temp<=num){
            temp = a+b;
            if (temp>num){
                break;
            }
            System.out.print(temp+" ");
            a = b;
            b = temp;
        }

    }

    public static void sumOfArray(){

        int[] arr = {1,2,3,4,5};
        int sum = 0;

        for (int i = 0; i<arr.length;i++){
            sum+= arr[i];
        }

        System.out.println(sum);


    }
    public static void Odd_Even_Array(){
        int[] num = {1,2,3,4,5,6,7,8,9,0};


        for (int i = 0; i< num.length;i++){
            if (num[i] % 2==0){
                System.out.print("\nEven "+ num[i]+" ");
            }
            else if (num[i] % 2!= 0){
                System.out.print("\nOdd "+ num[i]+" ");
            }
        }

    }
    public static void countWord_string(){

        String str = "My name is AShikul Kader Fahad. My name is Also Fahad Kader";

        Map<String, Integer> map = new HashMap<>();

        String[] arr = str.split("\\s+");
        System.out.println(Arrays.toString(arr));

        int count = 1;

        for (int i = 0; i< arr.length;i++){

            if (!map.containsKey(arr[i])){
                map.put(arr[i],count );
            }
            else {
                map.put(arr[i],map.get(arr[i])+1 );
            }
        }

//        // print all number of words
//        for (String s : map.keySet()){
//            System.out.println(s+" = "+ map.get(s));
//        }

        // Print the repeated words
        for (String s : map.keySet()){
            if (map.get(s) >1){
                System.out.println(s+" = "+ map.get(s));
            }
        }


    }
}
