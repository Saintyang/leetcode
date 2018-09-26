package Easy;

/**
 * Description
 * <p>
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 * <p>
 * Example 1:
 * <p>
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 * <p>
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * Note:
 * <p>
 * All given inputs are in lowercase letters a-z.
 * <p>
 * Remember : What we need is Prefix!!!  要的是公共前缀！！
 * Tags: String
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {

    }

    public static String longestCommonPrefix(String[] strs) {
        //错误思路：找到最小字符串，和数组中其他元素进行比较找到最长公共字符串 错误原因：What we need is Prefix!!!  要的是公共前缀！！
//        String s = "";
//        String shortest;
//        int len = Integer.MAX_VALUE;
//        for (String ele : strs) {
//            len = Math.min(len, ele.length());
//            if (len == ele.length()) {
//                shortest = ele;
//            }
//        }
        int len = strs.length;
        if (len == 0) return "";
        int minLen = 0x7fffffff;
        for (String str : strs) minLen = Math.min(minLen, str.length());
        for (int j = 0; j < minLen; ++j) {
            for (int i = 1; i < len; ++i) {
                if (strs[0].charAt(j) != strs[i].charAt(j)) {
                    return strs[0].substring(0, j);
                }
            }
        }
        return strs[0].substring(0, minLen);

    }
}
