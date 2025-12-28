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
    public ListNode swapNodes(ListNode head, int k) {
        int count = 0;
        ListNode temp = head;
        ListNode f = head;
        ListNode s = head;

        for(int i=1;i<k;i++){
            f=f.next;
        }
        temp=f.next;
        while(temp!=null){
            s=s.next;
            temp=temp.next;
        }

        int swap=s.val;
        s.val=f.val;
        f.val=swap;
        return head;
    }
}