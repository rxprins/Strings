package prins.riana.Strings;

/**
 * Created by rianaprins on 2/11/16.
 */
public class CountAlphanumerics {
    int returnCount = 0;
    public int countChars(String inputWords) {
        for (int i = 0; i < inputWords.length(); i++) {
            if (Character.isLetterOrDigit(inputWords.charAt(i))) {
                returnCount++;
            }
        }
        return returnCount;
    }
}
