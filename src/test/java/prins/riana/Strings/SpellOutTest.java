package prins.riana.Strings;

import org.junit.Test;
import static org.junit.Assert.*;

public class SpellOutTest {
    @Test
    public void spellTest() {
        String workString = "I never saw a purple cow";
        SpellOut spellout = new SpellOut();
        String expected = "I N-E-V-E-R S-A-W A P-U-R-P-L-E C-O-W";
        assertEquals("Spell out ",expected,spellout.spellOut(workString));
    }
}
