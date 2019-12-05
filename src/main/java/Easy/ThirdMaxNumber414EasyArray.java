package Easy;

/**
 *
 * Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number. The time complexity must be in O(n).
 *
 *
 * Example 1:
 * Input: [3, 2, 1]
 *
 * Output: 1
 *
 * Explanation: The third maximum is 1.
 *
 *
 * Example 2:
 * Input: [1, 2]
 *
 * Output: 2
 *
 * Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
 *
 *
 * Example 3:
 * Input: [2, 2, 3, 1]
 *
 * Output: 1
 *
 * Explanation: Note that the third maximum here means the third maximum distinct number.
 * Both numbers with value 2 are both considered as second maximum.
 *
 *
 *
 * @program: leetcode
 * @description:
 * @author: jason yang
 * @create: 2019-11-25 18:35
 */

public class ThirdMaxNumber414EasyArray {
    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{5,2,4,1,3,6,0}));
    }
    public static int thirdMax(int[] nums){
        if(nums.length<3){
            if(nums.length==1){
                return nums[0];
            }else{
                int a = nums[0]>nums[1]?nums[0]:nums[1];
                return a;
            }
        }
        int max = nums[0];
        int second =0, three=0 ;

        boolean isthreechange= false;
        boolean issecondchange = false;
        for(int i=1;i<nums.length;i++){
            if(!issecondchange){
                if(nums[i]<max){
                second=nums[i];
                issecondchange=true;
                }else if (nums[i]>max){
                    second = max;
                    max = nums[i];
                    issecondchange=true;
                }
                continue;
            }
            if(issecondchange && !isthreechange){
                if(nums[i]>max){
                    three = second;
                    second = max;
                    max = nums[i];
                    isthreechange = true;
                }else if(nums[i]<max){
                    if(nums[i]<second){
                        three = nums[i];
                        isthreechange = true;
                    }else if(nums[i]>second){
                        three = second;
                        second = nums[i];
                        isthreechange = true;
                    }
                }
                continue;
            }

            if(nums[i]>three){
                if(nums[i]>second){
                    if(nums[i]>max){
                        three = second;
                        second = max;
                        max= nums[i];
                    }else if(nums[i]<max){
                        three=second;
                        second = nums[i];
                    }
                }else if(nums[i]<second){
                    three = nums[i];
                }
            }
        }
        if(isthreechange){
            return three;
        }else{
            return max;
        }
    }
}
