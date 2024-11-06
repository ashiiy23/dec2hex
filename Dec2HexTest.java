import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Dec2HexTest {
    
    @Test
    public void testValidInput() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        Dec2Hex.main(new String[]{"15"});
        assertTrue(outContent.toString().contains("Hexadecimal representation is: F"));
    }
    
    @Test
    public void testNoInput() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        Dec2Hex.main(new String[]{});
        assertTrue(outContent.toString().contains("Error: No input argument provided"));
    }
    
    @Test
    public void testInvalidInput() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        Dec2Hex.main(new String[]{"abc"});
        assertTrue(outContent.toString().contains("Error: Input must be an integer value"));
    }
    
    @Test
    public void testZeroInput() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        Dec2Hex.main(new String[]{"0"});
        assertTrue(outContent.toString().contains("Hexadecimal representation is: 0"));
    }
}
