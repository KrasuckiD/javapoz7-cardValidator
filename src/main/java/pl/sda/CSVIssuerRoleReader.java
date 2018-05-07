package pl.sda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVIssuerRoleReader {

    public List<Issuer> readIssuerForFilePath(String filePath) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        List<Issuer> issuers = new ArrayList<>();
        String line;
        String[] headers = null;

        int i = 0;

        while ((line = bufferedReader.readLine()) != null && !line.isEmpty()) {
            if (i == 0) {
                headers = line.split(";");
                i++;
            } else {
                Issuer parsedIssuer = parseCSVRow(headers, line);
                issuers.add(parsedIssuer);
            }
        }
        return issuers;
    }

    private Issuer parseCSVRow(String[] headers, String line) {
        Issuer issuer = new Issuer();
        String[] values = line.split(";");

        for (int i = 0; i < headers.length; i++) {
            setCardFieldFromCSVFile(issuer, headers[i], values[i]);
        }
        return issuer;
    }

    private void setCardFieldFromCSVFile(Issuer issuer, String header, String value) {
        if ("issuer".equals(header)) {
            issuer.setIssuer(value);
        }
        if ("prefix".equals(header)) {
            issuer.setPrefix(value);
        }
        if ("numberOfDigits".equals(header)) {
            issuer.setNumberOfDigits(Integer.parseInt(value));
        }
    }


}
