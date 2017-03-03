package se.soprasteria.codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Fredrik on 17-03-03.
 */
public class TestDigitlessPassword {

    private DigitlessPassword underTest = new DigitlessPassword();

    @Test
    public void basicTest() {
        assertEquals(2, underTest.solution("a0Ba"));
    }

    @Test
    public void notValidPassword() {
        assertEquals(-1, underTest.solution("kdfafjdfnglafhihgnfdfjnakfnjafaknfkadjnf"));
    }

    @Test
    public void onlyDigits() {
        assertEquals(-1, underTest.solution("0853504983403959485309435984593058u"));
    }
}
