package junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Liu Xudong
 * @date 2020-05-03 10:44
 */
public class HelloJunit5 {

    @Test
    public void firstJunit5Test() {
        assertEquals(2, 1 + 1);
    }
}
