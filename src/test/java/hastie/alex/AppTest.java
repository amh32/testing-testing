package hastie.alex;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals(1, 1);
    }

    @Test
    void basicMathTest() {
        App testApp = new App();
        testApp.mathTest(testApp.a,testApp.b);
        assertEquals(21, testApp.c);
    }
}
