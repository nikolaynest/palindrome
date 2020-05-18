package palindrome.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class PalindromeCounterTest {

    @Test
    public void testOneChar() {
        Integer actual = PalindromeCounter.findMaxPalindromeLength("a");
        assertEquals(1, (int) actual);
    }

    @Test
    public void testOneAndTwoChars() {
        Integer actual = PalindromeCounter.findMaxPalindromeLength("a aa");
        assertEquals(2, (int) actual);
    }

    @Test
    public void testOneAndTwoCharsAndThree() {
        Integer actual = PalindromeCounter.findMaxPalindromeLength("a aa baa");
        assertEquals(2, (int) actual);
    }

    @Test
    public void testThree() {
        Integer actual = PalindromeCounter.findMaxPalindromeLength("a aa baa dad");
        assertEquals(3, (int) actual);
    }

    @Test
    public void testManyWords() {
        Integer actual = PalindromeCounter.findMaxPalindromeLength("This is my favorite racecar");
        assertEquals(7, (int) actual);
    }

}
