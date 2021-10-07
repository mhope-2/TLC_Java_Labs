package Streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

public class ReadFile {
    public static void main(String[] args) {
        Path path = Paths.get(System.getProperty("user.dir")+"\\Streams\\Trades.txt");

        try{
            List<String> contents = Files.readAllLines(path);

            // read from the stream
            for (Object content : contents){
                System.out.println(content);
            }
            System.out.println(LocalDate.now());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
