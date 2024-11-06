import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Dec2HexTest {

    @Test
    public void testValidDecimalConversion() {
        // Example: Convert 15 to F
        String result = Dec2Hex.convertToHex(15);
        assertEquals("F", result);
    }

    @Test
    public void testInvalidInput() {
        // Example: Convert -1 (or handle an invalid case)
        String result = Dec2Hex.convertToHex(-1);
        assertEquals("Invalid input", result);
    }
}
