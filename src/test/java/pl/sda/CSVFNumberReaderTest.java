package pl.sda;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CSVFNumberReaderTest {

    private static final String CSV_FILE_NAME = "testowy.csv";

    @Test
    public void testSCVReader() throws IOException {
        //given
        CSVFNumberReader reader = new CSVFNumberReader();
        String filePath = getClass().getClassLoader().getResource(CSV_FILE_NAME).getPath();
        List<Card> expected = new ArrayList<>();
        Card card = new Card();
        card.setCardNumber("378282246310005");
        card.setCardIssuer("unknown");
        expected.add(card);

        //when
        List<Card> result = reader.read(filePath);

        //them
        Assert.assertEquals(expected,result);

    }


}