/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
    
        
       while(prev.next != null && prev.next.next != null){
            ListNode cur = prev.next;
            ListNode back = prev.next.next;
            
            prev.next = back;
            cur.next = back.next;
            back.next = cur;
            
            prev = cur;
       
         
        }
        return dummy.next;
    }
}