package Easy;
/**
 *  Description
 *
 * The count-and-say sequence is the sequence of integers with the first five terms as following:
 *
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 is read off as "one 1" or 11.
 *
 * 11 is read off as "two 1s" or 21.
 *
 * 21 is read off as "one 2, then one 1" or 1211.
 *
 * Given an integer n, generate the nth term of the count-and-say sequence.
 *
 * Note: Each term of the sequence of integers will be represented as a string.
 *
 * Example 1:
 *
 * Input: 1
 * Output: "1"
 * Example 2:
 *
 * Input: 4
 * Output: "1211"
 * Tags: String
 */

public class CountAndSay {
    public static void main(String[] args) {
        for(int i=1;i<10;i++){
            System.out.println(countAndSay(i));
        }
    }
    public static String countAndSay(int index){
        String i="1";
        while(--index>0){
            StringBuilder sb = new StringBuilder();
            int count =1;
            for(int j=1;j<i.length();j++){
                if(i.charAt(j)!=i.charAt(j-1)){
                    sb.append(count).append(i.charAt(j-1));
                    count=1;
                }else{
                    count++;
                }
            }
            i=sb.append(count).append(i.charAt(i.length()-1)).toString();
//            第一次写错了，没考虑最后一位
//            i=sb.toString();
        }
        return i;
    }
}
