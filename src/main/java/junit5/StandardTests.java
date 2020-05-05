package junit5;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.fail;

/**
 * @author Liu Xudong
 * @date 2020-05-03 13:00
 */
public class StandardTests {

    @BeforeAll
    static void initAll() {
        System.out.println("beforeAll test for init all");
    }

    @BeforeEach
    void init() {
        System.out.println("beforeEach test for init");
    }

    @Test
    void succeedingTest() {
        System.out.println("succeeding test");
    }

    @Test
    void failingTest() {
        fail("a failing test");
    }

    @Test
    @Disabled("for demonstration purposes")
    void skippedTest() {
        // not executed
        System.out.println("disabled test");
    }

    @AfterEach
    void tearDown() {
        System.out.println("afterEach test for tear down");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("afterAll test for tear down all");
    }
}
