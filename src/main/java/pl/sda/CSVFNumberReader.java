package pl.sda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVFNumberReader implements SDAReader {

    @Override
    public List<Card> read(String filePath) throws IOException {
        CheckCardNumber checkCardNumber = new CheckCardNumber();
        FileReader reader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(reader);

        String line;
        List<Card> cards = new ArrayList<>();
        String[] headers = null;

        int i = 0;

        while ((line = bufferedReader.readLine()) != null && !line.isEmpty()) {
            if (i == 0) {
                headers = line.split(";");
                i++;
            } else {
                //wtym miejscu dodac algorytm i sprawdzic czy dziala
                Card parsedCard = parseCSVRow(headers, line);
                if (true == checkCardNumber.luhnCheck(parsedCard.getCardNumber())) {
                    cards.add(parsedCard);
                }
            }

        }
        return cards;
    }

    private Card parseCSVRow(String[] headers, String line) {
        Card card = new Card();
        String[] values = line.split(";");

        for (int i = 0; i < headers.length; i++) {
            setCardFieldFromCSVFile(card, headers[i], values[i]);
        }
        return card;
    }

    private void setCardFieldFromCSVFile(Card card, String header, String value) {
        if ("cardNumer".equals(header)) {
            card.setCardNumber(value);
        }
        if ("cardIssuer".equals(header)) {
            card.setCardIssuer(value);
        }

    }
}
