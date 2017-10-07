/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null) return head;
        RandomListNode node = head;
        while(node != null){
            RandomListNode newnode = new RandomListNode(node.label);
            newnode.next = node.next;
            node.next = newnode;
            node = newnode.next;
        }
        node = head;
        while(node != null){
            if(node.random == null){
                node.next.random = null;
            }else{
                node.next.random = node.random.next;
            }
            node = node.next.next;
        }
        
        RandomListNode newhead = head.next;
        node = head;
        while(node != null){
            RandomListNode newNode = node.next;
            node.next = newNode.next;
            if(newNode.next != null){
              newNode.next = newNode.next.next;  
            }
            node = node.next;
        }
        
        return newhead;
        
    }
}
