package Streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Scanner;


public class ReadFileIntoCollection {
    public static void main(String[] args) {

        Path path = Paths.get(System.getProperty("user.dir")+"\\Streams\\Trades.txt");

        try{
            BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8);
            String currentLine = null;

            while ((currentLine = reader.readLine()) != null){
                Scanner scanner = new Scanner(currentLine).useDelimiter(",");

                TradeFile tradeObj = new TradeFile(scanner.next(), scanner.next(), scanner.next(),scanner.next(), scanner.next());

                System.out.println(tradeObj);
//                System.out.println(scanner.next());
//                System.out.println(scanner.next());
//                System.out.println(scanner.next());
//                System.out.println(scanner.next());
//                System.out.println(scanner.next());
//                System.out.println(currentLine);
            }

        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
