package prins.riana.Strings;

/**
 * Created by rianaprins on 2/11/16.
 */
public class RemoveVowels {
    String workString = " ";
    String returnString = "";

    public String star(String input) {
        workString = input.toLowerCase();
        returnString = workString.replaceAll("[aeiou]","*");
        return returnString;
    }
}