package main.pointer;

public class ValidPalindrome {

    /*
     * LeetCode 125 | Valid Palindrome
     * Level: Easy
     * 
     * Link: https://leetcode.com/problems/valid-palindrome/
     * 
     * A phrase is a palindrome if, after converting all uppercase letters into
     * lowercase letters and removing all non-alphanumeric characters, it reads the
     * same forward and backward. Alphanumeric characters include letters and
     * numbers.
     * 
     * Given a string s, return true if it is a palindrome, or false otherwise.
     * 
     * Example 1:
     * Input: s = "A man, a plan, a canal: Panama"
     * Output: true
     * Explanation: "amanaplanacanalpanama" is a palindrome.
     * 
     * Example 2:
     * Input: s = "race a car"
     * Output: false
     * Explanation: "raceacar" is not a palindrome.
     * 
     * Example 3:
     * Input: s = " "
     * Output: true
     * Explanation: s is an empty string "" after removing non-alphanumeric
     * characters.
     * Since an empty string reads the same forward and backward, it is a
     * palindrome.
     * 
     * 
     * Constraints:
     * 1 <= s.length <= 2 * 105
     * s consists only of printable ASCII characters.
     */

    public boolean isPalindrome(String s) {
        char[] characters = s.toLowerCase().toCharArray();
        int left = 0;
        int right = characters.length - 1;

        while (left < right) {
            while (!isAlphanumeric(characters[left]) && left < right) {
                left++;
            }

            while (!isAlphanumeric(characters[right]) && left < right) {
                right--;
            }

            if (characters[left] != characters[right]) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    private static boolean isAlphanumeric(char character) {
        return (character >= 'a' && character <= 'z')
                || (character >= 'A' && character <= 'Z')
                || (character >= '0' && character <= '9');
    }
}
