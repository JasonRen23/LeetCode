//Iterative 

   public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        //Iterative
        
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
           return prev;
}

//Recursive
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode prev = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        
        return prev;
    }