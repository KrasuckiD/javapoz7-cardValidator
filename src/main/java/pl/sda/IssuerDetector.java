package pl.sda;

import java.io.IOException;
import java.util.List;

public class IssuerDetector {
    public String detector(String cardNumber, List<Issuer> issuers) throws IOException {
        String result = "unknown";
        for (Issuer issuer: issuers) {
            if (cardNumber.startsWith(issuer.getPrefix()) && cardNumber.length()== issuer.getNumberOfDigits()) {
                result = issuer.getIssuer();
            }
        }
        return result;
    }
}
