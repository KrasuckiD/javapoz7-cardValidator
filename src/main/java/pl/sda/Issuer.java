package pl.sda;

import java.util.Objects;

public class Issuer {
    private String issuer;
    private String prefix;
    private int numberOfDigits;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public int getNumberOfDigits() {
        return numberOfDigits;
    }

    public void setNumberOfDigits(int numberOfDigits) {
        this.numberOfDigits = numberOfDigits;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Issuer issuer1 = (Issuer) o;
        return numberOfDigits == issuer1.numberOfDigits &&
                Objects.equals(issuer, issuer1.issuer) &&
                Objects.equals(prefix, issuer1.prefix);
    }

    @Override
    public int hashCode() {

        return Objects.hash(issuer, prefix, numberOfDigits);
    }
}
