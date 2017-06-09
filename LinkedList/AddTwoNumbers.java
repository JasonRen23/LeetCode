public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        int carry = 0;//进位
        ListNode prev = dummy;
        ListNode p1 = l1, p2 = l2; //迭代指针初始化
        while( p1 != null || p2 != null){
         final int a = (p1 == null ? 0 : p1.val);
         final int b = (p2 == null ? 0 : p2.val);   
         
         final int value = (a + b + carry) % 10; //两数之和各位上的数字
         carry = (a + b + carry) / 10; //各位上的进位
         prev.next = new ListNode(value);
         
        prev = prev.next;  
         if(p1 != null)  p1 = p1.next;
         if(p2 != null) p2 = p2.next;
      
        }
            
        //若最后还需进位，则补一位
       if(carry > 0){
           prev.next = new ListNode(1);
       } 
       
       return dummy.next;
    }
}