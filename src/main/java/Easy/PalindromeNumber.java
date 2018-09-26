package Easy;

/**
 * Description
 *
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 *
 * Example 1:
 *
 * Input: 121
 * Output: true
 * Example 2:
 *
 * Input: -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 *
 * Input: 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * Follow up:
 *
 * Coud you solve it without converting the integer to a string?
 *
 * Tags: Math
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 12321;

    }
    private static boolean isPalindrome(int num){
        boolean flag = false;
        if(num<0)
            return flag;
        int number = ReverseInteger.reverseInteger(num);
        if(number==num){
            flag = true;
        }
        return flag;
    }
    //12321 比到3就可以了。 注意10010的处理
    public boolean isPalindrome2(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) return false;
        int halfReverseX = 0;
        while (x > halfReverseX) {
            halfReverseX = halfReverseX * 10 + x % 10;
            x /= 10;
        }
        return halfReverseX == x || halfReverseX / 10 == x;
    }
}
