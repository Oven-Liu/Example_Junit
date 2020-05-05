package junit4.runner;

import junit4.TestExceptionTests;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author Liu Xudong
 * @date 2020-05-04 13:20
 */
public class TestExceptionRunner {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestExceptionTests.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
