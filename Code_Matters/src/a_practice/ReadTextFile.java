package a_practice;

import java.io.*;
import java.util.Scanner;

public class ReadTextFile {

    // read text file from a string - FileReader + BufferReader

    public static void main(String[] args) throws IOException {

        /*
         1. Using file reader
         */
//        FileReader fr = new FileReader("/Users/fahadkader/Documents/text.txt");
//        BufferedReader br = new BufferedReader(fr);
//
//        String str;
//        while ((str = br.readLine())!= null){
//
//            System.out.println(str);
//        }
//        br.close();

        /*
         2. using scanner & File
         */
//
//        File file = new File("/Users/fahadkader/Documents/text.txt");
//        Scanner sc = new Scanner(file);
//        while (sc.hasNextLine()){
//            System.out.println(sc.nextLine());
//        }
//        sc.close();


        /*
        3. with Delimiter
         */

        File file = new File("/Users/fahadkader/Documents/text.txt");
        Scanner sc = new Scanner(file);
        sc.useDelimiter("//Z");
        System.out.println(sc.next());


    }
}
