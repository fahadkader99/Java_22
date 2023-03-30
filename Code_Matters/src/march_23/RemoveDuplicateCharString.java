package march_23;

import java.util.*;

public class RemoveDuplicateCharString {
    // remove duplicate char in  a string
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a String with Duplicate char: ");
        String str = sc.nextLine().trim();
        sc.close();

        withSet(str);
        javaLambda(str);
        stringClassIndexOf(str);

    }

    static void withSet(String str){
        Set<Character> set = new LinkedHashSet<>();
        List<Character> dupList = new LinkedList<>();
        char[] ch = str.toCharArray();
        boolean flag = false;

        for (int i = 0; i < ch.length; i++){
            if (set.add(ch[i]) == false){
                dupList.add(ch[i]);
                flag = true;
            }
        }

        if (flag){
            System.out.println("After removing: " + set);
            System.out.println("Duplicate chars: " + dupList);
        }else {
            System.out.println("Not Duplicate found in : " + str);
        }


    }

    static void javaLambda(String str){

        StringBuilder sb = new StringBuilder();
        str.chars().distinct().forEach(c -> sb.append((char) c));

        System.out.println("\nRemoved duplicate with Lambda expression: " + sb);


    }

    static void stringClassIndexOf(String str){                       // indexOf() - method checks for the char based on the given index, so it checks from the 1st occurance of the char

        StringBuilder sb = new StringBuilder();
        StringBuilder duplicate = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            int index = str.indexOf(ch, i+1);               // indexOf will check for the char from the given index (i+1), if not found it will return -1 & if char found again then index will return index of the

            if (index == -1){                                         // index -1 mean char not repeated & index were not found
                sb.append(ch);
            }
            else if (index >=1){
                duplicate.append(ch+" ");
            }

        }

        System.out.println("\nDuplicate removed with index of: " + sb);
        System.out.println("Duplicate chars: " + duplicate);
    }


    static void charArray(String str){

        char[] arr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        StringBuilder duplicate = new StringBuilder();

        for (int i = 0; i < arr.length; i++){
            boolean flag = false;

            for (int j = i+1; j < arr.length; j++){          // this is how using nested loop we can compare 1:1 chars or elements by treversing.

                if (arr[i] == arr[j]){                      // inner for loop for checking arr[i] with the remaining chars. arr[j]
                    duplicate.append(arr[i]);               // if repeated is found just, storing them into different sb
                    flag = true;
                }
            }
            if (!flag){                                     // if repeated not found, then add arr[i] into regular sb
                sb.append(arr[i]);
            }

        }
        System.out.println("\nDuplicate removed with index of: " + sb);
        System.out.println("Duplicate chars: " + duplicate);

    }





























}
