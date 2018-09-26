package Easy;
/**
 * Description
 *
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 *
 * You may assume no duplicates in the array.
 *
 * Example 1:
 *
 * Input: [1,3,5,6], 5
 * Output: 2
 * Example 2:
 *
 * Input: [1,3,5,6], 2
 * Output: 1
 * Example 3:
 *
 * Input: [1,3,5,6], 7
 * Output: 4
 * Example 1:
 *
 * Input: [1,3,5,6], 0
 * Output: 0
 * Tags: Array, Binary Search
 */

public class SearchInsertPosition {
    public static void main(String[] args) {

    }
    public static int searchInsertPosition(int[] arr, int value){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int middle = (start+end)/2;
            if(arr[middle]==value){
                return middle;
            }else if(arr[middle]>value){
                end=middle-1;
            }else if(arr[middle]<value){
                start=middle+1;
            }
        }
        return start;
    }


    //O(n) ,too slow
//    public static int searchInsertPosition(int[] arr, int value){
//        int position=arr.length-1;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==value){
//                position=i;
//                return position;
//            }else if(arr[i]>value){
//                position=i;
//                return position;
//            }
//        }
//        return position;
//    }
}
