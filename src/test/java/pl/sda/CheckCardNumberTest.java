package pl.sda;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckCardNumberTest {
    @Test
    public void testNullCheckDigit() {
        //given
        String cardNumber = null;
        CheckCardNumber checkCardNumber = new CheckCardNumber();
        boolean result = checkCardNumber.luhnCheck(cardNumber);
        //when
        boolean expected = false;
        //them
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testCheckDigit() {
        //given
        String cardNumber = "5105105105105100";
        CheckCardNumber checkCardNumber = new CheckCardNumber();
        boolean result = checkCardNumber.luhnCheck(cardNumber);
        //when
        boolean expected = true;
        //them
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testInvalidCheckDigit() {
        //given
        String cardNumber = "510510510505100";
        CheckCardNumber checkCardNumber = new CheckCardNumber();
        boolean result = checkCardNumber.luhnCheck(cardNumber);
        //when
        boolean expected = false;
        //them
        Assert.assertEquals(expected, result);
    }

}