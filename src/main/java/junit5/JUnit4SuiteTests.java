package junit5;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

/**
 * @author Administrator
 * @date 2020-05-06 12:54
 */
@RunWith(JUnitPlatform.class)
@SelectPackages("example")
public class JUnit4SuiteTests {

}
