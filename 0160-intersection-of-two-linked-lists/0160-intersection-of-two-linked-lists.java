/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
     if (headA == null || headB == null) return null;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        
       
        int countA = 0;
        int countB = 0;
        while (temp1 != null) {
            countA++;
            temp1=temp1.next;
        }
        while (temp2 != null) {
            countB++;
            temp2=temp2.next;
        }
    temp1=headA;
    temp2=headB;

      if(countA>countB){
        for(int i=0;i<countA-countB;i++){
            temp1=temp1.next;
        }
      }
      if(countA<countB){
        for(int i=0;i<countB-countA;i++){
            temp2=temp2.next;
        }
      }



        while(temp1!=null && temp2!=null){
            if(temp1==temp2){
                return temp1;
            }
               temp1=temp1.next;
               temp2=temp2.next;
            

        }

     
return null;
    }
}