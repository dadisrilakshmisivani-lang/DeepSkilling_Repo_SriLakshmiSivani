import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorAAATest {

    private Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
        System.out.println("Setup executed");
    }

    @After
    public void tearDown() {
        calc = null;
        System.out.println("Teardown executed");
    }

    @Test
    public void testAdd() {

        // Arrange
        int a = 10;
        int b = 20;

        // Act
        int result = calc.add(a, b);

        // Assert
        assertEquals(30, result);
    }
} 
