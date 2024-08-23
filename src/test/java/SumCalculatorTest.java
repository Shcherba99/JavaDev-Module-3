import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {
    private SumCalculator sumCalculator;


    @BeforeEach
    void init() {
        sumCalculator = new SumCalculator();
    }


    @Test
    void testSumWhenInputValue1ShouldReturn1() {
        int result = sumCalculator.sum(1);
        assertEquals(1, result);
    }


    @Test
    void testSumWhenInputValue3ShouldReturn6() {
        int result = sumCalculator.sum(3);
        assertEquals(6, result);
    }


    @Test
    void testSumWhenInputValue0ShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0));
    }
}