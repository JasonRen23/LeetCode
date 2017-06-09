public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        int carry = 0;//��λ
        ListNode prev = dummy;
        ListNode p1 = l1, p2 = l2; //����ָ���ʼ��
        while( p1 != null || p2 != null){
         final int a = (p1 == null ? 0 : p1.val);
         final int b = (p2 == null ? 0 : p2.val);   
         
         final int value = (a + b + carry) % 10; //����֮�͸�λ�ϵ�����
         carry = (a + b + carry) / 10; //��λ�ϵĽ�λ
         prev.next = new ListNode(value);
         
        prev = prev.next;  
         if(p1 != null)  p1 = p1.next;
         if(p2 != null) p2 = p2.next;
      
        }
            
        //��������λ����һλ
       if(carry > 0){
           prev.next = new ListNode(1);
       } 
       
       return dummy.next;
    }
}