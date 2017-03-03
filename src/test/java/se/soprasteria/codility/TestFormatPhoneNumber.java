package se.soprasteria.codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Fredrik on 17-03-03.
 */
public class TestFormatPhoneNumber {

    FormatPhoneNumber underTest = new FormatPhoneNumber();

    @Test
    public void basicTest() {
        assertEquals("004-448-555-583-61", underTest.solution("00-44  48 5555 8361"));
    }

    @Test
    public void basicTest2() {
        assertEquals("004-448-555-58-31", underTest.solution("00-44  48 5555 831"));
    }

    @Test
    public void basicTest3() {
        assertEquals("004-448-555-583-611", underTest.solution("00-44  48 5555 83611"));
    }
}
