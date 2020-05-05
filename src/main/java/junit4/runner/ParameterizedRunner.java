package junit4.runner;

import junit4.ParameterizedTests;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author Liu Xudong
 * @date 2020-05-04 13:33
 */
public class ParameterizedRunner {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(ParameterizedTests.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
