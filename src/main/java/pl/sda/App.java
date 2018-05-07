package pl.sda;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\Dell\\Desktop\\projekty\\cartValidator\\CardNumbers.csv";
        CSVFNumberReader reader = new CSVFNumberReader();
        List<Card> cards;
        cards = reader.readCardNumberFromFilePath(filePath);
        for (Card card : cards) {
            System.out.println("Numer karty: " + card.getCardNumber() + " Wydawca: " + card.getCardIssuer());
        }

        System.out.println();
    }
}
