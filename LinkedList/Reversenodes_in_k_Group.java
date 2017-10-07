/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null || k < 2) return head;
        
        ListNode next_head = head;
        for(int i = 0; i < k; ++i){
            if(next_head != null){
                next_head = next_head.next;
            }else{
                return head;
            }
        }
        
        ListNode new_next_head = reverseKGroup(next_head, k);
        ListNode prev = null, cur = head;
        while(cur != next_head){
            ListNode next = cur.next;
            cur.next = prev != null ? prev : new_next_head;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}
