package Easy;

import java.util.Arrays;

/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 *
 * Example 1:
 *
 * Input: [1,2,3,4,5,6,7] and k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * Example 2:
 *
 * Input: [-1,-100,3,99] and k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 * Note:
 *
 * Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
 * Could you do it in-place with O(1) extra space?
 *
 *
 *rotate	英[rəʊˈteɪt]  美[ˈroʊteɪt]
 * v.	(使) 旋转，转动; (工作) 由…轮值; (人员) 轮换，轮值;
 *  [例句]The Earth rotates round the sun  地球围绕太阳转。
 *
 * @program: leetcode
 * @description:
 * @author: jason yang
 * @create: 2019-12-02 16:44
 */

public class RotateArray189EasyArray {
    public static void main(String[] args) {
        int i = 12;
        i %= 36;
        System.out.println(i);
//        rotate1(new int[]{1,2},1);
    }
    // not O(1)
    public static void rotate(int[] nums, int k) {
        if(k>nums.length){return ;}
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int tmp=i+k;
            if(tmp>=nums.length){
                tmp = tmp-nums.length;
            }
            res[tmp] = nums[i];
        }
        System.out.println(Arrays.toString(res));
    }

    public static void rotate1(int[] nums, int k) {
        // 化简k为小于数组长度的值  k等效于 k+ nums.length
        k %= nums.length;
        //链表反转，找到之前index=0的数据现在应该在的位置，分成两个链表再次反转
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    static void reverse(int[] arr,int start,int end){
        while (start<end){
            int tmp = arr[end];
            arr[end--] = arr[start];
            arr[start++] = tmp;
        }
    }
}
