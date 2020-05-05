package junit5;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author Liu Xudong
 * @date 2020-05-03 14:51
 */
public class HamcrestAssertionTests {

    @Test
    void assertWithHamcrestMatcher() {
        assertThat(2 + 1, is(equalTo(3)));
    }
}
