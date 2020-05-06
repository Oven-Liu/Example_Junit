package junit5;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.fail;

/**
 * @author Administrator
 * @date 2020-05-06 11:56
 */
@RunWith(JUnitPlatform.class)
public class JUnit4ClassTests {

    @Test
    void succeedingTest() {
        /* no-op */
    }

    @Test
    void failingTest() {
        fail("Failing for failing's sake.");
    }
}
