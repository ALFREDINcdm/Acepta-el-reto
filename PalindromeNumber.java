package acepta.el.reto;

/**
 *
 * @author losga https://leetcode.com/problems/palindrome-number/ Given an
 * integer x, return true if x is palindrome integer. An integer is a palindrome
 * when it reads the same backward as forward. For example, 121 is palindrome
 * while 123 is not.
 */
public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPanlidrome(-121));
    }

    public  static boolean isPanlidrome(int x) {
        if (x < 0 || x >= Integer.MAX_VALUE) {
            return false;
        }
        int aux = 0;
        int y = x;
        while (y != 0) {
            int res = y % 10;
            aux = aux * 10 + res;
            y /= 10;
        }
        return aux == x;
    }
    
    
}
