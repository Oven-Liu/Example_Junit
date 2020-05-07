package junit5.intellij.jnuit.plug;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntegerCalculateTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getAvg() {
        // IntegerCalculate mock = mock(IntegerCalculate.class);
        IntegerCalculate mock = new IntegerCalculate();
        // int avg = mock.getAvg(1, 3);
        int sum = mock.getSum(1, 3);
        // assertEquals(2, avg, "计算不正确");
        assertEquals(4, sum, "计算不正确");
    }
    @Test
    void testCoverage() {

    }
}