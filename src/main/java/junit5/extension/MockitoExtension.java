package junit5.extension;

import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

/**
 * @author Liu Xudong
 * @date 2020-05-05 12:01
 */
public class MockitoExtension implements BeforeEachCallback {

    @Override
    public void beforeEach(ExtensionContext extensionContext) throws Exception {
        System.out.println("this is ExtensionContext's beforeEach method.");
    }
}
