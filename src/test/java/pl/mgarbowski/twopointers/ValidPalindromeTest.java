package pl.mgarbowski.twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidPalindromeTest {
    private static final ValidPalindrome p = new ValidPalindrome();


    @Test
    void shouldBePalindrome() {
        assertTrue(p.isPalindrome("kajak"));
    }

    @Test
    void shouldBePalindromeMixedCase() {
        assertTrue(p.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void shouldNotBePalindrome() {
        assertFalse(p.isPalindrome("asdfasfdf"));
    }

    @Test
    void shouldNotBePalindromeContainsDigit() {
        assertFalse(p.isPalindrome("0P"));
    }
}