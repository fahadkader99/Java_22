package Challenging_Problem_Imp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class ReadData_TextFile {
    // read data from a text file

    public static void main(String[] args) throws Exception{

        //approach1();
        //approach2();
        approach3();


    }
    public static void approach1() throws Exception{

        // Approach 1: FileReader and Buffered reader

        FileReader file = new FileReader("src/May/TestData.txt");
        BufferedReader reader = new BufferedReader(file);


        String str;

        while ((str=reader.readLine()) !=null){
            System.out.println(str);
        }

        reader.close();
    }

    public static void approach2() throws Exception{

        // Approach 2.  Scanner and File class

        File file = new File("src/May/TestData.txt");
        Scanner sc = new Scanner(file);


        while (sc.hasNextLine()){                           // if sc has next-line the condition become true
            System.out.println(sc.nextLine());
        }


    }


    public static void approach3() throws Exception{

        File file = new File("src/May/TestData.txt");
        Scanner sc = new Scanner(file);

        sc.useDelimiter("\\Z");     // using rejex
        System.out.println(sc.next());
    }
}
