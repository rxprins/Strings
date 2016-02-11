package prins.riana.Strings;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReverseStringTest {
    @Test
    public void reverseTest() {
        String workString = "I never saw a purple cow";
        ReverseString reverseString = new ReverseString();
        String expected = "woc elprup a was reven I";
        assertEquals("reverse string ",expected,reverseString.reverse(workString));

    }
}
