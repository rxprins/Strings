package prins.riana.Strings;

public class MorePalindromes {
    String palindromeReturn = "";

    public String morePalindromes(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetterOrDigit(input.charAt(i))) {
                palindromeReturn += input.charAt(i);
            }
        }
        return palindromeReturn.toLowerCase();
    }
}

