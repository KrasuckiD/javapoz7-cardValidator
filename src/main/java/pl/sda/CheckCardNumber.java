package pl.sda;

public class CheckCardNumber {
    public boolean luhnCheck(String cardNumber) {
        if (cardNumber == null) {
            return false;
        }
        char checkDigit = cardNumber.charAt(cardNumber.length() - 1);
        String digit = calculateCheckDigit(cardNumber.substring(0, cardNumber.length() - 1));

        return checkDigit == digit.charAt(0);
    }

    private String calculateCheckDigit(String cardNumber) {
        if (cardNumber == null)
            return null;
        String digit;

        int[] digits = new int[cardNumber.length()];

        for (int i = 0; i < cardNumber.length(); i++) {
            digits[i] = Character.getNumericValue(cardNumber.charAt(i));
        }

        for (int i = digits.length - 1; i >= 0; i -= 2) {
            digits[i] += digits[i];

            if (digits[i] >= 10) {
                digits[i] = digits[i] - 9;
            }
        }
        int sum = 0;

        for (int i = 0; i < digits.length; i++) {
            sum += digits[i];
        }
        sum = sum * 9;

        digit = sum + "";

        return digit.substring(digit.length() - 1);


    }
}
