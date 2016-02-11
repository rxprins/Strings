package prins.riana.Strings;

/**
 * Created by rianaprins on 2/11/16.
 */
public class CountWords extends StringApp {
    int returnCount = 1;

    public int countWords(String inputWords) {
        for (int i = 0; i < inputWords.length(); i++) {
            if (inputWords.charAt(i) == ' ') {
                returnCount++;
            }
        }
        return returnCount;
    }
}