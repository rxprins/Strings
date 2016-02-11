package prins.riana.Strings;

/**
 * Created by rianaprins on 2/11/16.
 */
public class SpellOut {
    String returnString = "";

    public String spellOut(String input) {
        for (int i = 0; i < input.length() -1; i++) {
            int j = i + 1;
            if (input.charAt(i) == ' ') {
                returnString += input.charAt(i);
            }
             if (Character.isLetter(input.charAt(i))) {
                if (Character.isLetter(input.charAt(j))) {
                    returnString += input.charAt(i) + "-";
                } else {
                    returnString += input.charAt(i);
                }
            }
        }
        returnString += input.charAt(input.length() -1);
        return returnString.toUpperCase();
    }
}
