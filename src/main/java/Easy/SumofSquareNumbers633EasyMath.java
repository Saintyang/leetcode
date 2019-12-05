package Easy;

/**
 * Given a non-negative integer c, your task is to decide whether there're two integers a and b such that a2 + b2 = c.
 *
 * Example 1:
 *
 * Input: 5
 * Output: True
 * Explanation: 1 * 1 + 2 * 2 = 5
 *  
 *
 * Example 2:
 *
 * Input: 3
 * Output: False
 *

 *
 * @program: leetcode
 * @description:
 * @author: jason yang
 * @create: 2019-11-27 17:59
 */
//TODO 费马平方和
public class SumofSquareNumbers633EasyMath {
    public static boolean judgeSquareSum(int c) {
        int i=0;
        int j = (int)Math.sqrt(c*1.0);
        while (i<=j){
            int total = i*i+j*j;
            if(total==c){
                return true;
            }else if(total>c){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
    public boolean judgeSquareSum1(int c) {
        for (long a = 0; a * a <= c; a++) {
            double b = Math.sqrt(c - a * a);
            if (b == (int) b)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(judgeSquareSum(2147483646));
    }
}
