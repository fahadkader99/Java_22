package practice_session.IO;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileIO {
    public static void main(String[] args) {

        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("this is fahad.\nI am a new student and currently learning java");
            writer.write("I have a beautiful wife and her name is Esrat jahan. ");
            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }




    }
}
