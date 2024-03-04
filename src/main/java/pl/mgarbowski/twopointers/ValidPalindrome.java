package pl.mgarbowski.twopointers;

/**
 * <a href="https://leetcode.com/problems/valid-palindrome/">125. Valid Palindrome</a>
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            var left = getLowercaseAt(s, i);
            while (isInvalidCharacter(left) && i < j) {
                i++;
                left = getLowercaseAt(s, i);
            }
            var right = getLowercaseAt(s, j);
            while (isInvalidCharacter(right) && i < j) {
                j--;
                right = getLowercaseAt(s, j);
            }

            if (left != right) {
                return false;
            }

            i++;
            j--;
        }
        return true;
    }

    private boolean isInvalidCharacter(char character) {
        return !Character.isAlphabetic(character) && !Character.isDigit(character);
    }

    private char getLowercaseAt(String s, int idx) {
        return Character.toLowerCase(s.charAt(idx));
    }
}
