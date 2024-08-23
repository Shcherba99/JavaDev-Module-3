import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {
    private SumCalculator sumCalculator;


    @BeforeEach
    public void init() {
        sumCalculator = new SumCalculator();
    }


    @Test
    public void testSumWhenInputValue1ShouldReturn1() {
        int actual = sumCalculator.sum(1);
        int expected = 1;
        assertEquals(expected, actual);
    }


    @Test
    public void testSumWhenInputValue3ShouldReturn6() {
        int actual = sumCalculator.sum(3);
        int expected = 6;
        assertEquals(expected, actual);
    }


    @Test
    public void testSumWhenInputValue0ShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0));
    }
}