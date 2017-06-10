public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        ListNode prev = dummy;
        for(int i = 0; i < m-1; ++i)//ͨ�������ҵ���ת��ͷ
             prev = prev.next;
        
        ListNode head2 = prev;
        prev = prev.next;
        ListNode cur = prev.next;
        
        for(int j = m; j < n; ++j){//��κ����뵽
            prev.next = cur.next;
            cur.next = head2.next;
            head2.next = cur;
            cur = prev.next;
        }
        
        return dummy.next;
    }
}