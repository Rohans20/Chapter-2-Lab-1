
/**
 * Write a description of class PalidroneDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PalindromeDriver
{
   public static void main(String args[]) {
       Palindrome pablo = new Palindrome("mom");
       System.out.println("the word is:" + pablo.word);
       System.out.println("palindrome:" + pablo.testPalindrome());
    }
}
