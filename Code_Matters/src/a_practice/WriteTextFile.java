package a_practice;

import org.testng.annotations.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteTextFile {
    // write data into text file

    @Test
    void WriteIntoTextFile() throws Exception{
                FileWriter fw = new FileWriter("/Users/fahadkader/Documents/text2.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Fahad Kader");
        bw.write("Esrat Jahan");
        bw.write("Sania Jahan");
        bw.close();

        System.out.println("Finish");
    }
}
