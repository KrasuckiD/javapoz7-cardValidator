package pl.sda;

public class ValidationResult {
    private String issuer = "unknown";
    private boolean veryficationPassed = false;

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public boolean isVeryficationPassed() {
        return veryficationPassed;
    }

    public void setVeryficationPassed(boolean veryficationPassed) {
        this.veryficationPassed = veryficationPassed;
    }
}
