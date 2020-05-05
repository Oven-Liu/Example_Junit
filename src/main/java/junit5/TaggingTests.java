package junit5;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * @author Liu Xudong
 * @date 2020-05-03 15:25
 */
@Tag("fast")
@Tag("model")
public class TaggingTests {

    @Test
    @Tag("taxes")
    void testingTaxCalculation() {
    }

}
