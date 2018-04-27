package pl.sda;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args ) throws IOException {
        String filePath = "C:\\Users\\Dell\\Desktop\\projekty\\cartValidator\\CardNumers.csv";
        CSVFNumberReader reader = new CSVFNumberReader();
        List<Card> cards = new ArrayList<>();
        cards = reader.read(filePath);
        CheckCardNumber checkCardNumber = new CheckCardNumber();


        System.out.println();
    }
}
