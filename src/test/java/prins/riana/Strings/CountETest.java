package prins.riana.Strings;

import org.junit.Test;
import static org.junit.Assert.*;

public class CountETest {
    @Test
    public void countETest() {
        String workString = "I never saw a purple cow";
        CountE countE = new CountE();
        int expected = 3;
        assertEquals("count e's in String ",expected,countE.countEs(workString));
    }
}
