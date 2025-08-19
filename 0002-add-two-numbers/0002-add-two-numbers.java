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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);
        int carry=0;
        ListNode curr= dummy;
        while(l1!=null || l2!= null || carry!=0){
            int s= (l1== null? 0: l1.val)+(l2==null? 0: l2.val)+carry;
            carry =s/10;
            curr.next=new ListNode(s%10);
            curr=curr.next;
            l1=(l1==null? null:l1.next);
            l2= (l2==null? null:l2.next);
        }
        return dummy.next;
    }
}