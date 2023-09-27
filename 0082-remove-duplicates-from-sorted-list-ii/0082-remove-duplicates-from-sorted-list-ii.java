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
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode temp = head;
        ListNode prev = null;
        Map<Integer, Integer> map = new HashMap<>();

        while (temp != null) {
            map.put(temp.val, map.getOrDefault(temp.val, 0) + 1);
            temp = temp.next;
        }

        temp = head;
        while (temp != null && head != null) {
            if (map.get(temp.val) > 1) {
                if (prev == null) {
                    head = head.next;
                    temp = temp.next;
                } else {
                    prev.next = temp.next;
                    temp = temp.next;
                }
            } else {
                prev = temp;
                temp = temp.next;
            }
        }

        return head;
    }
}