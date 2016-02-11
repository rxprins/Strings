package prins.riana.Strings;
import org.junit.Test;
import static org.junit.Assert.*;

public class RemoveVowelsTest {
    @Test
    public void starTest() {
        String workString = "I never saw a purple cow";
        RemoveVowels removeVowels = new RemoveVowels();
        String expected = "* n*v*r s*w * p*rpl* c*w";
        assertEquals("remove vowels ",expected,removeVowels.star(workString));
    }
}
