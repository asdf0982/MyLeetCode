/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode start = new ListNode(0);
    ListNode i = start, j = start;
    i.next = head;

    for(int k=0; k<=n; k++)   {
        j = j.next;
    }
    while(j != null) {
        i = i.next;
        j = j.next;
    }
    i.next = i.next.next;
    return start.next;
    }
}