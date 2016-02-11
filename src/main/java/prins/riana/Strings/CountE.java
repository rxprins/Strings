package prins.riana.Strings;

/**
 * Created by rianaprins on 2/11/16.
 */
public class CountE {

    int eCount = 0;

    public int countEs(String inputWords) {
        for (int i = 0; i < inputWords.length(); i++) {
            if (inputWords.charAt(i) == 'e') {
                eCount++;
            }
        }
        return eCount;
    }
}
