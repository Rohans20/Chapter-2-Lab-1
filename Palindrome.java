
/**
 * Write a description of class Palindrone here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Palindrome
{
    // instance variables - replace the example below with your own
    public String word;
    private boolean isPalindrome;

    /**
     * Constructor for objects of class Palindrone
     */
    public Palindrome(String wd)
    {
        // initialise instance variables
        this.word = wd;
    }

    public boolean testPalindrome() {
        String tempWord = "";
        for(int i = 0; i < word.length(); i++){
            System.out.println(word.substring(i, i+1));
            tempWord += word.substring(i, i+1);
        }
        System.out.println("The word is: " + tempWord);
        if (tempWord == word) {
            isPalindrome = true;
        }
        return isPalindrome;
        
    }
}
