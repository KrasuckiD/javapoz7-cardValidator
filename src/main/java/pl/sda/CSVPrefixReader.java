package pl.sda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVPrefixReader implements SDAReader {
    @Override
    public List<Card> read(String filePath) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        List<Card> cards = new ArrayList<>();
        String[] headers = null;

        int i = 0;

        while ((line = bufferedReader.readLine()) != null && !line.isEmpty()) {
            if (i == 0) {
                headers = line.split(";");
                i++;
            } else {
                Card parsedCard = parseCSVRow(headers, line);
                    cards.add(parsedCard);
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

    }
}
