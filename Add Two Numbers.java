/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //ListNode Tnode = new ListNode(0);
        int temp = l1.val + l2.val;
        l1.val = temp%10;
        if (l1.next ==null && l2.next == null && temp/10 == 0)
            return l1;
        if (l1.next == null) 
            l1.next =  new ListNode(0);
        if (l2.next == null)
            l2.next = new ListNode(0);

        //if (l2==null)   return l1;
        
        if (temp>=10){
            l1.next.val += 1;
            l1.next = addTwoNumbers(l1.next,l2.next);
            //return l1;
        }
        else{
            l1.next = addTwoNumbers(l1.next,l2.next);
        }
        return l1;
    }
}