package Easy;

/**
 * Given a linked list, determine if it has a cycle in it.
 *
 * To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.
 *
 *  
 *
 * Example 1:
 *
 * Input: head = [3,2,0,-4], pos = 1
 * Output: true
 * Explanation: There is a cycle in the linked list, where tail connects to the second node.
 *
 *
 * Example 2:
 *
 * Input: head = [1,2], pos = 0
 * Output: true
 * Explanation: There is a cycle in the linked list, where tail connects to the first node.
 *
 *
 * Example 3:
 *
 * Input: head = [1], pos = -1
 * Output: false
 * Explanation: There is no cycle in the linked list.
 *
 *
 *  
 *
 * @program: leetcode
 * @description:
 * @author: jason yang
 * @create: 2019-11-28 19:46
 */

public class LinkedListCycle141EasyLinkedListDoublePointer {
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode slow = head;
        ListNode fast = head;
        boolean even =true;
        while(fast.next!=null){
            fast = fast.next;
            even = !even;
            if(even){
                slow = slow.next;
            }
            if(slow==fast){
                return true;
            }
        }

        return false;
    }
}



