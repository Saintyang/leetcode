package Easy;

/**
 * Description
 *
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 * Example 1:
 *
 * Input: 123
 * Output:  321
 * Example 2:
 *
 * Input: -123
 * Output: -321
 * Example 3:
 *
 * Input: 120
 * Output: 21
 *
 * Note:
 *
 * Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range.
 * For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 *
 * Tags: Math
 */
public class ReverseInteger {
    public static void main(String[] args) {
        Integer num =123;
        System.out.println(reverseInteger(num));
    }
    //思路一：
    public static int reverseInteger(Integer num){
        long res = 0L;
        for(;num!=0;num/=10){
            res = res*10+num%10;
        }
        return (res>Integer.MAX_VALUE||res<Integer.MIN_VALUE)?0:(int)res;

    }
    //思路二：做字符串处理
    public int reverse(int x) {
        if (x < (-2147483648) || x > (2147483647))
            return 0;
        if (x == 0)
            return 0;
        while ((x % 10) == 0) {
            x = x / 10;
        }
        String str = Integer.toString(x);
        if ('-' == str.charAt(0)) {
            String s = str.substring(1, str.length());
            String ss = reverse2(s);

            long res = Long.parseLong(ss);
            if (res > Integer.MAX_VALUE)
                return 0;

            return -(int) res;
        } else {
            String ss = reverse2(str);
            long res = Long.parseLong(ss);
            if (res > 2147483647)
                return 0;
            return (int) res;
        }
    }
    public String reverse2(String str){//字符串反转函数
        char[] arr = str.toCharArray();
        int len = arr.length;
        int start = 0,end = len-1;
        for(int i=0;i<(len/2);i++){
            char tmp = arr[start+i];
            arr[start+i] = arr[end-i];
            arr[end-i] = tmp;
        }
        str = String.valueOf(arr);
        return str;
    }

}
