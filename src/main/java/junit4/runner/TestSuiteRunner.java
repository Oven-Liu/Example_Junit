package junit4.runner;

import junit4.TestSuiteTests;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author Liu Xudong
 * @date 2020-05-04 11:46
 */
public class TestSuiteRunner {

    public static void main(String[] a) {
        // add the test's in the suite
        // TestSuite suite = new TestSuite(TestJunit.class, TestResultTests.class, TestCaseTests.class );
        // TestResult result = new TestResult();
        // suite.run(result);
        // System.out.println("Number of test cases = " + result.runCount());

        Result result = JUnitCore.runClasses(TestSuiteTests.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
