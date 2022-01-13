package practice_session.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ArrayOfStringIO {
    public static void main(String[] args) {

        String[] names = {"Ash", "Kader", "Fahad", "jahan"};

        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("My name is Ashikul Kaader Fahad");
            writer.write("I am currently 29 years old and i am learning Java Day and night");
            writer.write("My schoold name is devx");
            writer.write("\nI live in NY, Bronx");

            for(String s : names){          // writing all the name of Array using for each loop to the file.
                writer.write("\n"+ s);
            }
            writer.close();

        }catch (Exception e){
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String line;
            while ((line = reader.readLine()) != null){     // reading all lines using while loop and creating another variable
                System.out.println(line);
            }

            //System.out.println(reader.readLine());
            reader.close();


        }
        catch (Exception e){
            e.printStackTrace();
        }



    }
}
