/**
 Problem 4: Largest palindrome product
 ---
 A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

 Find the largest palindrome made from the product of two 3-digit numbers.
 ---

 @author Travis Stratton
 */

public class Problem4 {
    public static void main(String ... args) {
        int largestPalindrome = 0;
        int firstNum = 0;
        int secondNum = 0;
        for (int i = 999; i > 900; i--) {
            for (int k = 999; k > 900; k--) {
                if (isPalindrome(i*k)) {
                    if (largestPalindrome < i*k) {
                        firstNum = i;
                        secondNum = k;
                        largestPalindrome = i * k;
                    }
                }
            }
        }

        System.out.println("Largest palindrome made from two 3-digit numbers (" + firstNum + " * " + secondNum + ") is: " + largestPalindrome);
    }

    public static boolean isPalindrome(int num) {
        String numAsString = "" + num;
        String reversed = (new StringBuffer(numAsString)).reverse().toString();
        return numAsString.equals(reversed);
    }
}
