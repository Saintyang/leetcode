package Easy;


import java.util.HashMap;
import java.util.Map;

/**
 * Description
 *
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 *
 * Example 1:
 *
 * Input: "()"
 * Output: true
 * Example 2:
 *
 * Input: "()[]{}"
 * Output: true
 * Example 3:
 *
 * Input: "(]"
 * Output: false
 * Example 4:
 *
 * Input: "([)]"
 * Output: false
 * Example 5:
 *
 * Input: "{[]}"
 * Output: true
 * Tags: Stack, String
 */
public class ValidParentheses {
    public static void main(String[] args) {

    }
    public static boolean isValidParentheses(String str){
        boolean flag = true;
        char[] cs = new char[str.length()+1];
        int top=1;
        char[] strs = str.toCharArray();
        for (char c:strs){
            if(c=='(' || c=='{' || c=='['){
                cs[top++]=c;
            }else if(c==')'&&cs[--top]!='('){
                flag=false;
            }else if(c==']'&&cs[--top]!='['){
                flag=false;
            }else if(c=='}'&&cs[--top]!='{'){
                flag=false;
            }
        }
        if(top!=1){
            flag=false;
        }
       return flag;
    }

}
