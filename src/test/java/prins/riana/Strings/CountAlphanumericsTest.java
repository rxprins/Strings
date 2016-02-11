package prins.riana.Strings;

import org.junit.Test;
import static org.junit.Assert.*;

public class CountAlphanumericsTest {
    @Test
    public void countCharsTest() {
        String inputString = "1984 by George Orwell.";
        CountAlphanumerics countAN = new CountAlphanumerics();
        int expected = 18;
        assertEquals("count chars in String ",expected,countAN.countChars(inputString));
    }
}
