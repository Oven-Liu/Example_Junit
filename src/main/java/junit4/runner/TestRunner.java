package junit4.runner;

import junit4.TestResultTests;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author Liu Xudong
 * @date 2020-05-04 10:46
 */
public class TestRunner {

    public static void main(String[] args) {
        // Result result = JUnitCore.runClasses(TestJunit.class);
        // Result result = JUnitCore.runClasses(TestCaseTests.class);
        Result result = JUnitCore.runClasses(TestResultTests.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
