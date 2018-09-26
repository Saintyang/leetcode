package Easy;

import java.util.HashMap;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * Tags: Array, Hash Table
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int result = 1;
    }

    /**  思路一：两层循环，复杂度 o(n^2)
     *   思路二：见以下实现，复杂度 o(3n)
     * @param array
     * @param result
     */
    private static int[] twoSum(int[] array,int result){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<array.length;i++){
            if(map.containsKey(array[i])){
                return new int[]{map.get(array[i]), i};

            }else{
                map.put(result-array[i],i);
            }
        }

        return null;
    }
}
