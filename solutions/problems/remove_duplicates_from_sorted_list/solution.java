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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
        return head;
        ListNode curr=head;
        ListNode prev=curr.next;
        while(prev !=null)
        {
            if(prev.val==curr.val)
            {
                curr.next=prev.next;
            }
            else
            {
                curr=curr.next;
            }
            prev=curr.next;
        }
        return head;
    }
}