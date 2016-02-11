package prins.riana.Strings;

import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeTest {
    @Test
    public void isPalindromeTest() {
        String sentence = "I never saw a purple cow";
        String palindrome = "rotavator";
        Palindrome palindromeTest = new Palindrome();
        boolean expected = false;
        assertEquals("palindrome ",expected,palindromeTest.isPalindrome(sentence));
         expected = true;
        assertEquals("palindrome2 ",expected,palindromeTest.isPalindrome(palindrome));
    }
}
