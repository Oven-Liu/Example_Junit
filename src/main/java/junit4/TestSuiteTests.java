package junit4;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author Liu Xudong
 * @date 2020-05-04 12:48
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({TestJunit.class, TestCaseTests.class, TestResultTests.class})
public class TestSuiteTests {

}
