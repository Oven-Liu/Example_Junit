package junit4;

import junit4.entity.MessageUtil;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Liu Xudong
 * @date 2020-05-04 10:45
 */
public class TestJunit {

    String message = "Hello World";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        message = "Hello World";
        assertEquals(message,messageUtil.printMessage());
    }
}
