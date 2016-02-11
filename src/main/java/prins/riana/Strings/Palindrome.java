package prins.riana.Strings;

import java.util.*;

/**
 * Created by rianaprins on 2/11/16.
 */
public class Palindrome extends StringApp {

    public boolean isPalindrome(String input) {
        boolean isPal = false;
        int j = input.length() - 1;
        float stringHalfed = input.length() / 2;
        int stringHalf = Math.round(stringHalfed);
        for (int i = 0; i < stringHalf; i++, j--) {
            if (input.charAt(i) == input.charAt(j)) {
                isPal = true;
            } else {
                isPal = false;
            }
        }
     return isPal;
    }
}

