package prins.riana.Strings;

/**
 * Created by rianaprins on 2/11/16.
 */
public class ReverseString {
    String reversed = "";

    public String reverse(String inputString) {

        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversed += inputString.charAt(i);
        }
        return reversed;
    }
}