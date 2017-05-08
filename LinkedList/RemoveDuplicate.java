public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)return head;
     /*ListNode p = head;
    for(ListNode prev = head, cur = head.next; cur != null; cur = prev.next){
        if(prev.val == cur.val){
            prev.next = cur.next;
        }else{
            prev = cur;
        }
    }
    head.next = deleteDuplicates(head.next);
     return head.next !=null && head.val == head.next.val ? head.next:head;*/
     ListNode p = head;
     while(p != null && p.next != null){
         if(p.next.val == p.val){
             p.next = p.next.next;
         }else{
             p = p.next;
         }
     }
     return head;
    }
}