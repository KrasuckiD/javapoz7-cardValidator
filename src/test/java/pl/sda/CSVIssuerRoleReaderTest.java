package pl.sda;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CSVIssuerRoleReaderTest {

    private static final String CSV_FILE_NAME = "testowyIssuer.csv";

    @Test
    public void testCSVRead() throws IOException {
        //given
        CSVIssuerRoleReader reader = new CSVIssuerRoleReader();
        String filePath = getClass().getClassLoader().getResource(CSV_FILE_NAME).getPath();
        List<Issuer> expected = new ArrayList<>();
        Issuer issuer = new Issuer();
        issuer.setIssuer("Visa");
        issuer.setPrefix("4");
        issuer.setNumberOfDigits(16);
        expected.add(issuer);

        //when
        List<Issuer> result = reader.readIssuerForFilePath(filePath);

        //them
        Assert.assertEquals(expected, result);
    }

}