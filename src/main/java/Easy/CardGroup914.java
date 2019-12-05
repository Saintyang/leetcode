package Easy;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * In a deck of cards, each card has an integer written on it.
 *
 * Return true if and only if you can choose X >= 2 such that it is possible to split the entire deck into 1 or more groups of cards, where:
 *
 * Each group has exactly X cards.
 * All the cards in each group have the same integer.
 *  
 *
 * Example 1:
 *
 * Input: [1,2,3,4,4,3,2,1]
 * Output: true
 * Explanation: Possible partition [1,1],[2,2],[3,3],[4,4]
 * Example 2:
 *
 * Input: [1,1,1,2,2,2,3,3]
 * Output: false
 * Explanation: No possible partition.
 * Example 3:
 *
 * Input: [1]
 * Output: false
 * Explanation: No possible partition.
 * Example 4:
 *
 * Input: [1,1]
 * Output: true
 * Explanation: Possible partition [1,1]
 * Example 5:
 *
 * Input: [1,1,2,2,2,2]
 * Output: true
 * Explanation: Possible partition [1,1],[2,2],[2,2]
 *
 * Note:
 *
 * 1 <= deck.length <= 10000
 * 0 <= deck[i] < 10000
 *
 *
 *
 * @program: leetcode
 * @description:
 * @author: jason yang
 * @create: 2019-11-21 17:15
 */
//优化方向：统计出现次数不需要排序
public class CardGroup914 {
    public static void main(String[] args) {
        System.out.println(cardGroup(new int[]{1,2,3,4,4,3,2,1}));
    }
    public static boolean cardGroup(int[] deck){
        boolean result = false;
        deck = sort(deck,0,deck.length-1);
        int[] arr1 = getNumberArray(deck);
        int x= arr1[0];
        for(int i=1;i<arr1.length;i++){

            if(arr1[i]!=0){
                x=getMaxCommonDivisor(x,arr1[i]);
            }
        }
        if(x>1){
            result = true;
        }
        return result;
    }
    public static int[] getNumberArray(int[] sortedArray){
        int tmp=0;
        int index=0;
        int[] list = new int[sortedArray.length];
        for(int i=0;i<sortedArray.length-1;i++){
            if(sortedArray[i]==sortedArray[i+1]){
                tmp++;
            }else{
                list[index++] = ++tmp;
                tmp=0;
            }
        }
        list[index]=++tmp;
        return list;
    }
    public static int getMaxCommonDivisor(int a ,int b) {
        int big, small,res;
        if (a > b) {
            big = a;
            small = b;
        } else {
            big = b;
            small = a;
        }
        if (big % small == 0) {
            res=small;
        } else {
            res = getMaxCommonDivisor(big % small, small);
        }
        return res;
    }
    public static int[] sort(int arr[],int start,int end){
        int i = start;
        int j = end;
        if(start>=end){
            return arr;
        }
        boolean isLeftReady = false;
        while(i!=j){
            if(arr[j]<arr[i]){
                int tmp  = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                isLeftReady=!isLeftReady;
            }
            if(isLeftReady){
                i++;
            }else{
                j--;
            }
        }
        i--;j++;
        sort(arr,start,i);
        sort(arr,j,end);
        return arr;
    }
}
