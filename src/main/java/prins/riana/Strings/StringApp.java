package prins.riana.Strings;

/**
 * Created by rianaprins on 2/11/16.
 */
public class StringApp {

    public static void main (String [] args) {
        String workString = "I never saw a purple cow";
        String nextString = "1984 by George Orwell.";
        String palindrome = "rotavator";
        String palindrome2 = "Rise to vote, Sir!";


        CountWords wordsCount = new CountWords();
        System.out.println("Count words output " + wordsCount.countWords(workString));
        CountE eCount = new CountE();
        System.out.println("Count words output " + eCount.countEs(workString));
        CountAlphanumerics countAlpha = new CountAlphanumerics();
        System.out.println("Count words output " + countAlpha.countChars(nextString));
        ReverseString reverseString = new ReverseString();
        System.out.println("Reverse string " + reverseString.reverse(workString));
        Palindrome palindrome1 = new Palindrome();
        System.out.println("Palindrome " + palindrome1.isPalindrome(workString));
        System.out.println("Palindrome2  " + palindrome1.isPalindrome(palindrome));
        MorePalindromes morePalindrome = new MorePalindromes();
        String returnString = morePalindrome.morePalindromes(palindrome2);
        System.out.println("Palindrome3 " + palindrome1.isPalindrome(returnString));
        RemoveVowels removeVowels = new RemoveVowels();
        System.out.println("Remove vowels " + removeVowels.star(workString));
        SpellOut spellout = new SpellOut();
        System.out.println("Spell out " + spellout.spellOut(workString));


    }

}
