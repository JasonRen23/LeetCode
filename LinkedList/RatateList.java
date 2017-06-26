/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return head;
        
        int len = 1;
        ListNode p = head;
        while(p.next != null){
            ++len;
            p = p.next;
        }
        
        k = len - k % len;
        p.next = head;
        for(int i = 0; i < k; ++i){
            p = p.next;
            
        }
        head = p.next;
        p.next = null;
        
        return head; 
        
    }
}