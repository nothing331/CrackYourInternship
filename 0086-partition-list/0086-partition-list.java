/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        // In this question we will divide the array into 2 parts on less than x and other greater than or equal to and then we will connect both 
        if(head == null) return head;
        ListNode smallhead = new ListNode();
        ListNode smalltemp = smallhead;

        ListNode greathead = new ListNode();
        ListNode greattemp = greathead;

        ListNode curr = head;
        while(curr!=null){
            if(curr.val<x){
                smalltemp.next=curr;
                smalltemp=smalltemp.next;
            }else{
                greattemp.next=curr;
                greattemp=greattemp.next;
            }
            curr=curr.next;
        }
        greattemp.next=null;
        smalltemp.next=greathead.next;
        head = smallhead.next;
        return head;
    }
}