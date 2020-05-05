package junit4;

import junit4.entity.MessageUtil3;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Liu Xudong
 * @date 2020-05-04 13:20
 */
public class TestExceptionTests {

    String message = "Robert";
    MessageUtil3 messageUtil3 = new MessageUtil3(message);

    @Test(expected = ArithmeticException.class)
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
        messageUtil3.printMessage();
    }

    @Test
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Robert";
        assertEquals(message,messageUtil3.salutationMessage());
    }

}
