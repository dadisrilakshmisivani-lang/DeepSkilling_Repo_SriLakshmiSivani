import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsDemoTest {

    AssertionsDemo demo = new AssertionsDemo();

    @Test
    public void testAssertions() {

        // assertEquals
        assertEquals(5, demo.add(2, 3));

        // assertTrue
        assertTrue(demo.isEven(4));

        // assertFalse
        assertFalse(demo.isEven(5));

        // assertNotNull
        assertNotNull(demo.getName());

        // assertNull
        String str = null;
        assertNull(str);
    }
}