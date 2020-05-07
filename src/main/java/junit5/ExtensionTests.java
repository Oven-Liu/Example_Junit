package junit5;

import junit5.extension.MockitoExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

/**
 * @author Administrator
 * @date 2020-05-06 14:47
 */
@ExtendWith(MockitoExtension.class)
// @ExtendWith({ FooExtension.class, BarExtension.class })
// @ExtendWith(FooExtension.class)
// @ExtendWith(BarExtension.class)
public class ExtensionTests {

    // @ExtendWith(MockitoExtension.class)
    @Test
    void mockTest() {
        // ...
    }
}
