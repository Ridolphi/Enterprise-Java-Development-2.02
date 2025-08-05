package tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OddIntegersTest {
    @Test
    void testGetOddIntegers() {
        assertArrayEquals(new int[]{1, 3, 5}, OddIntegers.getOddIntegers(5));
        assertArrayEquals(new int[]{1}, OddIntegers.getOddIntegers(1));
        assertArrayEquals(new int[]{}, OddIntegers.getOddIntegers(0));
        assertArrayEquals(new int[]{}, OddIntegers.getOddIntegers(-5));
    }
}