package junit4;

import junit4.entity.MessageUtil2;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Liu Xudong
 * @date 2020-05-04 12:59
 */
public class TestTimeoutTests {

    String message = "Robert";
    MessageUtil2 messageUtil2 = new MessageUtil2(message);

    @Test(timeout=1000)
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
        messageUtil2.printMessage();
    }

    @Test
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Robert";
        assertEquals(message, messageUtil2.salutationMessage());
    }
}
