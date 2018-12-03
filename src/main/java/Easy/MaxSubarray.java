package Easy;
/**
 * Description
 *
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 *
 * Example:
 *
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * Follow up:
 *
 * If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 *
 * Tags: Array, Divide and Conquer, Dynamic Programming
 * */
public class MaxSubarray {
    public static void main(String[] args) {
        System.out.println(maxSubarray(new int[]{3,6,-2,3,6}));
    }

    public static int maxSubarray(int[] arr){
        int res = 0 , tmpSum = 0;
        for(int i=0;i<arr.length;i++){
            tmpSum = arr[i]+(tmpSum>0?tmpSum:0);
            if(tmpSum>res){
                res = tmpSum;
            }
        }
        return res;
    }

}
