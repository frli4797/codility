package se.soprasteria.codility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Fredrik on 17-03-03.
 */
public class TestDecimalReprZip {

    DecimalReprZip underTest = new DecimalReprZip();

    @Test
    public void solution() {
        assertEquals(16273845, underTest.solution(12345, 678));
    }

    @Test
    public void extremeMaxV() {
        assertEquals(100000000, underTest.solution(0, 100000000));
    }

    @Test
    public void simple1() {
        assertEquals(152637, underTest.solution(123, 567));
    }

    @Test
    public void simple2() {
        assertEquals(11, underTest.solution(1, 1));
    }

    @Test
    public void simple3() {
        assertEquals(11021301, underTest.solution(10101, 123));
    }

    @Test
    public void simple4() {
        assertEquals(-1, underTest.solution(1010121, 123123));
    }


}