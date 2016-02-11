package prins.riana.Strings;

import org.junit.Test;
import static org.junit.Assert.*;

public class CountWordsTest {
    @Test
    public void countWordsSpec() {
        String workString = "I never saw a purple cow";
        CountWords wordsCount = new CountWords();
        int expected = 6;
        assertEquals("count words in a String ",expected,wordsCount.countWords(workString));
    }

}
