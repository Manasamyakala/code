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
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        List<ListNode> t=new ArrayList<>();
        ListNode cur=head;
        while(cur!=null)
        {
            t.add(cur);
            cur=cur.next;
        }
        int ridx=t.size()-n;
        if(ridx==0)
        {
            return head.next;
        }
        t.get(ridx-1).next=t.get(ridx).next;
        return head;

    }
}
