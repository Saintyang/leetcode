package Easy;

/**
 * Length of Last Word
 *
 * Description
 *
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 *
 * If the last word does not exist, return 0.
 *
 * Note: A word is defined as a character sequence consists of non-space characters only.
 *
 * Example:
 *
 * Input: "Hello World"
 * Output: 5
 * Tags: String
 */
public class LengthofLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("asdfafsdav"));
    }

    public static int lengthOfLastWord(String s){
        int res = s.length();
        int len = s.length();
        char[] sc = s.toCharArray();
        for(int i=len;i>0;i--){
            if(s.charAt(i-1)==' '){
                res = len -i;
                break;
            }
        }
        return res;
    }

}
