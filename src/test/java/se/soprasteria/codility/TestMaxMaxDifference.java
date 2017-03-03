package se.soprasteria.codility;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertEquals;

/**
 * Created by Fredrik on 17-03-03.
 */

public class TestMaxMaxDifference {

    private static int MAX = 1000000;
    private final Random rng = new Random();
    private MaxMaxDifference underTest = new MaxMaxDifference();
    private int[] random100000;
    private int[] random1000000;// Ideally just create one instance globally

    @Before
    public void setUp() throws Exception {
        random100000 = createRandomArray(10000);
        random1000000 = createRandomArray(100000);
    }

    @Test
    public void shortArray() {
        int[] a = new int[]{1, 2, 3, 4, 5, 7, 8, 9};
        assertEquals(8, underTest.solution(a));
    }

    @Test
    public void exampleOne() {
        int[] a = new int[]{1, 3, -3};
        assertEquals(6, underTest.solution(a));

    }

    @Test
    public void exampleTwo() {
        int[] a = new int[]{4, 3, 2, 5, 1, 1};
        assertEquals(4, underTest.solution(a));

    }

    @Test
    public void extremeValues() throws Exception {
        int[] a = new int[]{-1000000, -1000000};
        assertEquals(0, underTest.solution(a));
    }

    @Test(timeout = 100)
    public void longArray1() {
        underTest.solution(random100000);
    }

    @Test(timeout = 100)
    public void longArray2() {
        underTest.solution(random1000000);
    }

    private int[] createRandomArray(int elements) {
        if (Integer.MAX_VALUE < elements) {
            throw new IllegalArgumentException("Can't ask for more numbers than are available");
        }

        List<Integer> generated = new ArrayList<>();
        while (generated.size() < elements) {
            Integer next = rng.nextInt(MAX) + 1;
            generated.add(next);
        }
        return generated.stream().mapToInt(i -> i).toArray();


    }


}
