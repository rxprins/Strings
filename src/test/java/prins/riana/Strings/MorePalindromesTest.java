package prins.riana.Strings;

import org.junit.Test;
import static org.junit.Assert.*;

public class MorePalindromesTest {
    @Test
    public void morePalindromesSpec() {
        String workString = "I never saw a purple cow";
        String palindrome2 = "Rise to vote, Sir!";
        Palindrome palindrome = new Palindrome();
        MorePalindromes morePalindrome = new MorePalindromes();
        String returnString = morePalindrome.morePalindromes(palindrome2);
        boolean expected = true;
        assertEquals("more palindromes",expected,palindrome.isPalindrome(returnString));
    }
}
