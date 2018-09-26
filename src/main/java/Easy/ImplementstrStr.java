package Easy;

/**
 * Implement strStr()
 * <p>
 * Description
 * <p>
 * Implement strStr().
 * <p>
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * <p>
 * Example 1:
 * <p>
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 * Example 2:
 * <p>
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 * Clarification:
 * <p>
 * What should we return when needle is an empty string? This is a great question to ask during an interview.
 * <p>
 * For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 * <p>
 * Tags:** Two Pointers, String
 */
public class ImplementstrStr {
    public static void main(String[] args) {
        int result = strStr("aa","aa");
        System.out.println(result);
    }

    public static int strStr(String haystack, String needle) {
        int result = -1;
        if (needle.equals("")) {
            result = 0;
            return result;
        }
        int hl = haystack.length();
        int nl = needle.length();
        if (hl < nl) return result;
        for (int i = 0; ;i++ ) {
            if (i + nl > hl) return result;
            for (int j = 0; ;j++ ) {
                if (j == nl) return i;
                if (haystack.charAt(i + j) != needle.charAt(j)) break;
            }
        }
    }
}

