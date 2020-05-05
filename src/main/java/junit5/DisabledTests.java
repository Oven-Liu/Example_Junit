package junit5;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * @author Liu Xudong
 * @date 2020-05-03 15:15
 */
// @Disabled
public class DisabledTests {

    @Disabled
    @Test
    void testWillBeSkipped() {
    }

    @Test
    void testWillBeExecuted() {
    }
}
